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
function bookanalysis(){
	//调用ajax Form提交
	jquerySubByFId('booklistFrom',bookanalysis_callback,null,"json");
	
}
function bookanalysis_callback(data){
	
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

<form id="booklistFrom" name="booklistFrom" action="${baseurl}book/analysisbookinfo_submit.action" method="post">
		<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
					<TD class="left"> 参与人编号：</td>
						<td><input type="text" id="teabh" name="teacherCustom.bh"  value="${teacherCustom.bh}"/></TD>
							<TD height=30 width="15%" align=right >出版社：</TD>
								<td>
								<input type="text" id="bookCustom.cbs" name="bookCustom.cbs"   value="${bookCustom.cbs}" />
								</td>
							
								
								
						<TD height=30 width="15%" align=right >出版时间：</TD>
								<TD class=category width="35%">
								<INPUT id="bookCustom.cbsj_start"
								name="bookCustom.cbsj_start"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
								----
								<INPUT id="bookCustom.cbsj_end"
								name="bookCustom.cbsj_end"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
								</TD>
								
							
								
						
					</TR>
					<TR>
					<!-- 自行添加 -->
						<TD class="left">参与人姓名：</TD>
						<td ><input type="text" id="teaxm" name="teacherCustom.xm"  value="${teacherCustom.xm}"/></td>

					<TD height=30 width="15%" align=right>著作名称：</TD>
					<td><input type="text" id="bookCustom.zzmc"
						name="bookCustom.zzmc" value="${bookCustom.zzmc}" /></TD>
					</TD>




					<!-- 自行添加 -->
						<TD height=30 width="15%" align=right >审核状态：</TD>
						<td >
						<select name="bookCustom.shzt" id="bookCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${bookCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
						</c:forEach>

						</select>
						</td>	
				
					
						
					</TR>
					<tr>
							<!-- 自行添加 -->
								<TD class="left">署名位次：</TD>
								<td >	
								<select name="teacherCustom.smwc" id="teacherCustom.smwc" style="width: 80px" >
											
								<option value="">请选择</option>
								<c:forEach items="${smwc_info}" var="info">
								<option value="${info.dictcode}"  <c:if test="${teacherCustom.smwc==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
								</c:forEach>
		
								</select>
								
						</td>
						
								<TD class="left">统计类目：</TD>
						<td >
						<select name="bookCustom.grp_by" id="bookCustom.grp_by" style="width: 80px" >

						
						<option value="year_gr">按年统计</option>
				
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
					
						<a id="btn" href="#" onclick="bookanalysis()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
					</tr>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
