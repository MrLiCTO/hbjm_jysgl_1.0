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
</script>
</head>
<body>

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
								${teaUser.bh}
								</div>
								
								</TD>
								<TD height=30 width="15%" align=right >教师名称：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.xm}
								</div>
								<div id="sysuser_usernameTip"></div>
								</TD>
							</TR>
							<TR>
								<TD height=30 width="15%" align=right >教师角色：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.jsmc}
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >教师性别：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.xbmc}
								</div>
								<div id="sysuser_groupidTip"></div>
								</TD>
								
								
							</TR>
							<TR>
							    <TD height=30 width="15%" align=right >学院：</TD><!-- 用处：根据名称获取单位id -->
								<TD class=category width="35%">
								<div>
									${teaUser.xymc}
								</div>
								</TD>
								<TD height=30 width="15%" align=right>职称：</TD>
								<TD class=category width="35%">
								${teaUser.zcmc}
								</TD>
								
							</TR>
							
								<TR>
								<TD height=30 width="15%" align=right >最终学历：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.zzxlmc}
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >最终学位：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.zzxwmc}
								</div>
								</TD>
								
								
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >毕业院校：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.byyx}
								</div>
								<!-- sysuser_useridTip用于显示提示信息，提示div的id等于校验input的id+Tip -->
								<div id="sysuser_useridTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >所学专业：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.sxzy}
								</div>
								
								</TD>
							</TR>
							
							<TR>
								<TD height=30 width="15%" align=right >政治面貌：</TD>
								<TD class=category width="35%">
								<div>
								${teaUser.zzmmmc}
								</div>
								<div id="sysuser_passwordTip"></div>
								</TD>
								<TD height=30 width="15%" align=right >研究方向：</TD>
								<TD class=category width="35%">
								${teaUser.yjfx}
								</TD>
								
								
							</TR>
								<TR>
								<TD height=30 width="15%" align=right >在职状态：</TD>
								<TD class=category width="35%">
								${teaUser.zzztmc}
								</TD>
								
								<TD height=30 width="15%" align=right >年龄：</TD>
								<TD class=category width="35%">
								
								${teaUser.age}
							
								</TD>
								
								
							</TR>
						
							</TBODY>
						</TABLE>
					</TD>
				</TR>
   </TBODY>
</TABLE>
</body>
</html>