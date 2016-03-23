package com.shilong.jysgl.action.cou;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseGroupCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.DataGridResultInfo;
import com.shilong.jysgl.process.result.ExceptionResultInfo;
import com.shilong.jysgl.process.result.PageQuery;
import com.shilong.jysgl.process.result.ResultInfo;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.process.result.SubmitResultInfo;
import com.shilong.jysgl.service.CourseGroupService;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月15日
 */
@Controller
@RequestMapping("/coursegroup")
public class CoursegroupAction {
	
	@Resource
	private CourseGroupService courseGroupService;
	
	@RequestMapping("/coursegrouplist")
	public String coursegrouplist()throws Exception{
		return "/coursegroup/coursegrouplist";
	}
	
	@RequestMapping("/coursegrouplist_result")
	public @ResponseBody DataGridResultInfo coursegrouplist_result(CourseGroupQueryVo courseGroupQueryVo,int page,int rows)throws Exception{
		
		
		int count = courseGroupService.findCourseGroupCount(courseGroupQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count,count,page);
		
		courseGroupQueryVo.setPageQuery(pageQuery);
		
		List<CourseGroupCustom> list = courseGroupService.findCourseGroupList(courseGroupQueryVo);
		
		
		DataGridResultInfo resultinfo=new DataGridResultInfo();
		
		resultinfo.setRows(list);
		
		resultinfo.setTotal(count);
		
		return resultinfo;
	}
	
	
	@RequestMapping("/addcoursegroup")
	public String addcoursegroup()throws Exception{
		return "/coursegroup/addcoursegroup";
	}
	
	
	@RequestMapping("/addcoursegroup_submit")
	public @ResponseBody SubmitResultInfo addcoursegroup_submit(CourseGroupQueryVo courseGroupQueryVo)throws Exception{
		
		courseGroupService.insertCourseGroup(courseGroupQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/editcoursegroup")
	public String editcoursegroup()throws Exception{
		return "/coursegroup/editcoursegroup";
	}
	
	
	@RequestMapping("/editcoursegroup_submit")
	public @ResponseBody SubmitResultInfo editcoursegroup_submit(CourseGroupQueryVo courseGroupQueryVo,String cgid)throws Exception{
		
		courseGroupService.updateCourseGroup(cgid, courseGroupQueryVo);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/deletecoursegroup_submit")
	public @ResponseBody SubmitResultInfo deletecoursegroup_submit(String cgid)throws Exception{
		
		courseGroupService.deleteCourseGroupById(cgid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/coursegroupdelete_submit")
	public @ResponseBody SubmitResultInfo coursegroupdelete_submit(int[] indexs,CourseGroupQueryVo courseGroupQueryVo)throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String cgid=courseGroupQueryVo.getCourseGroupCustoms().get(indexs[i]).getCgid();
			try {
				courseGroupService.deleteCourseGroupById(cgid);
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
	//cgteas
	
	@RequestMapping("/cgteas/cgteaslist")
	public String cgteaslist(String cgid,Model model)throws Exception{
		
		model.addAttribute("cgid",cgid);
		
		return "/coursegroup/cgteas/cgteaslist";
	}
	@RequestMapping("/cgteas/cgteaslist_result")
	public @ResponseBody DataGridResultInfo cgteaslist_result(String cgid,CourseGroupQueryVo courseGroupQueryVo,int page,int rows)throws Exception{
		
		int count = courseGroupService.findCgteasCountById(cgid, "yes_", courseGroupQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseGroupQueryVo.setPageQuery(pageQuery);
		
		List<Teacher> list = courseGroupService.findCgteasById(cgid, "yes_",courseGroupQueryVo);
		
		DataGridResultInfo resultInfo=new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(count);
		
		return resultInfo;
	}
	
	
	@RequestMapping("/cgteas/allteaslist")
	public String allteaslist(String cgid,Model model)throws Exception{
		
		model.addAttribute("cgid",cgid);
		
		return "/coursegroup/cgteas/allteaslist";
	}
	@RequestMapping("/cgteas/allteaslist_result")
	public @ResponseBody DataGridResultInfo allteaslist_result(String cgid,CourseGroupQueryVo courseGroupQueryVo,int page,int rows)throws Exception{
		
		int count = courseGroupService.findCgteasCountById(cgid, "not_", courseGroupQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseGroupQueryVo.setPageQuery(pageQuery);
		
		List<Teacher> list = courseGroupService.findCgteasById(cgid, "not_", courseGroupQueryVo);
		
		DataGridResultInfo resultInfo=new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(count);
		
		return resultInfo;
	}
	
	
	@RequestMapping("/cgteas/addcgtea_submit")
	public @ResponseBody SubmitResultInfo addcgtea_submit(String cgid,String teaid)throws Exception{
		
		courseGroupService.addCgtea(cgid, teaid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/cgteas/cgteaadd_submit")
	public @ResponseBody SubmitResultInfo cgteaadd_submit(CourseGroupQueryVo courseGroupQueryVo,String cgid,int[] indexs)throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String teaid=courseGroupQueryVo.getTeacherCustoms().get(indexs[i]).getTeaid();
			try {
				courseGroupService.addCgtea(cgid, teaid);
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
	
	
	
	
	
	//cgteas

	//cgcous
	@RequestMapping("/cgcous/cgcouslist")
	public String cgcouslist(String cgid,Model model)throws Exception{
		
		model.addAttribute("cgid",cgid);
		
		return "/coursegroup/cgcous/cgcouslist";
	}
	
	@RequestMapping("/cgcous/cgcouslist_result")
	public @ResponseBody DataGridResultInfo cgcouslist_result(String cgid,CourseGroupQueryVo courseGroupQueryVo,int page,int rows)throws Exception{
		
		int count = courseGroupService.findCgcousCountById(cgid, "yes_", courseGroupQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseGroupQueryVo.setPageQuery(pageQuery);
		
		List<Course> list = courseGroupService.findCgcousById(cgid, "yes_", courseGroupQueryVo);
		
		DataGridResultInfo resultInfo=new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(count);
		
		return resultInfo;
	}
	
	@RequestMapping("/cgcous/allcouslist")
	public String allcouslist(String cgid,Model model)throws Exception{
		
		model.addAttribute("cgid",cgid);
		
		return "/coursegroup/cgcous/allcouslist";
	}
	
	@RequestMapping("/cgcous/allcouslist_result")
	public @ResponseBody DataGridResultInfo allcouslist_result(String cgid,CourseGroupQueryVo courseGroupQueryVo,int page,int rows)throws Exception{
		
		int count = courseGroupService.findCgcousCountById(cgid, "not_", courseGroupQueryVo);
		
		PageQuery pageQuery=new PageQuery();
		
		pageQuery.setPageParams(count, rows, page);
		
		courseGroupQueryVo.setPageQuery(pageQuery);
		
		List<Course> list = courseGroupService.findCgcousById(cgid, "not_", courseGroupQueryVo);
		
		DataGridResultInfo resultInfo=new DataGridResultInfo();
		
		resultInfo.setRows(list);
		
		resultInfo.setTotal(count);
		
		return resultInfo;
	}
	
	
	@RequestMapping("/cgcous/addcgcou_submit")
	public @ResponseBody SubmitResultInfo addcoursegroup_submit(String cgid,String cid)throws Exception{
		
		courseGroupService.addCgcou(cgid, cid);
		
		return new SubmitResultInfo(ResultUtil.createSuccess(Config.MESSAGE, 906, null));
	}
	
	
	@RequestMapping("/cgcous/cgcouadd_submit")
	public @ResponseBody SubmitResultInfo coursegroupdelete_submit(CourseGroupQueryVo courseGroupQueryVo,String cgid,int[] indexs)throws Exception{
		int count=indexs.length;
		//处理成功的数量
		int count_success = 0;
		//处理失败的数量
		int count_error = 0;

		//处理失败的原因
		List<ResultInfo> msgs_error = new ArrayList<ResultInfo>();
		
		for(int i=0;i<count;i++){
			ResultInfo resultInfo=null;
			String cid=courseGroupQueryVo.getCourseCustoms().get(indexs[i]).getCid();
			try {
				courseGroupService.addCgcou(cgid, cid);
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
	
	
	
	
	
	//cgcous
	
	
}
