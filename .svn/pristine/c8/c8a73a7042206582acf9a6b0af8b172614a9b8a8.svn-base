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
<title>课程资源文件管理</title>

<script type="text/javascript">

		//采购药品删除
		function coufiledelete(){
			_confirm('您确定要删除选择的课程资源文件吗?',null,
					  function(){
								
						var indexs = [];//选择记录的序号
						var rows = $('#coufileslist').datagrid('getSelections');
						for(var i=0;i<rows.length;i++){
							var index=$('#coufileslist').datagrid('getRowIndex',rows[i]);
							indexs.push(index);
						}
						if(rows.length>0){
							$("#indexs").val(indexs.join(','));
							//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
							$("#sysuserqueryForm").attr("action",'${baseurl}course/coufiles/coufiledel_submit.action');
							jquerySubByFId('sysuserqueryForm', coufiledelete_callback, null);
						}else{
							alert_warn("请选择要删除的课程资源文件");
						}
					  }
					)
		}
		function coufiledelete_callback(data) {
			var result = getCallbackData(data);
			_alert(result);
			queryuser();
		}





	//datagrid列定义
	var columns_v = [ [{
		checkbox:true
	},{
		field : 'sfid',//对应json中的key
		hidden : true,//隐藏
		formatter: function(value,row,index){
			//gysypmls对应action接收对象中list的名称，[]括号中是从0开始序号,id是list中对象属性
			return '<input type="hidden" name="sourcefileCustoms['+index+'].sfid" value="'+value+'" />';
		}
	},{
		field : 'zywjmc',//对应json中的key
		title : '资源文件名称',
		width : 150
	},{
		field : 'zywjlxmc',//对应json中的key
		title : '资源文件类型',
		width : 85
	}, {
		field : 'wjdx_',//对应json中的key
		title : '文件大小',
		width : 80
	},{
		field : 'xzcs',//对应json中的key
		title : '下载次数',
		width : 80
	},{
		field : 'scsjstr',//对应json中的key
		title : '上传时间',
		width : 80
	},{
		field : 'scrxm',//对应json中的key
		title : '上传人',
		width : 80
	},{
		field : 'opt1',//对应json中的key
		title : '操作',
		width : 150,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:downloadcoufile('"+row.sfid+"')>下载</a>&nbsp;&nbsp;&nbsp;<a href=javascript:editcoufile('"+row.sfid+"')>编辑</a>&nbsp;&nbsp;&nbsp;<a href=javascript:deletecoufile('"+row.sfid+"')>删除</a>"
		}
	} 
	
	
	
	] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加课程资源文件',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加课程资源", 666, 300, '${baseurl}course/coufiles/addcoufile.action?cid=${cid}');
		}
	},{
		id : 'btndel',
		text : '批量刪除',
		iconCls : 'icon-remove',
		handler : 'coufiledelete'
	}
	];

	//加载datagrid

	$(function() {
		$('#coufileslist').datagrid({
			title : '课程资源文件列表',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}course/coufiles/coufileslist_result.action?cid=${cid}',//加载数据的连接，引连接请求过来是json数据
			idField : 'sfid',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			checkbox:true,
			pageList:[12,30,50],
			toolbar : toolbar_v
		});
	});
	
	//查询方法
	function queryuser(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#sysuserqueryForm").serializeJson();
		$('#coufileslist').datagrid('load',formdata);
	}
	
	//刪除用戶
	function deletecoufile(sfid){
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){

			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(sfid);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('sysuserdeleteform',deletecoufile_callback,null,"json");
			
			
		});
	}
	
	//删除用户的回调
	function deletecoufile_callback(data){
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type=data.resultInfo.type;
		if(type==1){
			//成功结果
			//重新加载 datagrid
			queryuser();
		}
	}
	
	
 	function downloadcoufile(sfid){
 		
 		$("#delete_id").val(sfid);
 		
 		$("#sysuserdeleteform")[0].action="${baseurl}course/coufiles/downloadcoufile.action";
 		
 		$("#sysuserdeleteform")[0].submit();
		 
	}
 	function editcoufile(sfid){
 		
 		createmodalwindow("添加课程资源", 666, 300, '${baseurl}course/coufiles/editcoufile.action?sfid='+sfid);
		 
	}

	
</script>

</head>
<body>

	<!-- html的静态布局 -->
  <form id="sysuserqueryForm" method="post">
  <input type="hidden" id="indexs" name="indexs"/>
	
	<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
							<TD height=30 width="15%" align=right >文件名称：</TD>
								<TD class=category width="35%">
								
								<input type="text" id="sourcefileCustom.zywjmc" name="sourcefileCustom.zywjmc"  value="${sourcefileCustom.zywjmc}" />
								</td>
								
								<TD height=30 width="15%" align=right >上传人姓名：</TD>
								<TD class=category width="35%">
								
								<input type="text" id="teacherCustom.xm" name="teacherCustom.xm"  value="${teacherCustom.xm}" />
								</td>
								
								
					
					
					</TR>
					<TR>
							
								<TD height=30 width="15%" align=right >文件类型：</TD>
								<TD class=category width="35%">
							
								<select name="sourcefileCustom.zywjlx" id="sourcefileCustom.zywjlx">
									
									<option value="">请选择</option>
									<c:forEach items="${zywjlx_info}" var="info">
									<option value="${info.dictcode}"  <c:if test="${sourcefileCustom.zywjlx==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
									</c:forEach>
		
								</select>
								
								</TD>
								
								<TD height=30 width="15%" align=right >上传人编号：</TD>
								<TD class=category width="35%">
							
								<input type="text" id="teacherCustom.bh" name="teacherCustom.bh"  value="${teacherCustom.bh}" />
								
								</TD>
					
					
					</TR>
					<TR>
							<TD height=30 width="15%" align=right >上传时间：</TD>
								<TD class=category width="35%">
						
						<INPUT id="sourcefileCustom.scsj_start"
								name="sourcefileCustom.scsj_start"   value="<fmt:formatDate value="${sourcefileCustom.scsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="sourcefileCustom.scsj_end"
								name="sourcefileCustom.scsj_end"   value="<fmt:formatDate value="${sourcefileCustom.scsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
						<a id="btn" href="#" onclick="queryuser()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
					</TR>
					
				</TBODY>
	</TABLE> 
	

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="coufileslist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
<form id="sysuserdeleteform" action="${baseurl}course/coufiles/delcoufile_submit.action" method="post">
  <input type="hidden" id="delete_id" name="sfid"/>
</form>

</body>
</html>


