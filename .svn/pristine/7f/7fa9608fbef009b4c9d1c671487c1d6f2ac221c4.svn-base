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
function paperanalysis(){
	//调用ajax Form提交
	jquerySubByFId('paperlistFrom',paperanalysis_callback,null,"json");
	
}
function paperanalysis_callback(data){
	
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

<form id="paperlistFrom" name="paperlistFrom" action="${baseurl}paper/analysispaperinfo_submit.action" method="post">
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
						<TD class="left">论文题目：</TD>
						<td >
							<input type="text" id="paperCustom.lwtm" name="paperCustom.lwtm"  value="${paperCustom.lwtm}"/>
						</td>
						
						 <!-- 自行添加 -->
						<TD class="left">发表期刊名称：</TD>
						<td >
							<input type="text" id="paperCustom.fbqkmc" name="paperCustom.fbqkmc"  value="${paperCustom.fbqkmc}"/>
						</td>
						
					
						
						
					</TR>
					
						<TR>
						
						<TD class="left">发表时间：</TD>
						<td >
						<INPUT id="paperCustom.fbsj_start"
								name="awardTeaCustom.hjsj_start"   value="<fmt:formatDate value="${paperCustom.lxsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="paperCustom.fbsj_end"
								name="awardTeaCustom.hjsj_end"   value="<fmt:formatDate value="${paperCustom.lxsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							
						</td>
						
						
						<!-- 自行添加 -->
						<TD class="left">论文档次：</TD>
						<td >	
						<select name="paperCustom.lwdc" id="paperCustom.lwdc">
									
						<option value="">请选择</option>
						<c:forEach items="${lwdc_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${paperCustom.lwdc==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						
						
						<!-- 自行添加 -->
						<TD class="left">论文类别：</TD>
						<td >	
						<select name="paperCustom.lwlb" id="paperCustom.lwlb">
									
						<option value="">请选择</option>
						<c:forEach items="${lwlb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${paperCustom.lwlb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						
						
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
						
					</TR>
					
					
					<TR>
					
				
					
					
						
						
						<!-- 自行添加 -->
						<TD class="left">审核状态：</TD>
						<td >
						<select name="paperCustom.shzt" id="paperCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${paperCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select></TD>

						
							<TD class="left">统计类目：</TD>
						<td >
						<select name="paperCustom.grp_by" id="paperCustom.grp_by" style="width: 80px" >

						<option value="lwdc_gr">按档次统计</option>
						<option value="lwlb_gr">按论文类型统计</option>
						<option value="smwc_gr">按署名位次统计</option>
						<option value="year_gr">按年统计</option>


						</select>
						</td>
						<TD class="left">图形选择：</TD>
						<td>
							<select id="pic_se" onchange="pic_select()"  style="width: 80px" >
											
								<option value="">请选择</option>
								
								<option value="pie3d">饼图</option>
								<option value="Column3d">柱状图</option>
								<option value="line">折线</option>
							
							</select>
						
					
						<a id="btn" href="#" onclick="paperanalysis()" class="easyui-linkbutton" iconCls='icon-search'>统计</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
