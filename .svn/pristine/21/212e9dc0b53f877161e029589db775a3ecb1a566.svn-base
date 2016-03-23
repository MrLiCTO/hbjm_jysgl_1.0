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
<title>课程信息管理</title>

<script type="text/javascript">
	//采购药品删除
	function coursedelete() {
		_confirm('您确定要删除选择的课程信息吗?', null, function() {

			var indexs = [];//选择记录的序号
			var rows = $('#courselist').datagrid('getSelections');
			for (var i = 0; i < rows.length; i++) {
				var index = $('#courselist').datagrid('getRowIndex', rows[i]);
				indexs.push(index);
			}
			if (rows.length > 0) {
				$("#indexs").val(indexs.join(','));
				//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
				$("#coursequeryForm").attr("action",
						'${baseurl}course/coursedelete_submit.action');
				jquerySubByFId('coursequeryForm', coursedelete_callback, null);
			} else {
				alert_warn("请选择要删除的课程信息");
			}
		})
	}
	function coursedelete_callback(data) {
		var result = getCallbackData(data);
		_alert(result);
		querycourse();
	}

	//datagrid列定义
	var columns_v = [ [
			{
				checkbox : true
			},
			{
				field : 'cid',//对应json中的key
				hidden : true,//隐藏
				formatter : function(value, row, index) {
					return '<input type="hidden" name="courseCustoms['+index+'].cid" value="'+value+'" />';
				}
			},
			{
				field : 'kcmc',//对应json中的key
				title : '课程名称',
				width : 110
			},
			{
				field : 'kch',//对应json中的key
				title : '课程号',
				width : 110
			},
			{
				field : 'lbmc',//对应json中的key
				title : '类别 ',
				width : 65
			},
			{
				field : 'xf',//对应json中的key
				title : '学分',
				width : 65
			},
			{
				field : 'kkxq',//对应json中的key
				title : '开课学期',
				width : 65,
				formatter: function(value,row,index){
					if(value=='1'){
						return "第一学期";
					}else if(value=="2"){
						return "第二学期";
					}else if(value=="3"){
						return "两学期均有";
					}
					
					return "未确定";
				}
			},
			{
				field : 'llks',//对应json中的key
				title : '理论课时',
				width : 65
			},
			{
				field : 'sjks',//对应json中的key
				title : '实践课时',
				width : 65
			},
			{
				field : 'zks',//对应json中的key
				title : '总课时',
				width : 65
			},
			{
				field : 'jpkjbmc',//对应json中的key
				title : '精品课级别',
				width : 65,
					formatter: function(value,row,index){
						if(value=='' || value==undefined){
							return "非精品课";
						}
						return value;
					}
			},
			{
				field : 'sfsywlkt',//对应json中的key
				title : '网络课堂',
				width : 65 ,
					formatter: function(value,row,index){
						if(value=='1'){
							return "使用";
						}else{
							return "不使用";
						}
					}
			},
			{
				field : 'opt1',//对应json中的key
				title : '操作',
				width : 200,
				formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
					return "<a href=javascript:courseteas('"
							+ row.cid
							+ "')>授课老师</a>&nbsp;&nbsp;&nbsp;<a href=javascript:coursefiles('"
							+ row.cid
							+ "')>课程资源</a>&nbsp;&nbsp;&nbsp;<a href=javascript:editcourse('"
							+ row.cid
							+ "')>编辑</a>&nbsp;&nbsp;&nbsp;<a href=javascript:deletecourse('"
							+ row.cid + "')>删除</a>"
				}
			}

	] ];

	//定义 datagird工具
	var toolbar_v = [
			{//工具栏
				id : 'btnadd',
				text : '添加',
				iconCls : 'icon-add',
				handler : function() {
					//打开一个窗口，用户添加页面
					//参数：窗口的title、宽、高、url地址
					createmodalwindow("添加课程信息", 900, 400,
							'${baseurl}course/addcourse.action');
				}
			}, {
				id : 'btndel',
				text : '批量刪除',
				iconCls : 'icon-remove',
				handler : 'coursedelete'
			} ];

	//加载datagrid

	$(function() {
		$('#courselist').datagrid({
			title : '课程信息查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}course/courselist_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'cid',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
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
	function querycourse() {
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#coursequeryForm").serializeJson();
		$('#courselist').datagrid('load', formdata);
	}

	//刪除用戶
	function deletecourse(cid) {
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？', null, function() {
			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(cid);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('coursedeleteform', deletecourse_callback, null,
					"json");

		});
	}

	//删除用户的回调
	function deletecourse_callback(data) {
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type = data.resultInfo.type;
		if (type == 1) {
			//成功结果
			//重新加载 datagrid
			querycourse();
		}
	}

	//修改用戶
	function editcourse(cid) {
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改课程信息", 900, 400,
				'${baseurl}course/editcourse.action?cid=' + cid);
	}
	
	//授课教师列表
	function courseteas(cid) {
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改课程信息", 1000, 500,
				'${baseurl}course/couteas/couteaslist.action?cid=' + cid);
	}
	
	
	//课程资源文件列表
	function coursefiles(cid) {
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改课程信息", 900, 400,
				'${baseurl}course/coufiles/coufileslist.action?cid=' + cid);
	}
	
	 function selectsf(value){
		 var sel=document.getElementById("courseCustom.jpkjb");
		 
	 if(value=='0'||value==''||value==undefined){
		 
		 $(sel).children().first().attr("selected","selected");
		 $(sel).attr("disabled","disabled");
		 
	 }else{
		 
		 $(sel).removeAttr("disabled");
	 }
	  
  }
</script>

</head>
<body>

	<!-- html的静态布局 -->
	<form id="coursequeryForm" method="post">
		<input type="hidden" id="indexs" name="indexs" />
		<!-- 查询条件 -->
		<TABLE class="table_search">
			<TBODY>
				<TR>
					<TD height=30 width="15%" align=right>课程名称：</td>
					<td><input type="text" id="coubh" name="courseCustom.kcmc"
						value="${courseCustom.kcmc}" /></TD>
					<TD height=30 width="15%" align=right>课程号：</TD>
					<td><input type="text" id="courseCustom.kch"
						name="courseCustom.kch" value="${courseCustom.kch}" /></td>


					<TD height=30 width="15%" align=right>授课教师编号：</td>
					<td><input type="text" id="teabh" name="teacherCustom.bh"
						value="${teacherCustom.bh}" /></TD>
					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>授课教师姓名：</TD>
					<td><input type="text" id="teaxm" name="teacherCustom.xm"
						value="${teacherCustom.xm}" /></td>




				</TR>
				<TR>


					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>理论课时：</TD>
					<td><input type="text" id="courseCustom.llks_start"
						name="courseCustom.llks_start" value="${courseCustom.llks_start}"
						style="width: 60px" />-- <input type="text"
						id="courseCustom.llks_end" name="courseCustom.llks_end"
						value="${courseCustom.llks_end}" style="width: 60px" /></td>




					<TD height=30 width="15%" align=right>实践课时：</TD>
					<td><input type="text" id="courseCustom.sjks_start"
						name="courseCustom.sjks_start" value="${courseCustom.sjks_start}"
						style="width: 60px" />-- <input type="text"
						id="courseCustom.sjks_end" name="courseCustom.sjks_end"
						value="${courseCustom.sjks_end}" style="width: 60px" /></TD>
					</TD>

					<TD height=30 width="15%" align=right>总课时：</TD>
					<td><input type="text" id="courseCustom.xf_start"
						name="courseCustom.zks_start" value="${courseCustom.zks_start}"
						style="width: 60px" />-- <input type="text"
						id="courseCustom.xf_end" name="courseCustom.zks_end"
						value="${courseCustom.zks_end}" style="width: 60px" /></TD>
					</TD>


					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>学分：</TD>
					<td><input type="text" id="courseCustom.xf_start"
						name="courseCustom.xf_start" value="${courseCustom.xf_start}"
						style="width: 60px" />-- <input type="text"
						id="courseCustom.xf_end" name="courseCustom.xf_end"
						value="${courseCustom.xf_end}" style="width: 60px" /></td>




				</TR>
				<tr>

					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>网络课堂：</TD>
					<td><select name="courseCustom.sfsywlkt"
						id="courseCustom.sfsywlkt">

							<option value="">请选择</option>
							<option value="0">不使用</option>
							<option value="1">使用</option>

					</select></td>


					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>精品课：</TD>
					<td><select name="courseCustom.sfsjpk" id="courseCustom.sfsjpk"  onchange="selectsf(this.value)">

							<option value="">请选择</option>
							<option value="0">不是精品课</option>
							<option value="1">是精品课</option>

					</select></td>


					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>课程类别：</TD>
					<td><select name="courseCustom.lb" id="courseCustom.lb">
							<option value="">请选择</option>
							<c:forEach items="${lb_info}" var="info">
							<option value="${info.dictcode}"  <c:if test="${courseCustom.kclb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
							</c:forEach>
					</select></td>

					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>精品课级别：</TD>
					<td><select name="courseCustom.jpkjb" id="courseCustom.jpkjb" disabled="disabled">
							<option value="">请选择</option>
						<c:forEach items="${jpkjb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${courseCustom.jpkjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>
					</select></td>
				<tr>
					<TD height=30 width="15%" align=right>开课学期：</TD>
					<td><select name="courseCustom.kkxq" id="courseCustom.kkxq">
							<option value="">请选择</option>
							<option value="1">第一学期</option>
							<option value="2">第二学期</option>
							<option value="3">两学期均可</option>
							<option value="4">未定</option>
					</select> <a id="btn" href="#" onclick="querycourse()"
						class="easyui-linkbutton" iconCls='icon-search'>查询</a></td>
				</tr>

			</TBODY>
		</TABLE>

		<!-- 查询列表 -->
		<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
			<TBODY>
				<TR>
					<TD>
						<table id="courselist"></table>
					</TD>
				</TR>
			</TBODY>
		</TABLE>
	</form>
	<form id="coursedeleteform"
		action="${baseurl}course/deletecourse_submit.action" method="post">
		<input type="hidden" id="delete_id" name="cid" />
	</form>

</body>
</html>


