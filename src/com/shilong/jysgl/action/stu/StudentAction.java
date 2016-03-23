package com.shilong.jysgl.action.stu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Student;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.AwardStuQueryVo;
import com.shilong.jysgl.pojo.vo.StudentCustom;
import com.shilong.jysgl.pojo.vo.StudentQueryVo;
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
import com.shilong.jysgl.service.StudentService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.service.impl.ImportStuExcelServiceImpl;
import com.shilong.jysgl.utils.ExcelExportSXXSSF;
import com.shilong.jysgl.utils.HxlsRead;
import com.shilong.jysgl.utils.MyUtil;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 * @Descriptrion :
 * @author mr-li
 * @Company www.shilong.com
 * @CreateDate 2015年11月19日
 */
@Controller
@RequestMapping("/student")
public class StudentAction {

	@Resource
	private TeacherService teacherService;

	@Resource
	private StudentService studentService;

	@Resource
	private DictInfoService dictInfoService;

	@Resource
	private ImportStuExcelServiceImpl importStuExcelService;

	@RequestMapping("/studentlist")
	public String studentlist(Model model) throws Exception {

		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003");
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020");
		List<Dictinfo> xszt_info = dictInfoService.findDictInfoList("014");

		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("xszt_info", xszt_info);

		return "/student/studentlist";
	}

	@RequestMapping("/studentlist_result")
	public @ResponseBody DataGridResultInfo studentlist_result(Model model, StudentQueryVo studentQueryVo, int page,
			int rows) throws Exception {
		int infoCount = studentService.findStudentCount(studentQueryVo);

		PageQuery pageQuery = new PageQuery();

		pageQuery.setPageParams(infoCount, rows, page);

		studentQueryVo.setPageQuery(pageQuery);

		List<StudentCustom> studentList = studentService.findStudentList(studentQueryVo);

		DataGridResultInfo resultInfo = new DataGridResultInfo();

		resultInfo.setRows(studentList);

		resultInfo.setTotal(infoCount);

		return resultInfo;
	}

	@RequestMapping("/addstudent")
	public String addstudent(Model model) throws Exception {

		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003");
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020");
		List<Dictinfo> xszt_info = dictInfoService.findDictInfoList("014");

		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("xszt_info", xszt_info);

		return "/student/addstudent";
	}

	@RequestMapping("/addstudent_submit")
	public @ResponseBody SubmitResultInfo addstudent_submit(StudentQueryVo studentQueryVo) throws Exception {

		studentService.insertStudent(studentQueryVo);

		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	@RequestMapping("/editstudent")
	public String editstudent(Model model, String stuid) throws Exception {

		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003");
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020");
		List<Dictinfo> xszt_info = dictInfoService.findDictInfoList("014");

		Student student = studentService.getStudentById(stuid);

		Teacher teacher = teacherService.getTeacherById(student.getTeaid());

		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("xszt_info", xszt_info);
		model.addAttribute("studentCustom", student);
		model.addAttribute("teacherCustom", teacher);

		return "/student/editstudent";
	}

	@RequestMapping("/editstudent_submit")
	public @ResponseBody SubmitResultInfo editstudent_submit(StudentQueryVo studentQueryVo, String stuid)
			throws Exception {

		studentService.updateStudent(stuid, studentQueryVo);

		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}

	@RequestMapping("/exportstudent")
	public String exportstudent(Model model) throws Exception {

		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003");
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020");
		List<Dictinfo> xszt_info = dictInfoService.findDictInfoList("014");

		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("xszt_info", xszt_info);

		return "/student/exportstudent";
	}

	@RequestMapping("/exportstudent_submit")
	public @ResponseBody SubmitResultInfo exportstudent_submit(Model model, StudentQueryVo studentQueryVo)
			throws Exception {

		// 导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/linshi/";
		// String filePath
		// =systemConfigService.findBasicinfoById("00301").getValue();
		// 导出文件的前缀
		String filePrefix = "student";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;

		//指导导出数据的title
		List<String> fieldNames=new ArrayList<String>();
		fieldNames.add("编号");
		fieldNames.add("姓名");
		fieldNames.add("性别");
		fieldNames.add("学院");
		fieldNames.add("班级");
		fieldNames.add("专业");
		fieldNames.add("电话");
		fieldNames.add("QQ");
		fieldNames.add("邮箱");
		fieldNames.add("辅导教师编号");

		// 告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes = new ArrayList<String>();

		fieldCodes.add("bh");// 编号
		fieldCodes.add("xm");// 姓名
		fieldCodes.add("xbmc");// 性别
		fieldCodes.add("xymc");// 学院
		fieldCodes.add("bj");// 班级
		fieldCodes.add("zy");// 研究方向
		fieldCodes.add("phone");// 政治面貌
		fieldCodes.add("qq");// 政治面貌
		fieldCodes.add("email");// 政治面貌
		fieldCodes.add("teacherbh");// 政治面貌

		// 注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/", filePrefix,
						fieldNames, fieldCodes, flushRows);

		//准备导出的数据，将数据存入teacherList，且teacherList中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<StudentCustom> studentList = studentService.findStudentList(studentQueryVo);
		//执行导出
		excelExportSXXSSF.writeDatasByObject(studentList);
		//输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();
		
		System.out.println(webpath);
		
		
		//--------------------------
		
		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,313, new Object[]{studentList.size(),webpath}));
	}

	@RequestMapping("/importstudent")
	public String importstudent(Model model) throws Exception {

		return "/student/importstudent";
	}

	@RequestMapping("/importstudent_submit")
	public @ResponseBody SubmitResultInfo importstudent_submit(MultipartFile studentimportfile) throws Exception {
		String originalFilename = studentimportfile.getOriginalFilename();

		File file = new File("E:/upload/linshi/" + UUIDBuild.getUUID()
				+ originalFilename.substring(originalFilename.lastIndexOf(".")));

		if (!file.exists()) {
			file.mkdirs();
		}

		studentimportfile.transferTo(file);

		String absolutePath = file.getAbsolutePath();

		HxlsRead xls2csv = null;
		try {
			// 第一个参数就是导入的文件
			// 第二个参数就是导入文件中哪个sheet
			// 第三个参数导入接口的实现类对象
			xls2csv = new HxlsRead(absolutePath, 1, importStuExcelService);// 数据在sheet1
			xls2csv.process();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		long sum = xls2csv.getOptRows_sum();
		long success_num = xls2csv.getOptRows_success();
		long fail_num = xls2csv.getOptRows_failure();

		// 获取失败记录

		List<List<String>> fail_list = xls2csv.getFailrows();
		List<String> title_list = xls2csv.getRowtitle();
		List<String> msgs_list = xls2csv.getFailmsgs();

		title_list.add("失败原因");

		for (int i = 0; i < fail_list.size(); i++) {
			fail_list.get(i).add(msgs_list.get(i));
		}

		// -------------------

		// 导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/linshi/";
		// String filePath
		// =systemConfigService.findBasicinfoById("00301").getValue();
		// 导出文件的前缀
		String filePrefix = "student";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;

		// 指导导出数据的title
		List<String> fieldNames = title_list;

		// 告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes = new ArrayList<String>();

		fieldCodes.add("bh");// 编号
		fieldCodes.add("xm");// 姓名
		fieldCodes.add("xb");// 性别
		fieldCodes.add("xy");// 学院
		fieldCodes.add("bj");// 班级
		fieldCodes.add("zy");// 研究方向
		fieldCodes.add("phone");// 政治面貌
		fieldCodes.add("qq");// 政治面貌
		fieldCodes.add("email");// 政治面貌
		fieldCodes.add("teaid");// 政治面貌

		// 注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/", filePrefix,
				fieldNames, fieldCodes, flushRows);

		// 准备导出的数据，将数据存入list，且list中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<StudentCustom> list = new ArrayList<StudentCustom>();
		StudentCustom stu = null;
		for (int i = 0; i < fail_list.size(); i++) {
			List<String> pro_list = fail_list.get(i);
			stu = new StudentCustom();
			stu.setBh(pro_list.get(0));
			stu.setXm(pro_list.get(1));
			stu.setXb(pro_list.get(2));
			stu.setXy(pro_list.get(3));
			stu.setBj(pro_list.get(4));
			stu.setZy(pro_list.get(5));
			stu.setPhone(pro_list.get(6));
			stu.setQq(pro_list.get(7));
			stu.setEmail(pro_list.get(8));
			stu.setTeaid(pro_list.get(9));

			list.add(stu);
		}

		// 执行导出
		excelExportSXXSSF.writeDatasByObject(list);
		// 输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();

		System.out.println(webpath);

		// --------------------------

		return ResultUtil.createSubmitResult(
				ResultUtil.createSuccess(Config.MESSAGE, 315, new Object[] { success_num, fail_num, webpath }));
	}
	
	
	@RequestMapping("/deletestudent")
	public @ResponseBody SubmitResultInfo deletestudent(String stuid) throws Exception{
		
		studentService.deleteStudentById(stuid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	@RequestMapping("/studentdelsubmit")
	public @ResponseBody SubmitResultInfo studentdelsubmit(StudentQueryVo studentQueryVo,int[] indexs) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String stuid=studentQueryVo.getStudentCustoms().get(indexs[i]).getStuid();
			try {
				studentService.deleteStudentById(stuid);
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
	

	@RequestMapping("/checkbh")
	public @ResponseBody Teacher checkbh(String bh) throws Exception {

		Teacher tea = teacherService.getTeacherBybh(bh);

		if (tea == null) {
			return null;
		}

		return tea;
	}
	
	
	
	@RequestMapping("/analysisstudentinfo")
	public String analysisstudentinfo(Model model) throws Exception{
		List<Dictinfo> xb_info = dictInfoService.findDictInfoList("003");
		List<Dictinfo> xy_info = dictInfoService.findDictInfoList("020");
		List<Dictinfo> xszt_info = dictInfoService.findDictInfoList("014");
		
		List<Integer> rxsj_info=new ArrayList<Integer>();
		
		for(int i=0;i<=5;i++){
			int year = MyUtil.getYear(new Date());
			
			rxsj_info.add(year-i);
		}
		
		model.addAttribute("xb_info", xb_info);
		model.addAttribute("xy_info", xy_info);
		model.addAttribute("xszt_info", xszt_info);
		model.addAttribute("rxsj_info", rxsj_info);
		
		return "/student/analysisstudentinfo";
	}
	@RequestMapping("/analysisstudentinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisstudentinfo_submit(StudentQueryVo studentQueryVo) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=studentService.analysisstudentinfo(studentQueryVo);
		
		CharData data1=null;
		
		for(Map map:list){
			
			String lable= map.get("lable")+"";
			String data =map.get("data")+"";
			
			//System.out.println(lable+":"+data);
			
			data1=new CharData();
			data1.setLabel(lable);
			data1.setValue(data);
			
			datas.add(data1);
		}
		
	
		
		chart.setCaption("学生信息统计图表");
		
		
		
		chart.setyAxisName("人数");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}

}
