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
function proanalysis(){
	//调用ajax Form提交
	jquerySubByFId('prolistFrom',proanalysis_callback,null,"json");
	
}
function proanalysis_callback(data){
	
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

<form id="prolistFrom" name="prolistFrom" action="${baseurl}project/analysisprojectinfo_submit.action" method="post">
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
						<TD class="left">批准单位：</TD>
						<td >
							<input type="text" id="bfdw" name="projectCustom.pzdw"  value="${projectCustom.pzdw}"/>
						</td>
						
						<TD class="left">立项时间：</TD>
						<td >
						<INPUT id="projectCustom.lxsj_start"
								name="projectCustom.lxsj_start"   value="<fmt:formatDate value="${projectCustom.lxsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="projectCustom.lxsj_end"
								name="projectCustom.lxsj_end"   value="<fmt:formatDate value="${projectCustom.lxsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							
						</td>
						
					
						
					</TR>
					<TR>
					<TD class="left">结项时间：</TD>
						<td >
						<INPUT id="projectCustom.jxsj_start"
								name="projectCustom.jxsj_start"   value="<fmt:formatDate value="${projectCustom.jxsj_start}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
						---
						<INPUT id="projectCustom.lxsj_end"
								name="projectCustom.lxsj_end"   value="<fmt:formatDate value="${projectCustom.lxsj_end}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />	
							</td>
					<!-- 自行添加 -->
						<TD class="left">参与人署名位次：</TD>
						<td >	
						<select name="teacherCustom.smwc" id="teacherCustom.smwc" style="width: 80px" >
									
						<option value="">请选择</option>
						<c:forEach items="${smwc_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${teacherCustom.smwc==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
					
				
							<!-- 自行添加 -->
						<TD class="left">项目级别：</TD>
						<td >	
						<select name="projectCustom.xmjb" id="projectCustom.xmjb" style="width: 80px" >
									
						<option value="">请选择</option>
						<c:forEach items="${xmjb_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${projectCustom.xmjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						<!-- 自行添加 -->
						<TD class="left">审核状态：</TD>
						<td >
						<select name="projectCustom.shzt" id="projectCustom.shzt" style="width: 80px" >
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${projectCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>
						</TR>
						<TR>
							<TD class="left">统计类目：</TD>
						<td >
						<select name="projectCustom.grp_by" id="projectCustom.grp_by" style="width: 80px" >

						<option value="xmjb_gr">按级别统计</option>
						<option value="year_gr">按年统计</option>
						<option value="xmlx_gr">按项目类型统计</option>
						<option value="smwc_gr">按署名位次统计</option>


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
						
					
						<a id="btn" href="#" onclick="proanalysis()" class="easyui-linkbutton" iconCls='icon-search'>统计</a>
				  		</td>
						
					</TR>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
