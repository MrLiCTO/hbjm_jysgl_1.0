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
function courseanalysis(){
	//调用ajax Form提交
	jquerySubByFId('courselistFrom',courseanalysis_callback,null,"json");
	
}
function courseanalysis_callback(data){
	
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

<form id="courselistFrom" name="courselistFrom" action="${baseurl}course/analysiscourseinfo_submit.action" method="post">
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
					<td><select name="courseCustom.sfsywlkt"
						id="courseCustom.sfsywlkt">

							<option value="">请选择</option>
							<option value="0">不是精品课</option>
							<option value="1">是精品课</option>

					</select></td>


					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>课程类别：</TD>
					<td><select name="courseCustom.kclb" id="courseCustom.kclb">
							<option value="">请选择</option>
							<option value="0">选修</option>
							<option value="1">必修</option>
					</select></td>

					<!-- 自行添加 -->
					<TD height=30 width="15%" align=right>精品课级别：</TD>
					<td><select name="courseCustom.jpkjb" id="courseCustom.jpkjb">
							<option value="">请选择</option>
					</select></td>
				<tr>
					<TD height=30 width="15%" align=right>开课学期：</TD>
					<td><select name="courseCustom.kkxq" id="courseCustom.kkxq">
							<option value="">请选择</option>
							<option value="0">第一学期</option>
							<option value="1">第二学期</option>
					</select>
					</td>						
							<TD height=30 width="15%" align=right >统计类目：</TD>
						<td >
						<select name="grp_by" id="grp_by">

						<option value="zzmm_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>政治面貌</option>
						<option value="xw_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>学位</option>
						<option value="xb_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>性别</option>
						<option value="age_gr"  <c:if test="${teacherCustom.zzmm_gr=='zzmm_gr'}">selected</c:if>>年龄</option>


						</select>
						</td>
						<TD height=30 width="15%" align=right >图形选择：</TD>
						<td>
							<select id="pic_se" onchange="pic_select()">
											
								<option value="">请选择</option>
								
								<option value="pie3d">饼图</option>
								<option value="Column3d">柱状图</option>
								<option value="line">折线</option>
							
							</select>
							</td>
						<td>
						<a id="btn" href="#" onclick="querycourse()" class="easyui-linkbutton" iconCls='icon-search'>统计分析</a>
				  		<td/>
					</tr>
					
				</TBODY>
			</TABLE>
			
</form>


 <div id="chartContainer" align="center"></div>

</body>
</html>
