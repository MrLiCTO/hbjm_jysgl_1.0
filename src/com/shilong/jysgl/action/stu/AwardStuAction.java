package com.shilong.jysgl.action.stu;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.shilong.jysgl.pojo.po.Awardstu;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Student;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.AwardStuCustom;
import com.shilong.jysgl.pojo.vo.AwardStuQueryVo;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.StudentQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
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
import com.shilong.jysgl.service.AwardStuService;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.StudentService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月26日
 */
@Controller
@RequestMapping("/awardstu")
public class AwardStuAction {
	
	@Resource
	private AwardStuService awardStuService;
	@Resource
	private StudentService studentService;
	@Resource
	private TeacherService teacherService;
	@Resource
	private DictInfoService dictInfoService;
	
	@RequestMapping("/awardstulist")
	public String awardstulist(Model model) throws Exception{
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		return "/awardstu/awardstulist";
	
	}
	
	@RequestMapping("/awardstulist_result")
	public @ResponseBody DataGridResultInfo awardstulist_result(AwardStuQueryVo awardStuQueryVo,int rows,int page) throws Exception{
		
		int count = awardStuService.findAwardStuCount(awardStuQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		awardStuQueryVo.setPageQuery(pageQuery);
		
		List<AwardStuCustom> list = awardStuService.findAwardStuList(awardStuQueryVo); 
		
		DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
		
		dataGridResultInfo.setRows(list);
		
		dataGridResultInfo.setTotal(count);
		
		return dataGridResultInfo;
	
	}
	
	@RequestMapping("/addawardstu")
	public String addawardstu(Model model,TeacherCustom teaUser) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		model.addAttribute("teacherCustom",teaUser);
		
		
		return "/awardstu/addawardstu";
	}
	
	
	@RequestMapping("/addawardstu_submit")
	public @ResponseBody SubmitResultInfo  addawardstu_submit(AwardStuQueryVo awardStuQueryVo,MultipartFile fj_file) throws Exception{
		
		AwardStuCustom awardStuCustom = awardStuQueryVo.getAwardStuCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/awstu/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			awardStuCustom.setFj("/upload/fj/awstu/"+new_filename);
			
			awardStuQueryVo.setAwardStuCustom(awardStuCustom);
		}
		
		awardStuService.insertAwardStu(awardStuQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/editawardstu")
	public String editawardstu(Model model,String said) throws Exception{
		
		Awardstu awardstu = awardStuService.getAwardStuById(said);
		
		if(awardstu==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		Teacher teacher = teacherService.getTeacherById(awardstu.getTeaid());
		Student student = studentService.getStudentById(awardstu.getStuid());
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		model.addAttribute("teacherCustom", teacher);
		model.addAttribute("studentCustom", student);
		
		model.addAttribute("awardStuCustom",awardstu);
		
		
		
		
		return "/awardstu/editawardstu";
	}
	
	
	
	
	
	@RequestMapping("/editawardstu_submit")
	public @ResponseBody SubmitResultInfo  editawardstu_submit(AwardStuQueryVo awardStuQueryVo,MultipartFile fj_file,String said ) throws Exception{
		
		AwardStuCustom awardStuCustom = awardStuQueryVo.getAwardStuCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/awstu/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			awardStuCustom.setFj("/upload/fj/awstu/"+new_filename);
			
		}else{
			Awardstu awardstu = awardStuService.getAwardStuById(said);
			
			awardStuCustom.setFj(awardstu.getFj());
		}
		
		awardStuQueryVo.setAwardStuCustom(awardStuCustom);
		
		awardStuService.updateAwardStu(awardStuQueryVo, said);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/deleteawardstu_submit")
	public @ResponseBody SubmitResultInfo  deleteawardstu_submit(String said ) throws Exception{
		
		awardStuService.deleteAwardStuById(said);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	@RequestMapping("/awardstudelsubmit")
	public @ResponseBody SubmitResultInfo awardstudelsubmit(AwardStuQueryVo awardStuQueryVo,int[] indexs) throws Exception{

		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String said=awardStuQueryVo.getAwardStuCustoms().get(indexs[i]).getSaid();
			try {
				awardStuService.deleteAwardStuById(said);
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
	
	
	
	
	
	@RequestMapping("/checkteabh")
	public @ResponseBody Teacher checkteabh(String bh) throws Exception{

		Teacher tea=teacherService.getTeacherBybh(bh);
		
		if(tea==null){
			return null;
		}
		
		return tea;
	}
	@RequestMapping("/checkstubh")
	public @ResponseBody Student checkstubh(String bh) throws Exception{
		
		Student student = studentService.getStudentBybh(bh);
		
		if(student==null){
			return null;
		}
		
		return student;
	}
	
	
	@RequestMapping("/analysisawardstuinfo")
	public String analysisawardstuinfo(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		return "/awardstu/analysisawardstuinfo";
	}
	@RequestMapping("/analysisawardstuinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisawardstuinfo_submit(AwardStuQueryVo awardStuQueryVo) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=awardStuService.analysisAwardStuInfo(awardStuQueryVo);
		
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
		
	
		
		chart.setCaption("学生获奖信息统计图表");
		
		
		
		chart.setyAxisName("人次");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}
	
}
