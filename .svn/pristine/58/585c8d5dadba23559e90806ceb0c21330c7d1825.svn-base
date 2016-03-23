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
<title>教师项目信息管理</title>

<script type="text/javascript">


		function prodelete(){
			_confirm('您确定要删除选择的项目信息吗?',null,
					  function(){
								
						var indexs = [];//选择记录的序号
						var rows = $('#prolist').datagrid('getSelections');
						for(var i=0;i<rows.length;i++){
							var index=$('#prolist').datagrid('getRowIndex',rows[i]);
							indexs.push(index);
						}
						if(rows.length>0){
							$("#indexs").val(indexs.join(','));
							//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
							$("#proqueryForm").attr("action",'${baseurl}project/projectdelete_submit.action');
							jquerySubByFId('proqueryForm', prodelete_callback, null);
						}else{
							alert_warn("请选择要删除的项目信息");
						}
					  }
					)
		}
		function prodelete_callback(data) {
			var result = getCallbackData(data);
			_alert(result);
			queryawardtea();
		}





	//datagrid列定义
	var columns_v = [ [{
		checkbox:true
	},{
		field : 'prid',//对应json中的key
		hidden : true,//隐藏
		formatter: function(value,row,index){
			return '<input type="hidden" name="projectCustoms['+index+'].prid" value="'+value+'" />';
		}
	},{
		field : 'xmmc',//对应json中的key
		title : '项目名称',
		width : 120
	},{
		field : 'xmbh',//对应json中的key
		title : '项目编号',
		width : 120
	}, {
		field : 'xmjbmc',//对应json中的key
		title : '项目级别 ',
		width : 70
	}, {
		field : 'pzdw',//对应json中的key
		title : '批准单位',
		width : 120
	}, {
		field : 'xmlxmc',//对应json中的key
		title : '项目类型',
		width : 70
	}, {
		field : 'lxsjstr',//对应json中的key
		title : '立项时间',
		width : 70
	}, {
		field : 'jxsjstr',//对应json中的key
		title : '结项时间',
		width : 70
	}, {
		field : 'teachers',//对应json中的key
		title : '参与人员',
		width : 120,
		formatter: function(value,row,index){
			var str="";
			for(var i=0;i<value.length;i++){
				str+=value[i].smwcmc+":"+value[i].xm+"</br>";
			}
			return str;
		}
	}, {
		field : 'shztmc',//对应json中的key
		title : '审核状态',
		width : 70
	}, {
		field : 'fj',//对应json中的key
		title : '附件',
		width : 70,
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
			return "<a href=javascript:deletepro('"+row.prid+"')>删除</a>&nbsp;&nbsp;&nbsp;<a href=javascript:editpro('"+row.prid+"')>编辑</a>"
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
			createmodalwindow("添加项目信息", 900, 400, '${baseurl}project/addproject.action');
		}
	},{
		id : 'btndel',
		text : '批量刪除',
		iconCls : 'icon-remove',
		handler : 'prodelete'
	}
	];

	//加载datagrid

	$(function() {
		$('#prolist').datagrid({
			title : '项目信息查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}project/projectlist_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'prid',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
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
	function querypro(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#proqueryForm").serializeJson();
		$('#prolist').datagrid('load',formdata);
	}
	
	//刪除用戶
	function deletepro(taid){
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){
			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(taid);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('prodeleteform',deletepro_callback,null,"json");
			
			
		});
	}
	
	//删除用户的回调
	function deletepro_callback(data){
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type=data.resultInfo.type;
		if(type==1){
			//成功结果
			//重新加载 datagrid
			querypro();
		}
	}
	
	
	//修改用戶
	function editpro(prid){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改项目信息", 900, 400, '${baseurl}project/editproject.action?prid='+prid);
	}
</script>

</head>
<body>

	<!-- html的静态布局 -->
  <form id="proqueryForm" method="post">
  <input type="hidden" id="indexs" name="indexs"/>
	<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left"> 参与人编号：</td>
						<td><input type="text" id="teabh" name="teacherCustom.bh"  value="${teacherCustom.bh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">参与人姓名：</TD>
						<td ><input type="text" id="teaxm" name="teacherCustom.xm"  value="${teacherCustom.xm}"/></td>
						
						
						 <!-- 自行添加 -->
						<TD class="left">批准单位：</TD>
						<td >
							<input type="text" id="bfdw" name="projectCustom.pzdw"  value="${projectCustom.pzdw}"/>
						</td>
						
					
						<!-- 自行添加 -->
						<TD class="left">项目级别：</TD>
						<td >	
						<select name="projectCustom.xmjb" id="projectCustom.xmjb">
									
						<option value="">请选择</option>
						<c:forEach items="${xmjb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${projectCustom.xmjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						
					</TR>
					<TR>
					
					<!-- 自行添加 -->
						<TD class="left">参与人署名位次：</TD>
						<td >	
						<select name="teacherCustom.smwc" id="teacherCustom.smwc">
									
						<option value="">请选择</option>
						<c:forEach items="${smwc_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.smwc==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
					
					<TD class="left">立项时间：</TD>
						<td >
						<INPUT id="projectCustom.lxsj_start"
								name="projectCustom.lxsj_start"   value="<fmt:formatDate value="${projectCustom.lxsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="projectCustom.lxsj_end"
								name="projectCustom.lxsj_end"   value="<fmt:formatDate value="${projectCustom.lxsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							
						</td>
						<TD class="left">结项时间：</TD>
						<td >
						<INPUT id="projectCustom.jxsj_start"
								name="projectCustom.jxsj_start"   value="<fmt:formatDate value="${projectCustom.jxsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="projectCustom.lxsj_end"
								name="projectCustom.lxsj_end"   value="<fmt:formatDate value="${projectCustom.lxsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							</td>
						
						<!-- 自行添加 -->
						<TD class="left">审核状态：</TD>
						<td >
						<select name="projectCustom.shzt" id="projectCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${projectCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
					
						<a id="btn" href="#" onclick="querypro()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="prolist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
<form id="prodeleteform" action="${baseurl}project/deleteproject_submit.action" method="post">
  <input type="hidden" id="delete_id" name="prid"/>
</form>

</body>
</html>


