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
function teacheranalysis(){
	//调用ajax Form提交
	jquerySubByFId('teacherlistFrom',teacheranalysis_callback,null,"json");
	
}
function teacheranalysis_callback(data){
	
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

<form id="teacherlistFrom" name="teacherlistFrom" action="${baseurl}teacher/analysisteacherinfo_submit.action" method="post">
<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left">编号：</td>
						<td><input type="text" id="teacher_bh" name="teacherCustom.bh"  value="${teacherCustom.bh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">姓名：</TD>
						<td ><input type="text" id="teacher_xm" name="teacherCustom.xm"  value="${teacherCustom.xm}"/></td>
						
						
						 <!-- 自行添加 -->
						<TD class="left">毕业院校：</TD>
						<td >
							<input type="text" id="teacher_byyx" name="teacherCustom.byyx"  value="${teacherCustom.byyx}"/>
						</td>
						<TD class="left">所学专业：</TD>
						<td >
							<input type="text" id="teacher_sxzy" name="teacherCustom.sxzy"  value="${teacherCustom.sxzy}"/>
							
						</td>
						
						
					</TR>
					<TR>
					<td class="left" height="25">研究方向：</td>
				  		<td>
				  			<input type="text" id="teacher_yjfx" name="teacherCustom.yjfx"   value="${teacherCustom.yjfx}"/></td>
						
						
						
						  <!-- 自行添加 -->
						<TD class="left">出生日期：</TD>
						<td >
						<INPUT id="teacherCustom.csrq_start"
								name="teacherCustom.csrq_start"   value="<fmt:formatDate value="${teacherCustom.csrq_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="teacherCustom.csrq_end"
								name="teacherCustom.csrq_end"   value="<fmt:formatDate value="${teacherCustom.csrq_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />		
						</td>
						
						<!-- 自行添加 -->
						<TD class="left">最终学历：</TD>
						<td >	
						<select name="teacherCustom.zzxl" id="teacher_zzxl">
									
						<option value="">请选择</option>
						<c:forEach items="${zzxl_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.xb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						<!-- 自行添加 -->
						<TD class="left">最终学位：</TD>
						<td >	
						<select name="teacherCustom.zzxw" id="teacher_zzxw">
									
						<option value="">请选择</option>
						<c:forEach items="${zzxw_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.xb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
					</tr>
					<tr>
					  <!-- 自行添加 -->
						<TD class="left">性别：</TD>
						<td >
						<select name="teacherCustom.xb" id="teacher_xb">
							
						<option value="">请选择</option>
						<c:forEach items="${xb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.xb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						
						<!-- 自行添加 -->
						<TD class="left">角色：</TD>
						<td ><select name="teacherCustom.js" id="teacher_js">
									
						<option value="">请选择</option>
						
						<c:forEach items="${js_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.js==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						
				 		 <td class="left" height="25">政治面貌：</td>
				  		<td>
				  		<select name="teacherCustom.zzmm" id="teacher_zzmm">
									
						<option value="">请选择</option>
						<c:forEach items="${zzmm_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.xb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
					
				  		</td>
				  		
				  			<TD class="left">学院：</TD>
						<td >
						<select name="teacherCustom.xy" id="teacher_xy">
									
						<option value="">请选择</option>
						<c:forEach items="${xy_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.xy==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
				  		</td>
						
					</TR>
					
					<tr>
					<!-- 自行添加 -->
						<TD class="left">职称：</TD>
						<td >
						<select name="teacherCustom.zc" id="teacher_zc">
									
						<option value="">请选择</option>
						<c:forEach items="${zc_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.zc==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
				  		
				  			<TD class="left">在职状态：</TD>
						<td >
						<select name="teacherCustom.zzzt" id="teacher_zzzt">
									
						<option value="">请选择</option>
						<c:forEach items="${zzzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.zzzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						
						
							<TD class="left">统计类目：</TD>
						<td >
						<select name="grp_by" id="grp_by">

						<option value="zzmm_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>政治面貌</option>
						<option value="xw_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>学位</option>
						<option value="xb_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>性别</option>
						<option value="age_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>年龄</option>


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
						
						
						<a id="btn" href="#" onclick="teacheranalysis()" class="easyui-linkbutton" iconCls='icon-search'>统计</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
