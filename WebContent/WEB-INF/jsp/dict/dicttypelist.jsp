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
<title>用户管理</title>

<script type="text/javascript">
	//datagrid列定义
	var columns_v = [ [ {
		field : 'typecode',//对应json中的key
		hidden : true,//隐藏
	},{
		field : 'typename',//对应json中的key
		title : '字典类型名称',
		width : 120
	},{
		field : 'opt1',//对应json中的key
		title : '操作',
		width : 200,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			if(index>=4){
				return "<a href=javascript:dictinfolist('"+row.typecode+"')>查看字典名称列表</a>"
			}else{
				return "状态码只有0,或1，无需操作";
			}
		}
	} 
	
	
	
	] ];

	//加载datagrid

	$(function() {
		$('#dicttypelist').datagrid({
			title : '教师信息查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}dictinfo/dicttypelist_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'typecode',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v
			/* pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			pageList:[30], 
			toolbar : toolbar_v*/
		});
	});
	
	//查询方法
	function queryuser(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		$('#teacherlist').datagrid('load',{});
	}
	
	
	
	//查看字典名称列表
	function dictinfolist(typecode){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("查看字典名称列表", 800, 400, '${baseurl}dictinfo/dictinfolist.action?typecode='+typecode);
	}
</script>

</head>
<body>

	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="dicttypelist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>

</body>
</html>


