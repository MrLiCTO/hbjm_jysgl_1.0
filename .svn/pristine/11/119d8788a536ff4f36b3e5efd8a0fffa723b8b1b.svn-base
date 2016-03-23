<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK rel="stylesheet" type="text/css" href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>添加课程</title>
<script type="text/javascript">
  function sysusersave(){
	  //准备使用jquery 提供的ajax Form提交方式
	  //将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
	  //使用ajax form提交时，不用指定url，url就是form中定义的action
	  //此种方式和原始的post方式差不多，只不过使用了ajax方式
	  
	  //第一个参数：form的id
	  //第二个参数：sysusersave_callback是回调函数，sysusersave_callback当成一个方法的指针
	  //第三个参数：传入的参数， 可以为空
	  //第四个参数：dataType预期服务器返回的数据类型,这里action返回json
	  //根据form的id找到该form的action地址
	  jquerySubByFId('userform',sysusersave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function sysusersave_callback(data){
	  
	  message_alert(data);
	  
	  if(data.resultInfo.type=='1'){
		  //window.setInterval(" parent.closemodalwindow()",1000);每隔一秒执行一次
		  setTimeout(" parent.closemodalwindow()",1000);
		 
	  }
	  
  }
  function selectsf(value){
		 var sel=document.getElementById("courseCustom.jpkjb");
		 
	 if(value=='0'||value==undefined){
		 
		 $(sel).children().first().attr("selected","selected");
		 $(sel).attr("disabled","disabled");
		 
	 }else{
		 
		 $(sel).removeAttr("disabled");
	 }
	  
  }
 
</script>
</head>
<body>


<form id="userform" action="${baseurl}course/addcourse_submit.action" method="post">
<input type="hidden" name="cid" value="${courseCustom.cid}">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;课程信息</TD>
								<TD align=right>&nbsp;</TD>
							</TR>
						</TBODY>
					</TABLE>
				</TD>
			</TR>
			
			<TR>
				<TD>
					<TABLE class="toptable grid" border=1 cellSpacing=1 cellPadding=4
						align=center>
						<TBODY>
							
							<TR>
								<TD height=30 width="15%" align=right > 课程名称：</td>
								<TD class=category width="35%">
								<div>
								<input type="text" id="coubh" name="courseCustom.kcmc"  value="${courseCustom.kcmc}"/>
								</div>
							
								</TD>
								<TD height=30 width="15%" align=right >课程号：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="courseCustom.kch" name="courseCustom.kch"   value="${courseCustom.kch}" />
								</div>
							
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >学分：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="courseCustom.xf" name="courseCustom.xf"  value="${courseCustom.xf}"/>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >理论课时：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="courseCustom.llks" name="courseCustom.llks"  value="${courseCustom.llks}"/>
								</div>
								</TD>
								
								
							</TR>
							<TR>
							   <TD height=30 width="15%" align=right>实践课时：</TD>
								<TD class=category width="35%">
								<div>
									<input type="text" id="courseCustom.sjks" name="courseCustom.sjks" value="${courseCustom.sjks}" />
								</div>
								</TD>
								<TD height=30 width="15%" align=right>总课时：</TD>
								<TD class=category width="35%">
									<div>
									<input type="text" id="courseCustom.zks" name="courseCustom.zks" value="${courseCustom.zks}" />
								</div>
								</TD>
								
							</TR>
							
								<TR>
								<TD height=30 width="15%" align=right >网络课堂：</TD>
								<TD class=category width="35%">
								<div>
									<select name="courseCustom.sfsywlkt" id="courseCustom.sfsywlkt">
									
									
									<option value="0">不使用</option>
									<option value="1">使用</option>
									
									</select>
								</div>
								
								</TD>
								<TD height=30 width="15%" align=right >精品课：</TD>
								<TD class=category width="35%">
								<div>
								<select name="courseCustom.sfsjpk" id="courseCustom.sfsjpk" onchange="selectsf(this.value)">				
								<option value="0">不是精品课</option>
								<option value="1">是精品课</option>
								
								</select>
								</div>
							
								</TD>
								
								
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >课程类别：</TD>
								<TD class=category width="35%">
								<div>
								<select name="courseCustom.lb" id="courseCustom.lb">
									
									<option value="">请选择</option>
									<c:forEach items="${lb_info}" var="info">
									<option value="${info.dictcode}"  <c:if test="${courseCustom.lb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
									</c:forEach>
					
								</select>
								</div>
						
								</TD>
								<TD height=30 width="15%" align=right >精品课级别：</TD>
								<TD class=category width="35%">
								<div>
								<select name="courseCustom.jpkjb" id="courseCustom.jpkjb" disabled="disabled">
									<option value="">请选择</option>
									<c:forEach items="${jpkjb_info}" var="info">
									<option value="${info.dictcode}"  <c:if test="${courseCustom.jpkjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
									</c:forEach>
								</select>
								</div>
								</TD>
							</TR>
							
							<TR>
								
								
								<TD height=30 width="15%" align=right >开课学期：</TD>
								<TD class=category width="35%">
								
								<select name="courseCustom.kkxq" id="courseCustom.kkxq">
									<option value="4">未确定</option>
									<option value="1">第一学期</option>
									<option value="2">第二学期</option>
									<option value="3">两学期均有</option>
								</select>
								</TD>
								
								
							</TR>
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="sysusersave()">提交</a>
								<a id="closebtn"  class="easyui-linkbutton" iconCls="icon-cancel" href="#" onclick="parent.closemodalwindow()">关闭</a>
							  </td>
							</tr>
						
							</TBODY>
						</TABLE>
					</TD>
				</TR>
   </TBODY>
</TABLE>
</form>
</body>
</html>