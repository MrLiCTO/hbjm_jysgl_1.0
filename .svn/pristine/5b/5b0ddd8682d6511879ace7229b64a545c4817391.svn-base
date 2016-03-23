package com.shilong.jysgl.action.tea;

import java.io.File;
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

import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;
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
import com.shilong.jysgl.service.AwardTeaService;
import com.shilong.jysgl.service.DictInfoService;
import com.shilong.jysgl.service.StudentService;
import com.shilong.jysgl.utils.UUIDBuild;
@RequestMapping("/awardtea")
@Controller
public class AwardTeaAction {
	
	@Resource
	private AwardTeaService awardTeaService; 
	@Resource
	private DictInfoService dictInfoService;
	
	@RequestMapping("/awardtealist")
	public String teaawardlist(Model model)throws Exception{
		
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		return "/awardtea/awardtealist";
		
	}
	
	@RequestMapping("/awardtealist_result")
	public @ResponseBody DataGridResultInfo awardtealist_result(Model model,AwardTeaQueryVo awardTeaQueryVo,int rows,int page) throws Exception{
		
		int count = awardTeaService.findAwardTeaCount(awardTeaQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		awardTeaQueryVo.setPageQuery(pageQuery);
		
		List<AwardTeaCustom> list = awardTeaService.findAwardTeaList(awardTeaQueryVo);
		
		DataGridResultInfo dataGridResultInfo=new DataGridResultInfo();
		
		dataGridResultInfo.setRows(list);
		
		dataGridResultInfo.setTotal(count);
		
		return dataGridResultInfo;
		
	}
	
	@RequestMapping("/addawardtea")
	public String addawardtea(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		return "/awardtea/addawardtea";
	}
	
	@RequestMapping("/addawardtea_submit")
	public @ResponseBody SubmitResultInfo addawardtea_submit(AwardTeaQueryVo awardTeaQueryVo,TeacherCustom teaUser,MultipartFile fj_file) throws Exception{

		AwardTeaCustom awardTeaCustom = awardTeaQueryVo.getAwardTeaCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/teaaw/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			awardTeaCustom.setFj("/upload/fj/teaaw/"+new_filename);
			
			awardTeaQueryVo.setAwardTeaCustom(awardTeaCustom);
		}
		
		
		awardTeaService.insertAwardTea(awardTeaQueryVo,teaUser.getTeaid());
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/editawardtea")
	public String editawardtea(Model model,String taid) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		Awardtea awardtea = awardTeaService.getAwardTeaById(taid);
		
		model.addAttribute("awardTeaCustom", awardtea);
		
		return "/awardtea/editawardtea";
	}
	
	@RequestMapping("/editawardtea_submit")
	public @ResponseBody SubmitResultInfo editawardtea_submit(AwardTeaQueryVo awardTeaQueryVo,String taid,MultipartFile fj_file) throws Exception{
		AwardTeaCustom awardTeaCustom = awardTeaQueryVo.getAwardTeaCustom();
		if(fj_file!=null){
			String originalFilename=fj_file.getOriginalFilename();
			
			String new_filename=UUIDBuild.getUUID()+originalFilename.substring(originalFilename.lastIndexOf("."));
			
			File file=new File("E:/upload/fj/teaaw/"+new_filename);
			
			if(!file.exists()){
				file.mkdirs();
			}
			
			fj_file.transferTo(file);
	
			awardTeaCustom.setFj("/upload/fj/teaaw/"+new_filename);
			
			awardTeaQueryVo.setAwardTeaCustom(awardTeaCustom);
		}else{
			Awardtea awardtea = awardTeaService.getAwardTeaById(taid);
			awardTeaCustom.setFj(awardtea.getFj());
		}
		
		awardTeaQueryVo.setAwardTeaCustom(awardTeaCustom);
		
		awardTeaService.updateAwardTea(taid, awardTeaQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	
	@RequestMapping("/deleteawardtea_submit")
	public @ResponseBody SubmitResultInfo deleteawardtea_submit(String taid) throws Exception{

		awardTeaService.deleteAwardTeaById(taid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE,906,null));
	}
	
	@RequestMapping("/awardteadelete_submit")
	public @ResponseBody SubmitResultInfo awardteadelete_submit(AwardTeaQueryVo awardTeaQueryVo,int[] indexs) throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String taid=awardTeaQueryVo.getAwardTeaCustoms().get(indexs[i]).getTaid();
			try {
				awardTeaService.deleteAwardTeaById(taid);
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
	
	@RequestMapping("/analysisawardteainfo")
	public String analysisawardteainfo(Model model) throws Exception{
		List<Dictinfo> shzt_info = dictInfoService.findDictInfoList("001");
		List<Dictinfo> hjjb_info = dictInfoService.findDictInfoList("005");
		
		model.addAttribute("shzt_info", shzt_info);
		model.addAttribute("hjjb_info", hjjb_info);
		
		return "/awardtea/analysisawardteainfo";
	}
	@RequestMapping("/analysisawardteainfo_submit")
	public @ResponseBody ChartsDataSourceResult analysisawardteainfo_submit(AwardTeaQueryVo awardTeaQueryVo,String grp_by) throws Exception{
		
		ChartsDataSourceResult cdsr=new ChartsDataSourceResult();
		
		Chart chart=new Chart();
		
		List<CharData> datas=new ArrayList<>();
		
		List<Map> list=null;
		if(grp_by!=null&&!grp_by.equals("")){
	
			if(grp_by.equals("hjjb_gr")){
				list=awardTeaService.analysisAwardTeaJbInfo(awardTeaQueryVo);
				chart.setxAxisName("获奖级别");
			}else if(grp_by.equals("year_gr")){
				list=awardTeaService.analysisAwardTeaYearInfo(awardTeaQueryVo);
				chart.setxAxisName("年份");
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
		
	
		
		chart.setCaption("教师获奖信息统计图表");
		
		
		
		chart.setyAxisName("人数");
		
		cdsr.setChart(chart);
		
		cdsr.setData(datas);
		
		return cdsr;
	}
}
