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
<script type="text/javascript" src="${baseurl}js/fusioncharts/fusioncharts.js"></script>
<script type="text/javascript" src="${baseurl}js/fusioncharts/themes/fusioncharts.theme.fint.js"></script>
<script type="text/javascript">
//药品信息统计
function studentanalysis(){
	//调用ajax Form提交
	jquerySubByFId('studentlistFrom',studentanalysis_callback,null,"json");
	
}
function studentanalysis_callback(data){
	
		var revenueChart = new FusionCharts({
        "type": pic_select(),
		//"type": "Column3d",
		//"type": "line",
        "renderAt": "chartContainer",
        "width": "500",
        "height": "300",
        "dataFormat": "json",
        "dataSource":data

  		});
		revenueChart.render();
	
}

function pic_select(){
	var pic_se=$("#pic_se").val();
	
	if(pic_se==null||pic_se==""){
		pic_se="pie3d";
	}
	
	return pic_se;
}
</script>

</head>
<body>
<!-- 导出条件 -->

<form id="studentlistFrom" name="studentlistFrom" action="${baseurl}student/analysisstudentinfo_submit.action" method="post">
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
						</td>
							<TD class="left">统计年份：</TD>
						<td >
						<select name="studentCustom.rxsj" id="studentCustom.rxsj">
						
						<c:forEach items="${rxsj_info}" var="year_">
							<option value="${year_}"  <c:if test="${studentCustom.rxsj==year_}">selected</c:if>>${year_}</option>
						</c:forEach>
						
						</select>
						
						</td>
						<TD class="left">图形选择：</TD>
						<td>
							<select id="pic_se" onchange="pic_select()">
											
								<option value="">请选择</option>
								
								<option value="pie3d">饼图</option>
								<option value="Column3d">柱状图</option>
								<option value="line">折线</option>
							
							</select>
						
					
						<a id="btn" href="#" onclick="studentanalysis()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
