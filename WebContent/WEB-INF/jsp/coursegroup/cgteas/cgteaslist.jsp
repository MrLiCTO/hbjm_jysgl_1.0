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
<title>授课教师管理</title>

<script type="text/javascript">

		//采购药品删除
		function couteadelete(){
			_confirm('您确定要删除选择的授课教师吗?',null,
					  function(){
								
						var indexs = [];//选择记录的序号
						var rows = $('#cgteaslist').datagrid('getSelections');
						for(var i=0;i<rows.length;i++){
							var index=$('#cgteaslist').datagrid('getRowIndex',rows[i]);
							indexs.push(index);
						}
						if(rows.length>0){
							$("#indexs").val(indexs.join(','));
							//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
							$("#sysuserqueryForm").attr("action",'${baseurl}course/cgteas/couteadel_submit.action?cgid=${cgid}');
							jquerySubByFId('sysuserqueryForm', couteadelete_callback, null);
						}else{
							alert_warn("请选择要删除的授课教师");
						}
					  }
					)
		}
		function couteadelete_callback(data) {
			var result = getCallbackData(data);
			_alert(result);
			queryuser();
		}





	//datagrid列定义
	var columns_v = [ [{
		checkbox:true
	},{
		field : 'teaid',//对应json中的key
		hidden : true,//隐藏
		formatter: function(value,row,index){
			//gysypmls对应action接收对象中list的名称，[]括号中是从0开始序号,id是list中对象属性
			return '<input type="hidden" name="teacherCustoms['+index+'].teaid" value="'+value+'" />';
		}
	},{
		field : 'bh',//对应json中的key
		title : '编号',
		width : 120
	},{
		field : 'xm',//对应json中的key
		title : '姓名',
		width : 120
	}, {
		field : 'opt1',//对应json中的key
		title : '操作',
		width : 120,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:deletecoutea('"+row.teaid+"')>删除</a>"
		}
	} 
	
	
	
	] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加授课教师',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("教师列表", 800, 420, '${baseurl}coursegroup/cgteas/allteaslist.action?cgid=${cgid}');
		}
	},{
		id : 'btndel',
		text : '批量刪除',
		iconCls : 'icon-remove',
		handler : 'couteadelete'
	}
	];

	//加载datagrid

	$(function() {
		$('#cgteaslist').datagrid({
			title : '授课教师列表',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}coursegroup/cgteas/allcgeaslist_result.action?cgid=${cgid}',//加载数据的连接，引连接请求过来是json数据
			idField : 'teaid',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
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
		$('#cgteaslist').datagrid('load',formdata);
	}
	
	//刪除用戶
	function deletecoutea(teaid){
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){

			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(teaid);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('sysuserdeleteform',deletecoutea_callback,null,"json");
			
			
		});
	}
	
	//删除用户的回调
	function deletecoutea_callback(data){
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
						
						<TD class="left">编号：</td>
						<td><input type="text" id="teacher_bh" name="teacherCustom.bh"  value="${teacherCustom.bh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">姓名：</TD>
						<td ><input type="text" id="teacher_xm" name="teacherCustom.xm"  value="${teacherCustom.xm}"/>
						<a id="btn" href="#" onclick="queryuser()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
	</TABLE>
	

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="cgteaslist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
<form id="sysuserdeleteform" action="${baseurl}coursegroup/cgteas/delcgtea_submit.action" method="post">
  <input type="hidden" id="delete_id" name="teaid"/>
  <input type="hidden" name="cgid" value="${cgid}"/>
</form>

</body>
</html>


