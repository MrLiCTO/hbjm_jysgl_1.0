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
<title>学生信息导出</title>

<script type="text/javascript">

//药品信息导出
function studentexport(){
	//调用ajax Form提交
	jquerySubByFId('studentlistform',studentexport_callback,null,"json");
	
}
function studentexport_callback(data){
	
	//在这里提示信息中有文件下载链接
	message_alert(data);
	
}

	

</script>

</head>
<body>
	<!-- html的静态布局 -->
  <form id="studentlistform" action="${baseurl}student/exportstudent_submit.action" method="post"> 
	<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left">编号：</td>
						<td><input type="text" id="student_bh" name="studentCustom.bh"  value="${studentCustom.bh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">姓名：</TD>
						<td ><input type="text" id="student_xm" name="studentCustom.xm"  value="${studentCustom.xm}"/></td>
						
						<td class="left" height="25">专业：</td>
				  		<td>
				  			<input type="text" id="student_zy" name="studentCustom.zy"   value="${studentCustom.zy}"/></td>
						
						<TD class="left">班级：</TD>
						<td >
							<input type="text" id="student_bj" name="studentCustom.bj"  value="${studentCustom.bj}"/>
							
						</td>
						
						
					</TR>
					<TR>
					
						
						<!-- 自行添加 -->
						<TD class="left">单位：</TD>
						<td >
							<input type="text" id="studentCustom_dw" name="studentCustom.dw">
						</td>
							<!-- 自行添加 -->
						<TD class="left">电话：</TD>
						<td >
							<input type="text" id="studentCustom_phone" name="studentCustom.phone">
						</td>
							<!-- 自行添加 -->
						<TD class="left">QQ：</TD>
						<td >
							<input type="text" id="studentCustom_qq" name="studentCustom.qq">
						</td>
						
							<!-- 自行添加 -->
						<TD class="left">邮箱：</TD>
						<td >
							<input type="text" id="studentCustom_email" name="studentCustom.email">
						</td>
					</tr>
					<tr>
					
					<!-- 自行添加 -->
						<TD class="left">辅导老师编号：</TD>
						<td >
							<input type="text" id="teacherCustom_bh" name="teacherCustom.bh">
						</td>
						
							<!-- 自行添加 -->
						<TD class="left">辅导老师姓名：</TD>
						<td >
							<input type="text" id="teacherCustom_xm" name="teacherCustom.xm">
						</td>
					
					
				

				  		
				  			<TD class="left">学生状态：</TD>
						<td >
						<select name="studentCustom.xszt" id="studentCustom_xszt">
									
						<option value="">请选择</option>
						<c:forEach items="${xszt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${studentCustom.xszt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						
						
						 <!-- 自行添加 -->
						<TD class="left">性别：</TD>
						<td >
						<select name="studentCustom.xb" id="student_xb">
							
						<option value="">请选择</option>
						<c:forEach items="${xb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${studentCustom.xb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						
						</tr>
						<tr>
						
					
				  		
				  			<TD class="left">学院：</TD>
						<td >
						<select name="studentCustom.xy" id="student_xy">
									
						<option value="">请选择</option>
						<c:forEach items="${xy_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${studentCustom.xy==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
				  		
						
						<a id="btn" href="#" onclick="studentexport()" class="easyui-linkbutton" iconCls='icon-search'>导出</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>

</form>


</body>
</html>


