<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>教师获奖信息管理</title>

<script type="text/javascript">

		//采购药品删除
		function awardstudelete(){
			_confirm('您确定要删除选择的获奖信息吗?',null,
					  function(){
								
						var indexs = [];//选择记录的序号
						var rows = $('#awardstulist').datagrid('getSelections');
						for(var i=0;i<rows.length;i++){
							var index=$('#awardstulist').datagrid('getRowIndex',rows[i]);
							indexs.push(index);
						}
						if(rows.length>0){
							$("#indexs").val(indexs.join(','));
							//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
							$("#awardstuqueryForm").attr("action",'${baseurl}awardstu/awardstudelsubmit.action');
							jquerySubByFId('awardstuqueryForm', awardstudelete_callback, null);
						}else{
							alert_warn("请选择要删除的获奖信息");
						}
					  }
					)
		}
		function awardstudelete_callback(data) {
			var result = getCallbackData(data);
			_alert(result);
			queryawardstu();
		}





	//datagrid列定义
	var columns_v = [ [{
		checkbox:true
	},{
		field : 'said',//对应json中的key
		hidden : true,//隐藏
		formatter: function(value,row,index){
			return '<input type="hidden" name="awardStuCustoms['+index+'].said" value="'+value+'" />';
		}
	},{
		field : 'stuxm',//对应json中的key
		title : '获奖人',
		width : 120
	},{
		field : 'jxmc',//对应json中的key
		title : '奖项名称',
		width : 120
	}, {
		field : 'bfdw',//对应json中的key
		title : '颁发单位 ',
		width : 120
	}, {
		field : 'hjsjstr',//对应json中的key
		title : '获奖时间',
		width : 120
	}, {
		field : 'hjjbmc',//对应json中的key
		title : '获奖级别',
		width : 120
	}, {
		field : 'teaxm',//对应json中的key
		title : '获奖指导',
		width : 120
	}, {
		field : 'shztmc',//对应json中的key
		title : '审核状态',
		width : 120
	}, {
		field : 'fj',//对应json中的key
		title : '附件',
		width : 120,
		formatter: function(value,row,index){
			if(value!=null&&value!=""){
				return '<a href="'+value+'">附件（点击下载）</a>';
			}
			return "无附件";
		}
	} , {
		field : 'opt1',//对应json中的key
		title : '操作',
		width : 120,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:deleteaward('"+row.said+"')>删除</a>&nbsp;&nbsp;&nbsp;<a href=javascript:editaward('"+row.said+"')>编辑</a>"
		}
	} 
	
	
	
	] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加获奖信息", 800, 400, '${baseurl}awardstu/addawardstu.action');
		}
	},{
		id : 'btndel',
		text : '批量刪除',
		iconCls : 'icon-remove',
		handler : 'awardstudelete'
	}
	];

	//加载datagrid

	$(function() {
		$('#awardstulist').datagrid({
			title : '获奖信息查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}awardstu/awardstulist_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'said',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			checkbox:true,
			pageList:[15,30,50],
			toolbar : toolbar_v
		});
	});
	
	//查询方法
	function queryawardstu(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#awardstuqueryForm").serializeJson();
		$('#awardstulist').datagrid('load',formdata);
	}
	
	//刪除用戶
	function deleteaward(said){
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){
			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(said);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('awardstudeleteform',awarddel_callback,null,"json");
			
			
		});
	}
	
	//删除用户的回调
	function awarddel_callback(data){
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type=data.resultInfo.type;
		if(type==1){
			//成功结果
			//重新加载 datagrid
			queryawardstu();
		}
	}
	
	
	//修改用戶
	function editaward(said){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改获奖信息", 800, 400, '${baseurl}awardstu/editawardstu.action?said='+said);
	}
</script>

</head>
<body>

	<!-- html的静态布局 -->
  <form id="awardstuqueryForm" method="post">
  <input type="hidden" id="indexs" name="indexs"/>
	<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left"> 获奖人编号：</td>
						<td><input type="text" id="stubh" name="awardStuCustom.stubh"  value="${awardStuCustom.stubh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">获奖人姓名：</TD>
						<td ><input type="text" id="stuxm" name="awardStuCustom.stuxm"  value="${awardStuCustom.stuxm}"/></td>
						
						<TD class="left"> 辅导教师编号：</td>
						<td><input type="text" id="teabh" name="awardStuCustom.teabh"  value="${awardStuCustom.teabh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">辅导教师姓名：</TD>
						<td ><input type="text" id="teaxm" name="awardStuCustom.teaxm"  value="${awardStuCustom.teaxm}"/></td>
						
						
						
						
					</TR>
					<TR>
					
					 <!-- 自行添加 -->
						<TD class="left">颁发单位：</TD>
						<td >
							<input type="text" id="bfdw" name="awardStuCustom.bfdw"  value="${awardStuCustom.bfdw}"/>
						</td>
						<TD class="left">获奖时间：</TD>
						<td >
						<INPUT id="awardStuCustom.hjsj_start"
								name="awardStuCustom.hjsj_start"   value="<fmt:formatDate value="${awardStuCustom.hjsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="awardStuCustom.hjsj_end"
								name="awardStuCustom.hjsj_end"   value="<fmt:formatDate value="${awardStuCustom.hjsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							
						</td>
						<!-- 自行添加 -->
						<TD class="left">审核状态：</TD>
						<td >
						<select name="awardStuCustom.shzt" id="awardStuCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${awardStuCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						<!-- 自行添加 -->
						<TD class="left">获奖级别：</TD>
						<td >	
						<select name="awardStuCustom.hjjb" id="awardStuCustom.hjjb">
									
						<option value="">请选择</option>
						<c:forEach items="${hjjb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${awardStuCustom.hjjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
					
						<a id="btn" href="#" onclick="queryawardstu()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="awardstulist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
<form id="awardstudeleteform" action="${baseurl}awardstu/deleteawardstu_submit.action" method="post">
  <input type="hidden" id="delete_id" name="said"/>
</form>

</body>
</html>


