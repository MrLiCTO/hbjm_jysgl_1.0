package com.shilong.jysgl.action.tea;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.pojo.vo.TeacherQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.CharData;
import com.shilong.jysgl.process.result.Chart;
import com.shilong.jysgl.process.result.ChartsDataSourceResult;
import com.shilong.jysgl.process.result.DataGridResultInfo;
import com.shilong.jysgl.process.result.ExceptionResultInfo;
import com.shilong.jysgl.process.result.PageQuery;
import com.shilong.jysgl.process.result.ResultInfo;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.process.result.SubmitResultInfo;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.service.impl.ImportTeaExcelServiceImpl;
import com.shilong.jysgl.utils.ExcelExportSXXSSF;
import com.shilong.jysgl.utils.HxlsRead;
import com.shilong.jysgl.utils.MyUtil;
import com.shilong.jysgl.utils.UUIDBuild;
@RequestMapping("/teacher")
@Controller
public class TeacherAction {
	@Resource
	private TeacherService teacherService;
	
	@Resource
	private DictInfoService dictInfoService;
	
	@Resource
	private ImportTeaExcelServiceImpl importTeaExcelService;
	
	@RequestMapping("/teacherlist")
	public String teacherlist(Model model) throws Exception{
		loaddata(model);
		
		return "/teacher/teacherlist";
	}
	
	
	@RequestMapping("/teacherlist_result")
	public @ResponseBody DataGridResultInfo teacherlist_result(Model model,TeacherQueryVo teacherQueryVo,int page,int rows) throws Exception{
		
		loaddata(model);
		
		int infoCount=teacherService.findTeacherCount(teacherQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(infoCount,rows, page);
		
		teacherQueryVo.setPageQuery(pageQuery);
		
		List<TeacherCustom> teacherList=teacherService.findTeacherList(teacherQueryVo);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(teacherList);
		
		resultInfo.setTotal(infoCount);
		
		return resultInfo;
	}
	
	@RequestMapping("/addteacher")
	public String addteacher(Model model) throws Exception{
		loaddata(model);
		return "/teacher/addteacher";
	}
	
	@RequestMapping("/addteacher_submit")
	public @ResponseBody SubmitResultInfo addteacher_submit(TeacherQueryVo teacherQueryVo) throws Exception{

		teacherService.insertTeacher(teacherQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editteacher")
	public String editteacher(String teaid,Model model) throws Exception{
		
		Teacher tea=teacherService.getTeacherById(teaid);
		
		model.addAttribute("teacherCustom",tea);
		
		loaddata(model);
		
		return "/teacher/editteacher";
	}
	
	@RequestMapping("/editteacher_submit")
	public @ResponseBody DataGridResultInfo editteacher_submit(String teaid,
		TeacherQueryVo teacherQueryVo) throws Exception{

		teacherService.updateTeacher(teaid, teacherQueryVo);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/modifypwd")
	public String modifypwd() throws Exception{

		return "/teacher/modifypwd";
	}
	
	@RequestMapping("/modifypwd_submit")
	public @ResponseBody DataGridResultInfo modifypwd_submit(String pwd,String pwd_rep,TeacherCustom teaUser) throws Exception{
		
		if(pwd!=null&&pwd_rep!=null&&pwd.equals(pwd_rep)){
			
			teacherService.modifypwd(pwd,teaUser.getTeaid());
			
			return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
		}
		
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,123,null));
	}
	
	@RequestMapping("/deleteteacher")
	public @ResponseBody DataGridResultInfo deleteteacher(String teaid) throws Exception{
		
		teacherService.deleteTeacherById(teaid);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	@RequestMapping("/teacherdelsubmit")
	public @ResponseBody SubmitResultInfo teacherdelsubmit(int[] indexs,TeacherQueryVo teacherQueryVo) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String teaid=teacherQueryVo.getTeacherCustoms().get(indexs[i]).getTeaid();
			try {
				teacherService.deleteTeacherById(teaid);
			} catch (Exception e) {
				e.printStackTrace();
				
				if(e instanceof ExceptionResultInfo){
					resultInfo=((ExceptionResultInfo) e).getResultInfo();
				}else{
					resultInfo=ResultUtil.createFail(Config.MESSAGE,900,null);

				}
				
			}
			
			if(resultInfo==null){
				count_success++;
			}else{
				
				count_error++;
				
				msgs_error.add(resultInfo);
			}
		}
			
		
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,907, new Object[]{count_success,count_error}),msgs_error);
	}
	
	
	@RequestMapping("/viewmyinfo")
	public String viewmyinfo(TeacherCustom teaUser,Model model) throws Exception{
		
		model.addAttribute("teacherCustom", teaUser);
		
		return "/teacher/viewmyinfo";
	}
	
	
	@RequestMapping("/analysisteacherinfo")
	public String analysisteacherinfo(Model model) throws Exception{
		loaddata(model);
		
		return "/teacher/analysisteacherinfo";
	}
	
	
	@RequestMapping("/analysisteacherinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisteacherinfo_submit(Model model,TeacherQueryVo teacherQueryVo,String grp_by) throws Exception{
		loaddata(model);
		
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=null;
		if(grp_by!=null&&!grp_by.equals("")){
	
			if(grp_by.equals("age_gr")){
				list=teacherService.analysisTeacherAgeInfo(teacherQueryVo);
				chart.setxAxisName("年龄段");
			}else if(grp_by.equals("xb_gr")){
				list=teacherService.analysisTeacherXbInfo(teacherQueryVo);
				chart.setxAxisName("性别");
			}else if(grp_by.equals("xw_gr")){
				list=teacherService.analysisTeacherXWInfo(teacherQueryVo);
				chart.setxAxisName("学位");
			}else{
				list=teacherService.analysisTeacherZzmmInfo(teacherQueryVo);
				chart.setxAxisName("政治面貌");
			}
			
		}
			
		CharData data1=null;
		
		for(Map map:list){
			
			String lable=(String) map.get("lable");
			String data =map.get("data")+"";
			
			//System.out.println(lable+":"+data);
			
			data1=new CharData();
			data1.setLabel(lable);
			data1.setValue(data);
			
			datas.add(data1);
		}
		
	
		
		chart.setCaption("教师信息统计图表");
		
		
		
		chart.setyAxisName("人数");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}
	
	
	
	@RequestMapping("/importteacher")
	public String importteacher(Model model) throws Exception{
		
		
		
		return "/teacher/importteacher";
	}

	@RequestMapping("/importteacher_submit")
	public @ResponseBody SubmitResultInfo importteacher_submit(MultipartFile teacherimportfile) throws Exception{
		
		String originalFilename=teacherimportfile.getOriginalFilename();
		
		File file=new File("E:/upload/linshi/"+UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf(".")));
		
		if(!file.exists()){
			file.mkdirs();
		}
		
		teacherimportfile.transferTo(file);
		
		String  absolutePath= file.getAbsolutePath();
		
		HxlsRead xls2csv=null;
		try {
			//第一个参数就是导入的文件
			//第二个参数就是导入文件中哪个sheet
			//第三个参数导入接口的实现类对象
			xls2csv = new HxlsRead(absolutePath,1,importTeaExcelService);//数据在sheet1
			xls2csv.process();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		long sum=xls2csv.getOptRows_sum();
		long success_num=xls2csv.getOptRows_success();
		long fail_num=xls2csv.getOptRows_failure();
		
		//获取失败记录
		
		List<List<String>> fail_list=xls2csv.getFailrows();
		List<String> title_list=xls2csv.getRowtitle();
		List<String> msgs_list=xls2csv.getFailmsgs();
		
		title_list.add("失败原因");
		
		for(int i=0;i<fail_list.size();i++){
			fail_list.get(i).add(msgs_list.get(i));
		}
		
		//-------------------
		
		//导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/linshi/";
		//String filePath =systemConfigService.findBasicinfoById("00301").getValue();
		//导出文件的前缀
		String filePrefix="teacher";
		//-1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows=100;
		
		//指导导出数据的title
		List<String> fieldNames=title_list;
		
		//告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes=new ArrayList<String>();
	
		fieldCodes.add("bh");//编号
		fieldCodes.add("xm");//姓名
		fieldCodes.add("js");//角色
		fieldCodes.add("xb");//性别
		fieldCodes.add("xy");//学院
		fieldCodes.add("csrq_str");//出生日期
		fieldCodes.add("yjfx");//研究方向
		fieldCodes.add("zzmm");//政治面貌
		
		
		//注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应
		
		
		//开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/", filePrefix, fieldNames, fieldCodes, flushRows);
		
		//准备导出的数据，将数据存入list，且list中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<TeacherCustom> list = new ArrayList<TeacherCustom>();
		TeacherCustom tea=null;
		for(int i=0;i<fail_list.size();i++){
			List<String> pro_list= fail_list.get(i);
			tea=new TeacherCustom();
			tea.setBh(pro_list.get(0));
			tea.setXm(pro_list.get(1));
			tea.setJs(pro_list.get(2));
			tea.setXb(pro_list.get(3));
			tea.setXy(pro_list.get(4));
			tea.setCsrq_str(pro_list.get(5));
			tea.setYjfx(pro_list.get(6));
			tea.setZzmm(pro_list.get(7));
			list.add(tea);
		}
		
		//执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		//输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();
		
		System.out.println(webpath);
		
		
		
		
		//--------------------------
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,315,new Object[]{success_num,fail_num,webpath}));
	}
	
	
	@RequestMapping("/exportteacher")
	public String exportteacher(Model model) throws Exception{
		
		loaddata(model);
		
		return "/teacher/exportteacher";
	}
	
	@RequestMapping("/exportteacher_submit")
	public @ResponseBody SubmitResultInfo exportteacher_submit(Model model,TeacherQueryVo teacherQueryVo) throws Exception{
		loaddata(model);
		//--------------------------
		//导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/linshi/";
		//String filePath =systemConfigService.findBasicinfoById("00301").getValue();
		//导出文件的前缀
		String filePrefix="teacher";
		//-1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows=100;
		
		//指导导出数据的title
		List<String> fieldNames=new ArrayList<String>();
		fieldNames.add("编号");
		fieldNames.add("姓名");
		fieldNames.add("角色");
		fieldNames.add("性别");
		fieldNames.add("学院");
		fieldNames.add("年龄");
		fieldNames.add("职称");
		fieldNames.add("学历");
		fieldNames.add("学位");
		fieldNames.add("所学专业");
		fieldNames.add("研究方向");
		fieldNames.add("政治面貌");
		
		//告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes=new ArrayList<String>();
		fieldCodes.add("bh");//编号
		fieldCodes.add("xm");//姓名
		fieldCodes.add("jsmc");//角色
		fieldCodes.add("xbmc");//性别
		fieldCodes.add("xymc");//学院
		fieldCodes.add("age");//年龄
		fieldCodes.add("zcmc");//职称
		fieldCodes.add("zzxlmc");//最终学历
		fieldCodes.add("zzxwmc");//最终学位
		fieldCodes.add("sxzy");//所学专业
		fieldCodes.add("yjfx");//研究方向
		fieldCodes.add("zzmmmc");//政治面貌
		
		
		
		//注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应
		
		
		//开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/", filePrefix, fieldNames, fieldCodes, flushRows);
		
		//准备导出的数据，将数据存入teacherList，且teacherList中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<TeacherCustom> teacherList=teacherService.findTeacherList(teacherQueryVo);
		
		
		//执行导出
		excelExportSXXSSF.writeDatasByObject(teacherList);
		//输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();
		
		System.out.println(webpath);
		
		
		//--------------------------
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,313, new Object[]{teacherList.size(),webpath}));
	}
	
	
	
	
	
	private void loaddata(Model model) throws Exception{
		List<Dictinfo> js_info = dictInfoService.findDictInfoList("002"); 
		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003"); 
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020"); 
		List<Dictinfo> zzxl_info = dictInfoService.findDictInfoList("017"); 
		List<Dictinfo> zzxw_info = dictInfoService.findDictInfoList("018"); 
		List<Dictinfo> zzmm_info = dictInfoService.findDictInfoList("019");
		List<Dictinfo> zc_info = dictInfoService.findDictInfoList("016");
		List<Dictinfo> zzzt_info = dictInfoService.findDictInfoList("021");
		
		model.addAttribute("js_info", js_info);
		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("zzxl_info", zzxl_info);
		model.addAttribute("zzxw_info", zzxw_info);
		model.addAttribute("zzmm_info", zzmm_info);
		model.addAttribute("zc_info", zc_info);
		model.addAttribute("zzzt_info", zzzt_info);
	}
}
