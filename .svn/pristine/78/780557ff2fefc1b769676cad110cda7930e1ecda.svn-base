<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<html>
<head>
<title>药品目录导出</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="content-type" content="text/html; charset=UTF-8">

<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>

<script type="text/javascript">
	//药品信息导出
	function courseexport() {
		//调用ajax Form提交
		jquerySubByFId('courselistFrom', courseexport_callback, null, "json");

	}
	function courseexport_callback(data) {

		//在这里提示信息中有文件下载链接
		message_alert(data);

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
	<!-- 导出条件 -->

	<form id="courselistFrom" name="courselistFrom"
		action="${baseurl}course/exportcourse_submit.action" method="post">
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
							<option value="3">每学期</option>
							<option value="4">未定</option>
					</select> <a id="btn" href="#" onclick="courseexport()"
						class="easyui-linkbutton" iconCls='icon-search'>导出</a></td>
				</tr>

			</TBODY>
		</TABLE>

	</form>


</body>
</html>