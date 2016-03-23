package com.shilong.jysgl.action.cou;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Sourcefile;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseCustom;
import com.shilong.jysgl.pojo.vo.CourseQueryVo;
import com.shilong.jysgl.pojo.vo.SourceFileCustom;
import com.shilong.jysgl.pojo.vo.StudentCustom;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.DataGridResultInfo;
import com.shilong.jysgl.process.result.ExceptionResultInfo;
import com.shilong.jysgl.process.result.PageQuery;
import com.shilong.jysgl.process.result.ResultInfo;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.process.result.SubmitResultInfo;
import com.shilong.jysgl.service.CourseService;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.SourceFileService;
import com.shilong.jysgl.service.impl.ImportCouExcelServiceImpl;
import com.shilong.jysgl.utils.ExcelExportSXXSSF;
import com.shilong.jysgl.utils.HxlsRead;
import com.shilong.jysgl.utils.UUIDBuild;
import com.sun.xml.internal.messaging.saaj.packaging.mime.Header;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月2日
 */
@Controller
@RequestMapping("/course")
public class CourseAction {
	
	@Resource
	private CourseService courseService;
	
	@Resource
	private DictInfoService dictinfoService;
	
	@Resource
	private SourceFileService sourceFileService;
	
	@Resource
	private ImportCouExcelServiceImpl importCouExcelService;

	@RequestMapping("/courselist")
	public String courselist(Model model) throws Exception {
		
		List<Dictinfo> jpkjb_info = dictinfoService.findDictInfoList("009");
		List<Dictinfo> lb_info = dictinfoService.findDictInfoList("008");
		
		model.addAttribute("jpkjb_info",jpkjb_info);
		model.addAttribute("lb_info",lb_info);
		
		return "/course/courselist";
	
	}
	
	@RequestMapping("/courselist_result")
	public @ResponseBody DataGridResultInfo courselist_result(CourseQueryVo courseQueryVo,int page,int rows) throws Exception {
		
		int infoCount=courseService.findCourseCount(courseQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(infoCount,rows, page);
		
		courseQueryVo.setPageQuery(pageQuery);
		
		List<CourseCustom> list = courseService.findCourseList(courseQueryVo);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(infoCount);
		
		return resultInfo;

	}
	
	@RequestMapping("/addcourse")
	public String addcourse(Model model) throws Exception {
		
		List<Dictinfo> jpkjb_info = dictinfoService.findDictInfoList("009");
		List<Dictinfo> lb_info = dictinfoService.findDictInfoList("008");
		
		model.addAttribute("jpkjb_info",jpkjb_info);
		model.addAttribute("lb_info",lb_info);
		
		return "/course/addcourse";
	
	}
	
	@RequestMapping("/addcourse_submit")
	public @ResponseBody SubmitResultInfo addcourse_submit(CourseQueryVo courseQueryVo) throws Exception {
		
		courseService.insertCourse(courseQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	
	}
	
	@RequestMapping("/editcourse")
	public String editcourse(String cid,Model model) throws Exception {
		
		Course cou=courseService.getCourseById(cid);
		
		List<Dictinfo> jpkjb_info = dictinfoService.findDictInfoList("009");
		List<Dictinfo> lb_info = dictinfoService.findDictInfoList("008");
		
		model.addAttribute("jpkjb_info",jpkjb_info);
		model.addAttribute("lb_info",lb_info);
		model.addAttribute("courseCustom",cou);
		
		return "/course/editcourse";
	
	}
	
	@RequestMapping("/editcourse_submit")
	public @ResponseBody SubmitResultInfo editcourse_submit(CourseQueryVo courseQueryVo,String cid) throws Exception {
		
		
		courseService.updateCourse(cid, courseQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/deletecourse_submit")
	public @ResponseBody SubmitResultInfo deletecourse_submit(String cid) throws Exception{
		
		courseService.deleteCourseById(cid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	@RequestMapping("/coursedelete_submit")
	public @ResponseBody SubmitResultInfo coursedelete_submit(int[] indexs,CourseQueryVo courseQueryVo) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String cid=courseQueryVo.getCourseCustoms().get(indexs[i]).getCid();
			try {
				courseService.deleteCourseById(cid);
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
	
	@RequestMapping("/importcourse")
	public String importcourse() throws Exception{

		return "/course/importcourse";
	}
	
	@RequestMapping("/importcourse_submit")
	public @ResponseBody SubmitResultInfo importcourse_submit(MultipartFile courseimportfile) throws Exception{
		String originalFilename = courseimportfile.getOriginalFilename();

		File file = new File("E:/upload/linshi/coufile/" + UUIDBuild.getUUID()
				+ originalFilename.substring(originalFilename.lastIndexOf(".")));

		if (!file.exists()) {
			file.mkdirs();
		}

		courseimportfile.transferTo(file);

		String absolutePath = file.getAbsolutePath();

		HxlsRead xls2csv = null;
		try {
			// 第一个参数就是导入的文件
			// 第二个参数就是导入文件中哪个sheet
			// 第三个参数导入接口的实现类对象
			xls2csv = new HxlsRead(absolutePath, 1, importCouExcelService);// 数据在sheet1
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
		String filePath = "e:/upload/linshi/coufile/";
		// String filePath
		// =systemConfigService.findBasicinfoById("00301").getValue();
		// 导出文件的前缀
		String filePrefix = "course";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;

		// 指导导出数据的title
		List<String> fieldNames = title_list;

		// 告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes = new ArrayList<String>();

		fieldCodes.add("kcmc");
		fieldCodes.add("kch");
		fieldCodes.add("lb");
		fieldCodes.add("xf_e");
		fieldCodes.add("llks_e");
		fieldCodes.add("sjks_e");
		fieldCodes.add("kkxq");
		fieldCodes.add("sfsjpk");
		fieldCodes.add("jpkjb");
		fieldCodes.add("sfsywlkt");
		fieldCodes.add("sbyy");

		// 注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/coufile/", filePrefix,
				fieldNames, fieldCodes, flushRows);

		// 准备导出的数据，将数据存入list，且list中对象的字段名称必须是刚才传入ExcelExportSXXSSF的名称
		List<CourseCustom> list = new ArrayList<CourseCustom>();
		CourseCustom cou = null;
		for (int i = 0; i < fail_list.size(); i++) {
			List<String> pro_list = fail_list.get(i);
			
			cou=new CourseCustom();
			
			cou.setKcmc(pro_list.get(0));
			
			cou.setKch(pro_list.get(1));
			
			cou.setLb(pro_list.get(2));
			
			cou.setXf_e(pro_list.get(3));
			
			cou.setLlks_e(pro_list.get(4));
			
			cou.setSjks_e(pro_list.get(5));
			
			cou.setKkxq(pro_list.get(6));
			
			cou.setSfsjpk(pro_list.get(7));
			
			cou.setJpkjb(pro_list.get(8));
			
			cou.setSfsywlkt(pro_list.get(9));

			cou.setSbyy(pro_list.get(10));
			
			list.add(cou);
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
	
	
	@RequestMapping("/exportcourse")
	public String exportcourse(Model model) throws Exception{
		List<Dictinfo> jpkjb_info = dictinfoService.findDictInfoList("009");
		List<Dictinfo> lb_info = dictinfoService.findDictInfoList("008");
		
		model.addAttribute("jpkjb_info",jpkjb_info);
		model.addAttribute("lb_info",lb_info);
		return "/course/exportcourse";
	}
	
	
	@RequestMapping("/exportcourse_submit")
	public @ResponseBody SubmitResultInfo exportcourse_submit(CourseQueryVo courseQueryVo) throws Exception{
		
		List<CourseCustom> courseList = courseService.findCourseList(courseQueryVo);
		
		// 导出文件存放的路径，并且是虚拟目录指向的路径
		String filePath = "e:/upload/linshi/coufile/";
		File file = new File(filePath);
		if(!file.exists()){
			file.mkdirs();
		}
		
		// String filePath
		// =systemConfigService.findBasicinfoById("00301").getValue();
		// 导出文件的前缀
		String filePrefix = "course";
		// -1表示关闭自动刷新，手动控制写磁盘的时机，其它数据表示多少数据在内存保存，超过的则写入磁盘
		int flushRows = 100;

		// 指导导出数据的title
		List<String> fieldNames =new ArrayList<String>();
		
		fieldNames.add("课程名称");
		fieldNames.add("课程号");
		fieldNames.add("类别");
		fieldNames.add("学分");
		fieldNames.add("理论课时");
		fieldNames.add("实践课时");
		fieldNames.add("开课学期");
		fieldNames.add("是否是精品课");
		fieldNames.add("精品课级别");
		fieldNames.add("是否使用网络课堂");

		// 告诉导出类数据list中对象的属性，让ExcelExportSXXSSF通过反射获取对象的值
		List<String> fieldCodes = new ArrayList<String>();

		fieldCodes.add("kcmc");
		fieldCodes.add("kch");
		fieldCodes.add("lbmc");
		fieldCodes.add("xf");
		fieldCodes.add("llks");
		fieldCodes.add("sjks");
		fieldCodes.add("kkxq_e");
		fieldCodes.add("sfsjpk_e");
		fieldCodes.add("jpkjbmc");
		fieldCodes.add("sfsywlkt_e");

		// 注意：fieldCodes和fieldNames个数必须相同且属性和title顺序一一对应，这样title和内容才一一对应

		// 开始导出，执行一些workbook及sheet等对象的初始创建
		ExcelExportSXXSSF excelExportSXXSSF = ExcelExportSXXSSF.start(filePath, "/upload/linshi/coufile/", filePrefix,fieldNames, fieldCodes, flushRows);
		
		// 执行导出
		excelExportSXXSSF.writeDatasByObject(courseList);
		// 输出文件，返回下载文件的http地址
		String webpath = excelExportSXXSSF.exportFile();

		System.out.println(webpath);

		// --------------------------

		return ResultUtil.createSubmitResult(ResultUtil.createSuccess(Config.MESSAGE,313, new Object[]{courseList.size(),webpath}));
	}
	
	
	//couteas
		
	@RequestMapping("/couteas/couteaslist")
	public String couteaslist(String cid,Model model) throws Exception{
		model.addAttribute("cid",cid);
		return "/course/couteas/couteaslist";
	}
	
	@RequestMapping("/couteas/couteaslist_result")
	public @ResponseBody DataGridResultInfo couteaslist_result(CourseQueryVo courseQueryVo,String cid,int page,int rows) throws Exception{
		
		 
		int count = courseService.getTeasByCidcount(cid, courseQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseQueryVo.setPageQuery(pageQuery);
		
		List<Teacher> list = courseService.getTeasByCid(cid,courseQueryVo);
		
		DataGridResultInfo resultinfo=new DataGridResultInfo();
		
		resultinfo.setTotal(count);
		
		resultinfo.setRows(list);
		
		return resultinfo;
	}
	
	
	@RequestMapping("/couteas/allteaslist")
	public String allteaslist(String cid,Model model) throws Exception{
		model.addAttribute("cid",cid);
		return "/course/couteas/allteaslist";
	}
	
	@RequestMapping("/couteas/allteaslist_result")
	public @ResponseBody DataGridResultInfo allteaslist_result(CourseQueryVo courseQueryVo,String cid,int page,int rows) throws Exception{
		 
		int count = courseService.getAllTeasCount(cid, courseQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseQueryVo.setPageQuery(pageQuery);
		
		List<Teacher> list = courseService.getAllTeas(cid, courseQueryVo);
		
		DataGridResultInfo resultinfo=new DataGridResultInfo();
		
		resultinfo.setTotal(count);
		
		resultinfo.setRows(list);
		
		return resultinfo;
	}
	
	@RequestMapping("/couteas/addcoutea_submit")
	public @ResponseBody SubmitResultInfo addcoutea_submit(String cid,String teaid) throws Exception {
		
		courseService.addTeaByCid(cid, teaid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	
	}
	
	@RequestMapping("/couteas/couteaadd_submit")
	public @ResponseBody SubmitResultInfo couteaadd_submit(int[] indexs,String cid,CourseQueryVo courseQueryVo) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String teaid=courseQueryVo.getTeacherCustoms().get(indexs[i]).getTeaid();
			try {
				courseService.addTeaByCid(cid, teaid);
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
	
	@RequestMapping("/couteas/delcoutea_submit")
	public @ResponseBody SubmitResultInfo delcoutea_submit(String cid,String teaid) throws Exception {
		
		courseService.deleteTeaByCid(cid, teaid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	
	}
	
	@RequestMapping("/couteas/couteadel_submit")
	public @ResponseBody SubmitResultInfo couteadel_submit(String cid,CourseQueryVo courseQueryVo,int[] indexs) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String teaid=courseQueryVo.getTeacherCustoms().get(indexs[i]).getTeaid();
			try {
				courseService.deleteTeaByCid(cid, teaid);
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
	
	//couteas
		
	
	
	
	//coufiles
	
	@RequestMapping("/coufiles/coufileslist")
	public String coufileslist(String cid,Model model) throws Exception{
		List<Dictinfo> zywjlx_info =dictinfoService.findDictInfoList("022");
		
		model.addAttribute("cid",cid);
		
		model.addAttribute("zywjlx_info",zywjlx_info);
		
		return "/course/coufiles/coufileslist";
	}
	
	@RequestMapping("/coufiles/coufileslist_result")
	public @ResponseBody DataGridResultInfo coufileslist_result(CourseQueryVo courseQueryVo,String cid,int rows,int page) throws Exception{
		
		int fileCount = sourceFileService.findSourceFileCount(cid, courseQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(fileCount, rows, page);
		
		courseQueryVo.setPageQuery(pageQuery);
		
		List<SourceFileCustom> list =sourceFileService.findSourceFileList(cid, courseQueryVo);
		
		DataGridResultInfo resultinfo=new DataGridResultInfo();
		
		resultinfo.setTotal(fileCount);
		
		resultinfo.setRows(list);
		
		return resultinfo;
	}
	
	@RequestMapping("/coufiles/addcoufile")
	public String addcoufile(String cid,Model model) throws Exception{
		
		List<Dictinfo> zywjlx_info =dictinfoService.findDictInfoList("022");
		
		model.addAttribute("cid",cid);
		model.addAttribute("zywjlx_info",zywjlx_info);
		
		return "/course/coufiles/addcoufile";
	}
		
	
	@RequestMapping("/coufiles/addcoufile_submit")
	public @ResponseBody SubmitResultInfo addcoufile_submit(String cid,TeacherCustom teaUser,CourseQueryVo courseQueryVo,MultipartFile fj_file ) throws Exception{
		
		SourceFileCustom sourceFileCustom = courseQueryVo.getSourcefileCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/coufile/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			long size = fj_file.getSize();
			
			sourceFileCustom.setWjdx(size);
			
			fj_file.transferTo(file);
			
			sourceFileCustom.setWjlj("/upload/coufile/"+new_filename);	
		}
		
		
		String teaid=teaUser.getTeaid();
		sourceFileService.insertSourceFile(cid,teaid, courseQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	@RequestMapping("/coufiles/editcoufile")
	public String editcoufile(String sfid,Model model) throws Exception{
		
		Sourcefile sourcefile = sourceFileService.getSourceFileById(sfid);
		
		List<Dictinfo> zywjlx_info =dictinfoService.findDictInfoList("022");

		model.addAttribute("zywjlx_info",zywjlx_info);
		
		model.addAttribute("sourcefileCustom",sourcefile);
		
		return "/course/coufiles/editcoufile";
	}
	
	@RequestMapping("/coufiles/editcoufile_submit")
	public @ResponseBody SubmitResultInfo editcoufile_submit(String sfid,CourseQueryVo courseQueryVo) throws Exception{
		
		sourceFileService.updateSourceFile(sfid, courseQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	@RequestMapping("/coufiles/downloadcoufile")
	public ResponseEntity<byte[]> downloadcoufile(String sfid) throws Exception{
		
		HttpStatus statusCode = HttpStatus.OK;
		
		Sourcefile sourcefile = sourceFileService.getSourceFileById(sfid);
		
		String str="E:"+sourcefile.getWjlj();
		
		if(!new File(str).exists()){
			throw new ExceptionResultInfo(ResultUtil.createFail(Config.MESSAGE,903,null));
		}
		
		InputStream in=new FileInputStream(str);
		
		byte[] bytes=new byte[in.available()];
		
		in.read(bytes);
		
		HttpHeaders headers=new HttpHeaders();
		
		String file_name=sourcefile.getZywjmc()+sourcefile.getWjlj().substring(sourcefile.getWjlj().lastIndexOf("."));
		
//		headers.add("Content-Disposition","attachment;filename="+file_name);
		headers.add("Content-Disposition","attachment;filename="+new String(file_name.getBytes(),"ISO-8859-1"));//文件名含有中文必须如此设置
		
		ResponseEntity<byte[]> re=new ResponseEntity<byte[]>(bytes, headers, statusCode);
		
		in.close();

		return re;
	}
	
	
	
	@RequestMapping("/coufiles/delcoufile_submit")
	public @ResponseBody SubmitResultInfo delcoufile_submit(String sfid) throws Exception{
		

		Sourcefile sourcefile = sourceFileService.getSourceFileById(sfid);
		
		String str="E:"+sourcefile.getWjlj();
		
		File file=new File(str);
		
		file.deleteOnExit();
		
		sourceFileService.deleteSourceFileById(sfid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	@RequestMapping("/coufiles/coufiledel_submit")
	public @ResponseBody SubmitResultInfo coufiledel_submit(CourseQueryVo courseQueryVo,int[] indexs) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String sfid=courseQueryVo.getSourcefileCustoms().get(indexs[i]).getSfid();
			try {
				Sourcefile sourcefile = sourceFileService.getSourceFileById(sfid);
				
				String str="E:"+sourcefile.getWjlj();
				
				File file=new File(str);
				
				file.deleteOnExit();
				
				sourceFileService.deleteSourceFileById(sfid);
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
	
	
	
	
	//coufiles
	
	
	
	
	
	@RequestMapping("/analysiscourseinfo")
	public String analysiscourseinfo(Model model) throws Exception{
		
		
		
		return "/course/analysiscourseinfo";
	}
	
	
	
	
	
}
