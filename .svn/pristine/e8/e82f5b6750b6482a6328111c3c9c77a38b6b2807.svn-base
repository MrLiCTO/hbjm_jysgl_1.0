package com.shilong.jysgl.action.tea;

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

import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.ProjectQueryVo;
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
import com.shilong.jysgl.service.ProjectService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.UUIDBuild;

@Controller
@RequestMapping("/project")
public class ProjectAction {
	
	@Resource
	private ProjectService projectService;
	@Resource
	private TeacherService teacherService;
	@Resource
	private DictInfoService dictInfoService;
	
	@RequestMapping("/projectlist")
	public String projectlist(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> xmjb_info = dictInfoService.findDictInfoList("007");
		List<Dictinfo> xmlb_info = dictInfoService.findDictInfoList("012");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("xmjb_info", xmjb_info);
		model.addAttribute("xmlb_info", xmlb_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/project/projectlist";
	}
	
	@RequestMapping("/projectlist_result")
	public @ResponseBody DataGridResultInfo projectlist_result(ProjectQueryVo protectQueryVo,int rows,int page) throws Exception{
		
		int infoCount=projectService.findProjectCount(protectQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(infoCount,rows, page);
		
		protectQueryVo.setPageQuery(pageQuery);
		
		List<ProjectCustom> list = projectService.findProjectList(protectQueryVo);
		
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(infoCount);
		
		return resultInfo;
		
	}
	
	@RequestMapping("/addproject")
	public String addproject(Model model) throws Exception{
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> xmjb_info = dictInfoService.findDictInfoList("007");
		List<Dictinfo> xmlx_info = dictInfoService.findDictInfoList("012");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("xmjb_info", xmjb_info);
		model.addAttribute("xmlx_info", xmlx_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/project/addproject";
	}
	
	@RequestMapping("/addproject_submit")
	public @ResponseBody SubmitResultInfo addproject_submit(ProjectQueryVo protectQueryVo,MultipartFile fj_file,int[] indexs) throws Exception{

		
		ProjectCustom projectCustom = protectQueryVo.getProjectCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/pro/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			projectCustom.setFj("/upload/fj/pro/"+new_filename);
			
			protectQueryVo.setProjectCustom(projectCustom);
		}
		
		
		
		projectService.insertProject(protectQueryVo,indexs);

		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editproject")
	public String editproject(String prid,Model model) throws Exception{
		
		Project project = projectService.getProjectById(prid);
		
		List<TeacherCustom> teacherCustoms=projectService.getTeasByPrId(prid);
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> xmjb_info = dictInfoService.findDictInfoList("007");
		List<Dictinfo> xmlx_info = dictInfoService.findDictInfoList("012");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("xmjb_info", xmjb_info);
		model.addAttribute("xmlx_info", xmlx_info);
		model.addAttribute("smwc_info", smwc_info);
		
		model.addAttribute("projectCustom",project);
		model.addAttribute("teacherCustoms",teacherCustoms);
	
		
		return "/project/editproject";
	}
	
	@RequestMapping("/editproject_submit")
	public @ResponseBody DataGridResultInfo editproject_submit(String prid,
			ProjectQueryVo protectQueryVo,MultipartFile fj_file,int[] indexs) throws Exception{
		
		ProjectCustom projectCustom = protectQueryVo.getProjectCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/pro/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			projectCustom.setFj("/upload/fj/pro/"+new_filename);
			
			
		}else{
			Project pro=projectService.getProjectById(prid);
			
			projectCustom.setFj(pro.getFj());
			
		}
		protectQueryVo.setProjectCustom(projectCustom);
		projectService.updateProject(protectQueryVo,indexs,prid);
		
		return new DataGridResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/deleteproject_submit")
	public @ResponseBody SubmitResultInfo deleteproject_submit(String prid) throws Exception{

		projectService.deleteProjectById(prid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/projectdelete_submit")
	public @ResponseBody SubmitResultInfo projectdelete_submit(ProjectQueryVo projectQueryVo,int[] indexs) throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String prid=projectQueryVo.getProjectCustoms().get(indexs[i]).getPrid();
			try {
				projectService.deleteProjectById(prid);
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
	
	@RequestMapping("/analysisprojectinfo")
	public String analysisprojectinfo(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> xmjb_info = dictInfoService.findDictInfoList("007");
		List<Dictinfo> xmlx_info = dictInfoService.findDictInfoList("012");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("xmjb_info", xmjb_info);
		model.addAttribute("xmlx_info", xmlx_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/project/analysisprojectinfo";
	}
	@RequestMapping("/analysisprojectinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisprojectinfo_submit(ProjectQueryVo projectQueryVo) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=null;
		
		if(projectQueryVo.getProjectCustom()!=null){
			ProjectCustom projectCustom = projectQueryVo.getProjectCustom();
			
			String grp_by = projectCustom.getGrp_by();
			
			if(grp_by.endsWith("smwc_gr")){
				list=projectService.analysisTeaProInfo(projectQueryVo);
			}else{
				list=projectService.analysisProjectInfo(projectQueryVo);
			}
		}
			
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
		
	
		
		chart.setCaption("教师項目信息统计图表");
		
		
		
		chart.setyAxisName("人数");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}
	
	@RequestMapping("/checkbh")
	public @ResponseBody Teacher checkbh(String bh) throws Exception{

		Teacher tea=teacherService.getTeacherBybh(bh);
		
		if(tea==null){
			return null;
		}
		
		return tea;
	}
	
}
