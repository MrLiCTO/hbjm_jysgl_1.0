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

import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.Paper;
import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.PaperCustom;
import com.shilong.jysgl.pojo.vo.PaperQueryVo;
import com.shilong.jysgl.pojo.vo.ProjectCustom;
import com.shilong.jysgl.pojo.vo.ProjectQueryVo;
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
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.PaperService;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月18日
 */
@Controller
@RequestMapping("/paper")
public class PaperAction {
	@Resource
	private PaperService paperService;
	
	@Resource
	private TeacherService teacherService;
	@Resource
	private DictInfoService dictInfoService;
	
	@RequestMapping("/paperlist")
	public String paperlist(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> lwdc_info = dictInfoService.findDictInfoList("010");
		List<Dictinfo> lwlb_info = dictInfoService.findDictInfoList("006");
		List<Dictinfo> jszk_info = dictInfoService.findDictInfoList("011");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("lwdc_info", lwdc_info);
		model.addAttribute("lwlb_info", lwlb_info);
		model.addAttribute("jszk_info", jszk_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/paper/paperlist";
	}
	
	@RequestMapping("/paperlist_result")
	public @ResponseBody DataGridResultInfo projectlist_result(PaperQueryVo paperQueryVo,int rows,int page) throws Exception{
		
		int infoCount=paperService.findPaperCount(paperQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(infoCount,rows, page);
		
		paperQueryVo.setPageQuery(pageQuery);
		
		List<PaperCustom> list = paperService.findPaperList(paperQueryVo);
		 
		DataGridResultInfo resultInfo = new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(infoCount);
		
		return resultInfo;
		
	}
	
	@RequestMapping("/addpaper")
	public String addproject(Model model) throws Exception{
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> lwdc_info = dictInfoService.findDictInfoList("010");
		List<Dictinfo> lwlb_info = dictInfoService.findDictInfoList("006");
		List<Dictinfo> jszk_info = dictInfoService.findDictInfoList("011");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("lwdc_info", lwdc_info);
		model.addAttribute("lwlb_info", lwlb_info);
		model.addAttribute("jszk_info", jszk_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/paper/addpaper";
	}
	
	@RequestMapping("/addpaper_submit")
	public @ResponseBody SubmitResultInfo addpaper_submit(PaperQueryVo paperQueryVo,MultipartFile fj_file,int[] indexs) throws Exception{

		
		PaperCustom paperCustom = paperQueryVo.getPaperCustom();
		
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/paper/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			paperCustom.setFj("/upload/fj/paper/"+new_filename);
			
			paperQueryVo.setPaperCustom(paperCustom);
		}
		
		
		
		paperService.insertPaper(paperQueryVo, indexs);

		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editpaper")
	public String editpaper(String paid,Model model) throws Exception{
		
		Paper paper=paperService.getPaperById(paid);
		
		List<TeacherCustom> teacherCustoms=paperService.getTeasBybId(paid);
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> lwdc_info = dictInfoService.findDictInfoList("010");
		List<Dictinfo> lwlb_info = dictInfoService.findDictInfoList("006");
		List<Dictinfo> jszk_info = dictInfoService.findDictInfoList("011");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("lwdc_info", lwdc_info);
		model.addAttribute("lwlb_info", lwlb_info);
		model.addAttribute("jszk_info", jszk_info);
		model.addAttribute("smwc_info", smwc_info);
		
		model.addAttribute("paperCustom",paper);
		model.addAttribute("teacherCustoms",teacherCustoms);
	
		
		return "/paper/editpaper";
	}
	
	@RequestMapping("/editpaper_submit")
	public @ResponseBody SubmitResultInfo editpaper_submit(PaperQueryVo paperQueryVo,MultipartFile fj_file,int[] indexs,String paid) throws Exception{
	
		PaperCustom paperCustom = paperQueryVo.getPaperCustom();
		
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/paper/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			paperCustom.setFj("/upload/fj/paper/"+new_filename);
			
		}else{
			Paper paper=paperService.getPaperById(paid);
			
			paperCustom.setFj(paper.getFj());
			
		}
		
		
		paperQueryVo.setPaperCustom(paperCustom);
		
		paperService.updatePaper(paperQueryVo, indexs, paid);

		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	

	@RequestMapping("/deletepaper_submit")
	public @ResponseBody SubmitResultInfo deletepaper_submit(String paid) throws Exception{

		paperService.deletePaperById(paid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/paperdelete_submit")
	public @ResponseBody SubmitResultInfo paperdelete_submit(PaperQueryVo paperQueryVo,int[] indexs) throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String paid=paperQueryVo.getPaperCustoms().get(indexs[i]).getPaid();
			try {
				paperService.deletePaperById(paid);
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
	
	@RequestMapping("/analysispaperinfo")
	public String analysisprojectinfo(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> lwdc_info = dictInfoService.findDictInfoList("010");
		List<Dictinfo> lwlb_info = dictInfoService.findDictInfoList("006");
		List<Dictinfo> jszk_info = dictInfoService.findDictInfoList("011");
		List<Dictinfo> smwc_info = dictInfoService.findDictInfoList("015");
		
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("lwdc_info", lwdc_info);
		model.addAttribute("lwlb_info", lwlb_info);
		model.addAttribute("jszk_info", jszk_info);
		model.addAttribute("smwc_info", smwc_info);
		
		return "/paper/analysispaperinfo";
	}
	
	
	@RequestMapping("/analysispaperinfo_submit")
	public @ResponseBody ChartsDataSourceResult analysispaperinfo_submit(PaperQueryVo paperQueryVo) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=paperService.analysisPaperInfo(paperQueryVo);
			
		CharData data1=null;
		
		for(Map map:list){
			
			String lable= map.get("lable")+"";
			String data =map.get("data")+"";
			
			data1=new CharData();
			data1.setLabel(lable);
			data1.setValue(data);
			
			datas.add(data1);
		}
		
	
		
		chart.setCaption("教师论文信息统计图表");
		
		
		
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
