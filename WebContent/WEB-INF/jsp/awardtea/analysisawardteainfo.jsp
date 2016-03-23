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
function awardteaanalysis(){
	//调用ajax Form提交
	jquerySubByFId('awardtealistFrom',awardteaanalysis_callback,null,"json");
	
}
function awardteaanalysis_callback(data){
	
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

<form id="awardtealistFrom" name="awardtealistFrom" action="${baseurl}awardtea/analysisawardteainfo_submit.action" method="post">
<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
						
						<TD class="left"> 获奖人编号：</td>
						<td><input type="text" id="teabh" name="awardTeaCustom.teabh"  value="${awardTeaCustom.teabh}"/></TD>
						<!-- 自行添加 -->
						<TD class="left">获奖人姓名：</TD>
						<td ><input type="text" id="teaxm" name="awardTeaCustom.teaxm"  value="${awardTeaCustom.teaxm}"/></td>
						
						
						 <!-- 自行添加 -->
						<TD class="left">颁发单位：</TD>
						<td >
							<input type="text" id="bfdw" name="awardTeaCustom.bfdw"  value="${awardTeaCustom.bfdw}"/>
						</td>
						<TD class="left">获奖时间：</TD>
						<td >
						<INPUT id="awardTeaCustom.hjsj_start"
								name="awardTeaCustom.hjsj_start"   value="<fmt:formatDate value="${awardTeaCustom.hjsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="awardTeaCustom.hjsj_end"
								name="awardTeaCustom.hjsj_end"   value="<fmt:formatDate value="${awardTeaCustom.hjsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							
						</td>
						
						
					</TR>
					<TR>
						<!-- 自行添加 -->
						<TD class="left">审核状态：</TD>
						<td >
						<select name="awardTeaCustom.shzt" id="awardTeaCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${awardTeaCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></td>
						<!-- 自行添加 -->
						<TD class="left">获奖级别：</TD>
						<td >	
						<select name="awardTeaCustom.hjjb" id="awardTeaCustom.hjjb">
									
						<option value="">请选择</option>
						<c:forEach items="${hjjb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${awardTeaCustom.hjjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
							<TD class="left">统计类目：</TD>
						<td >
						<select name="grp_by" id="grp_by">

						<option value="hjjb_gr"  <c:if test="${awardTeaCustom.hjjb_gr=='hjjb_gr'}">selected</c:if>>按级别统计</option>
						<option value="year_gr"  <c:if test="${awardTeaCustom.year_gr=='year_gr'}">selected</c:if>>按年统计</option>


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
						
					
						<a id="btn" href="#" onclick="awardteaanalysis()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
