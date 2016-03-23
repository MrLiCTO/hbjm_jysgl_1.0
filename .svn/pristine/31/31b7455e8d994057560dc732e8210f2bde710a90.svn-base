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
<title>添加用户</title>
<script type="text/javascript">
  function awardStusave(){
	  //准备使用jquery 提供的ajax Form提交方式
	  //将form的id传入，方法自动将form中的数据组成成key/value数据，通过ajax提交，提交方法类型为form中定义的method，
	  //使用ajax form提交时，不用指定url，url就是form中定义的action
	  //此种方式和原始的post方式差不多，只不过使用了ajax方式
	  
	  //第一个参数：form的id
	  //第二个参数：sysusersave_callback是回调函数，sysusersave_callback当成一个方法的指针
	  //第三个参数：传入的参数， 可以为空
	  //第四个参数：dataType预期服务器返回的数据类型,这里action返回json
	  //根据form的id找到该form的action地址
	  jquerySubByFId('awardstuform',awardStusave_callback,null,"json");
	  
  }
  //ajax调用的回调函数，ajax请求完成调用此函数，传入的参数是action返回的结果
  function awardStusave_callback(data){
	  
	  message_alert(data);
	  
	  if(data.resultInfo.type=='1'){
		  //window.setInterval(" parent.closemodalwindow()",1000);每隔一秒执行一次
		  setTimeout(" parent.closemodalwindow()",1000);
		 
	  }
	  

	  
  }
  
  
  function checkteabh(value) {
	  
      $.ajax({
		 url:"${baseurl}awardstu/checkteabh.action",
			data:{
				"bh":value
			},
			type:"post",
			success:function(data){
				if(data!=null&& data!=undefined&&data!=''){
					var span=document.getElementById("span_tea");
					
					$(span).text(data.xm);
					
					var input_val=document.getElementById("awardStuCustom.teaid");

					$(input_val).val(data.teaid);
				}else{
					alert("查询失败，请重新输入。。。");
					$(document.getElementById("teacherCustom.bh")).val("");
				}
			},
			error:function(){
				alert("查询失败，请重新输入。。。");
				$(this).val("");
			}
			
			
			
	});
  }
  
  
  function checkstubh(value) {
	  
	 
	  $.ajax({
			 url:"${baseurl}awardstu/checkstubh.action",
				data:{
					"bh":value
				},
				type:"post",
				success:function(data){
					if(data!=null&& data!=undefined&&data!=''){
						var span=document.getElementById("span_stu");
						
						$(span).text(data.xm);
						
						//alert(data.xm);
						
						var input_val=document.getElementById("awardStuCustom.stuid");

						$(input_val).val(data.stuid);
					}else{
						alert("查询失败，请重新输入。。。");
						$(document.getElementById("studentCustom.bh")).val("");
					}
				},
				error:function(){
					alert("查询失败，请重新输入。。。");
					$(this).val("");
				}
				
				
				
		}); 
  }
 
</script>
</head>
<body>


<form id="awardstuform" action="${baseurl}awardstu/editawardstu_submit.action" method="post" enctype="multipart/form-data">
<input type="hidden" name="said" value="${awardStuCustom.said}">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;获奖信息</TD>
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
								<TD height=30 width="15%" align=right >奖项名称：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="awardStuCustom.jxmc" name="awardStuCustom.jxmc"  value="${awardStuCustom.jxmc}" />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >颁发单位：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="awardStuCustom.bfdw" name="awardStuCustom.bfdw"  value="${awardStuCustom.bfdw}" />
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >获奖时间：</TD>
								<TD class=category width="35%">
								<INPUT id="awardStuCustom.hjsj"
								name="awardStuCustom.hjsj"   value="<fmt:formatDate value="${awardStuCustom.hjsj}" pattern="yyyy-MM-dd"/>"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
								</TD>
								<TD height=30 width="15%" align=right >获奖级别：</TD>
								<TD class=category width="35%">
								<div>
								<select name="awardStuCustom.hjjb" id="awardStuCustom.hjjb">
									
									<option value="">请选择</option>
									<c:forEach items="${hjjb_info}" var="info">
									<option value="${info.dictcode}"  <c:if test="${awardStuCustom.hjjb==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
									</c:forEach>
		
								</select>
								</div>
								</TD>
								
								
							</TR>
							<TR>
							
							 
							
							    <TD height=30 width="15%" align=right >获奖人编号：</TD>
								<TD class=category width="35%">
								<div>
								<input type="hidden" id="awardStuCustom.stuid" name="awardStuCustom.stuid" value="${studentCustom.stuid}">
								<input type="text" id="studentCustom.bh" onchange="checkstubh(this.value)" value="${studentCustom.bh}"/>
								<span>姓名：</span><span id="span_stu">${studentCustom.xm}</span>
									<%-- 
									<input type="text" id="studentCustom.bh" onchange="checkstubh(this.value)" value="${studentCustom.bh}"/>
									 --%>
								</div>
								</TD>
								
								 <TD height=30 width="15%" align=right >指导老师编号：</TD>
								<TD class=category width="35%">
								<div>
									<input type="hidden" id="awardStuCustom.teaid" name="awardStuCustom.teaid" value="${teacherCustom.teaid}">
									<input type="text" id="teacherCustom.bh" onchange="checkteabh(this.value)" value="${teacherCustom.bh}"/>
									<span>姓名：</span><span id="span_tea">${teacherCustom.xm}</span>
								</div>
								</TD>
								
							</TR>
							<TR>
							
							 
							
							    <TD height=30 width="15%" align=right >附件：</TD>
								<TD class=category width="35%">
								<div>
									<input type="file" name="fj_file">
								</div>
								</TD>
								
							</TR>
						
							<tr>
							  <td colspan=4 align=center class=category>
								<a id="submitbtn"  class="easyui-linkbutton"   iconCls="icon-ok" href="#" onclick="awardStusave()">提交</a>
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