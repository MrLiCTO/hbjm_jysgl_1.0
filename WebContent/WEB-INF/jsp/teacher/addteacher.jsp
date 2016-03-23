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
	  
	  
	 // alert(data.message);
	  /* if(data.type=='0'){
		  $.messager.alert('提示信息',data.message,'success');
	  }else{
		  $.messager.alert('提示信息',data.message,'error');
	  } */
	 
	  //action返回的是json数据
	  //如果是成功显示一个对号
	  
	  //如果是错误信息
	  
	//提交结果类型
	//data中存放的是action返回Resultinfo，有一个type
		/* var type=data.resultInfo.type;
		//结果提示信息
		var message=data.resultInfo.message;
		//alert(message);
		if(type==0){
			//如果type等于0表示失败，调用 jquery easyui的信息提示组件
			$.messager.alert('提示信息',message,'error');
		}else if(type==1){
			$.messager.alert('提示信息',message,'success');
		}else if(type==2){
			$.messager.alert('提示信息',message,'warning');
		}else if(type==3){
			$.messager.alert('提示信息',message,'info');
		}
	   */
	 
	  
  }
 
</script>
</head>
<body>


<form id="userform" action="${baseurl}teacher/addteacher_submit.action" method="post">
<TABLE border=0 cellSpacing=0 cellPadding=0 width="100%" bgColor=#c4d8ed>

   <TBODY>
   <TR>
				<TD background=images/r_0.gif width="100%">
					<TABLE cellSpacing=0 cellPadding=0 width="100%">
						<TBODY>
							<TR>
								<TD>&nbsp;教师信息</TD>
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
								<TD height=30 width="15%" align=right >教师编号：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="teacher_bh" name="teacherCustom.bh"  />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >教师名称：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="teacher_xm" name="teacherCustom.xm"  />
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >教师角色：</TD>
								<TD class=category width="35%">
								<div>
									<select name="teacherCustom.js" id="teacher_js">
									
								<option value="">请选择</option>
								<c:forEach items="${js_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
								
	
								</select>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >教师性别：</TD>
								<TD class=category width="35%">
								<div>
								<select name="teacherCustom.xb" id="teacher_xb">
									
								<option value="">请选择</option>
								<c:forEach items="${xb_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
								</div>
								<div id="sysuser_groupidTip"></div>
								</TD>
								
								
							</TR>
							<TR>
							    <TD height=30 width="15%" align=right >学院：</TD><!-- 用处：根据名称获取单位id -->
								<TD class=category width="35%">
								<div>
									<select name="teacherCustom.xy" id="teacher_xy">
									
								<option value="">请选择</option>
								<c:forEach items="${xy_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
								</div>
								</TD>
								<TD height=30 width="15%" align=right>职称：</TD>
								<TD class=category width="35%">
									<select name="teacherCustom.zc" id="teacher_zc">
									
								<option value="">请选择</option>
								<c:forEach items="${zc_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
							
								</TD>
								
							</TR>
							
								<TR>
								<TD height=30 width="15%" align=right >最终学历：</TD>
								<TD class=category width="35%">
								<div>
									<select name="teacherCustom.zzxl" id="teacher_zzxl">
									
								<option value="">请选择</option>
								<c:forEach items="${zzxl_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >最终学位：</TD>
								<TD class=category width="35%">
								<div>
								<select name="teacherCustom.zzxw" id="teacher_zzxw">
									
								<option value="">请选择</option>
									<c:forEach items="${zzxw_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
								</div>
								<div id="teacher_xb"></div>
								</TD>
								
								
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >毕业院校：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="teacher_byyx" name="teacherCustom.byyx"  />
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >所学专业：</TD>
								<TD class=category width="35%">
								<div>
								<input type="text" id="teacher_sxzy" name="teacherCustom.sxzy"  />
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >政治面貌：</TD>
								<TD class=category width="35%">
								<div>
									<select name="teacherCustom.zzmm" id="teacher_zzmm">
									
								<option value="">请选择</option>
									<c:forEach items="${zzmm_info}" var="info">
									<option value="${info.dictcode}">${info.dictinfo}</option>
								</c:forEach>
	
								</select>
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >研究方向：</TD>
								<TD class=category width="35%">
								<input type="text" id="teacher_yjfx" name="teacherCustom.yjfx"  />
								</TD>
								
								
							</TR>
							
								<TR>
								<TD height=30 width="15%" align=right >出生日期：</TD>
								<TD class=category width="35%">
								<INPUT id="teacherCustom.csrq"
								name="teacherCustom.csrq"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
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