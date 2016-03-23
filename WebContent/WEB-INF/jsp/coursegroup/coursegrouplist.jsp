<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/base/tag.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- 引用jquery easy ui的js库及css -->
<LINK rel="stylesheet" type="text/css"
	href="${baseurl}js/easyui/styles/default.css">
<%@ include file="/WEB-INF/jsp/base/common_css.jsp"%>
<%@ include file="/WEB-INF/jsp/base/common_js.jsp"%>
<title>课程组信息管理</title>

<script type="text/javascript">

		//采购药品删除
		function coursegroupdelete(){
			_confirm('您确定要删除选择的课程组信息吗?',null,
					  function(){
								
						var indexs = [];//选择记录的序号
						var rows = $('#coursegrouplist').datagrid('getSelections');
						for(var i=0;i<rows.length;i++){
							var index=$('#coursegrouplist').datagrid('getRowIndex',rows[i]);
							indexs.push(index);
						}
						if(rows.length>0){
							$("#indexs").val(indexs.join(','));
							//由于删除和保存对同一个form进行操作，所以这里给yycgdmxForm的action重新赋值
							$("#coursegroupqueryForm").attr("action",'${baseurl}coursegroup/coursegroupdelete_submit.action');
							jquerySubByFId('coursegroupqueryForm', coursegroupdelete_callback, null);
						}else{
							alert_warn("请选择要删除的课程组信息");
						}
					  }
					)
		}
		function coursegroupdelete_callback(data) {
			var result = getCallbackData(data);
			_alert(result);
			queryawardtea();
		}





	//datagrid列定义
	var columns_v = [ [{
		checkbox:true
	},{
		field : 'cgid',//对应json中的key
		hidden : true,//隐藏
		formatter: function(value,row,index){
			return '<input type="hidden" name="coursegroupCustoms['+index+'].cgid" value="'+value+'" />';
		}
	},{
		field : 'kczmc',//对应json中的key
		title : '课程组名称',
		width : 180
	},{
		field : 'kczzxm',//对应json中的key
		title : '组长',
		width : 180,
		formatter: function(value,row,index){
			var str="尚未任命";
			
			if(value!=null && value!=undefined && value!=""){
				str=value;
			}
			
			return str;
		}
	}, {
		field : 'teachers',//对应json中的key
		title : '组员',
		width : 180,
		formatter: function(value,row,index){
			var str="尚未添加";
			for(var i=0;i<value.length;i++){
				str="";
				str+=value[i].smwcmc+":"+value[i].xm+"</br>";
			}
			return str;
		}
	}, {
		field : 'courses',//对应json中的key
		title : '课程',
		width : 180,
		formatter: function(value,row,index){
			var str="尚未添加";
			for(var i=0;i<value.length;i++){
				str="";
				str+=value[i].smwcmc+":"+value[i].xm+"</br>";
			}
			return str;
		}
	},{
		field : 'opt1',//对应json中的key
		title : '操作',
		width : 150,
		formatter : function(value, row, index) {//通过此方法格式化显示内容,value表示从json中取出该单元格的值，row表示这一行的数据，是一个对象,index:行的序号
			return "<a href=javascript:coursegroupteas('"+row.cgid+"')>组员管理</a>&nbsp;&nbsp;&nbsp;"
					+"<a href=javascript:editcoursegroup('"+row.cgid+"')>编辑</a></br>"
					+"<a href=javascript:coursegroupcous('"+row.cgid+"')>课程管理</a>&nbsp;&nbsp;&nbsp;"
					+"<a href=javascript:deletecoursegroup('"+row.cgid+"')>删除</a>";
		}
	} 
	
	
	
	] ];

	//定义 datagird工具
	var toolbar_v = [ {//工具栏
		id : 'btnadd',
		text : '添加',
		iconCls : 'icon-add',
		handler : function() {
			//打开一个窗口，用户添加页面
			//参数：窗口的title、宽、高、url地址
			createmodalwindow("添加项目信息", 900, 400, '${baseurl}coursegroup/addcoursegroup.action');
		}
	},{
		id : 'btndel',
		text : '批量刪除',
		iconCls : 'icon-remove',
		handler : 'coursegroupdelete'
	}
	];

	//加载datagrid

	$(function() {
		$('#coursegrouplist').datagrid({
			title : '课程组信息查询',//数据列表标题
			nowrap : true,//单元格中的数据不换行，如果为true表示不换行，不换行情况下数据加载性能高，如果为false就是换行，换行数据加载性能不高
			striped : true,//条纹显示效果
			url : '${baseurl}coursegroup/coursegrouplist_result.action',//加载数据的连接，引连接请求过来是json数据
			idField : 'cgid',//此字段很重要，数据结果集的唯一约束(重要)，如果写错影响 获取当前选中行的方法执行
			loadMsg : '',
			columns : columns_v,
			pagination : true,//是否显示分页
			rownumbers : true,//是否显示行号
			checkbox:true,
			pageList:[15,30,50],
			toolbar : toolbar_v
		});
	});
	
	//查询方法
	function querycoursegroup(){
		//datagrid的方法load方法要求传入json数据，最终将 json转成key/value数据传入action
		//将form表单数据提取出来，组成一个json
		var formdata = $("#coursegroupqueryForm").serializeJson();
		$('#coursegrouplist').datagrid('load',formdata);
	}
	
	//刪除用戶
	function deletecoursegroup(cgid){
		//第一个参数是提示信息，第二个参数，取消执行的函数指针，第三个参是，确定执行的函数指针
		_confirm('您确认删除吗？',null,function (){
			//将要删除的id赋值给deleteid，deleteid在sysuserdeleteform中
			$("#delete_id").val(cgid);
			//使用ajax的from提交执行删除
			//sysuserdeleteform：form的id，userdel_callback：删除回调函数，
			//第三个参数是url的参数
			//第四个参数是datatype，表示服务器返回的类型
			jquerySubByFId('coursegroupdeleteform',deletecoursegroup_callback,null,"json");
			
			
		});
	}
	
	//删除用户的回调
	function deletecoursegroup_callback(data){
		message_alert(data);
		//刷新 页面
		//在提交成功后重新加载 datagrid
		//取出提交结果
		var type=data.resultInfo.type;
		if(type==1){
			//成功结果
			//重新加载 datagrid
			querycoursegroup();
		}
	}
	
	

	function editcoursegroup(cgid){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("修改课程组信息", 900, 450, '${baseurl}coursegroup/editcoursegroup.action?cgid='+cgid);
	}
	
	function coursegroupteas(cgid){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("课程组组员管理", 900, 450, '${baseurl}/coursegroup/cgteas/cgteaslist.action?cgid='+cgid);
	}
	
	function coursegroupcous(cgid){
		//打开一个窗口，用户添加页面
		//参数：窗口的title、宽、高、url地址
		createmodalwindow("课程组课程管理", 900, 450, '${baseurl}/coursegroup/cgcous/cgcouslist.action?cgid='+cgid);
	}
	
</script>

</head>
<body>

	<!-- html的静态布局 -->
  <form id="coursegroupqueryForm" method="post">
  <input type="hidden" id="indexs" name="indexs"/>
	<!-- 查询条件 -->
	<TABLE  class="table_search">
				<TBODY>
					<TR>
					<TD class="left"> 参与人编号：</td>
						<td><input type="text" id="teabh" name="teacherCustom.bh"  value="${teacherCustom.bh}"/></TD>
							<TD height=30 width="15%" align=right >出版社：</TD>
								<td>
								<input type="text" id="coursegroupCustom.cbs" name="coursegroupCustom.cbs"   value="${coursegroupCustom.cbs}" />
								</td>
							
								
								
						<TD height=30 width="15%" align=right >出版时间：</TD>
								<TD class=category width="35%">
								<INPUT id="coursegroupCustom.cbsj_start"
								name="coursegroupCustom.cbsj_start"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
								----
								<INPUT id="coursegroupCustom.cbsj_end"
								name="coursegroupCustom.cbsj_end"
								onfocus="WdatePicker({isShowWeek:false,skin:'whyGreen',dateFmt:'yyyy-MM-dd'})"
								style="width: 80px" />
								</TD>
								
							
								
						
					</TR>
					<TR>
					<!-- 自行添加 -->
						<TD class="left">参与人姓名：</TD>
						<td ><input type="text" id="teaxm" name="teacherCustom.xm"  value="${teacherCustom.xm}"/></td>

					<TD height=30 width="15%" align=right>著作名称：</TD>
					<td><input type="text" id="coursegroupCustom.zzmc"
						name="coursegroupCustom.zzmc" value="${coursegroupCustom.zzmc}" /></TD>
					</TD>




					<!-- 自行添加 -->
						<TD height=30 width="15%" align=right >审核状态：</TD>
						<td >
						<select name="coursegroupCustom.shzt" id="coursegroupCustom.shzt">
									
						<option value="">请选择</option>
						<c:forEach items="${shzt_info}" var="info">
						<option value="${info.dictcode}"  <c:if test="${coursegroupCustom.shzt==info.dictcode}">selected</c:if>>${info.dictinfo}</option>
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
								
						
					
						<a id="btn" href="#" onclick="querycoursegroup()" class="easyui-linkbutton" iconCls='icon-search'>查询</a>
				  		</td>
					</tr>
					
				</TBODY>
			</TABLE>

	<!-- 查询列表 -->
	<TABLE border=0 cellSpacing=0 cellPadding=0 width="99%" align=center>
		<TBODY>
			<TR>
				<TD>
					<table id="coursegrouplist"></table>
				</TD>
			</TR>
		</TBODY>
	</TABLE>
</form>
<form id="coursegroupdeleteform" action="${baseurl}coursegroup/deletecoursegroup_submit.action" method="post">
  <input type="hidden" id="delete_id" name="cgid"/>
</form>

</body>
</html>


