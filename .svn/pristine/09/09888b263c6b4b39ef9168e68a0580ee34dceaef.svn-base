package com.shilong.jysgl.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.CourseMapper;
import com.shilong.jysgl.dao.culture.mapper.TeaCouMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.dao.custom.mapper.CourseMapperCustom;
import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.CourseExample;
import com.shilong.jysgl.pojo.po.TeaCouExample;
import com.shilong.jysgl.pojo.po.TeaCouKey;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseCustom;
import com.shilong.jysgl.pojo.vo.CourseQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.CourseService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月2日
 */
public class CourseServiceImpl implements CourseService{
	
	@Resource
	private CourseMapper courseMapper;
	@Resource
	private CourseMapperCustom courseMapperCustom;
	@Resource
	private TeaCouMapper teaCouMapper;
	@Resource
	private TeacherMapper teacherMapper;

	
	@Override
	public void insertCourse(CourseQueryVo courseQueryVo) throws Exception {
		if(courseQueryVo==null||courseQueryVo.getCourseCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		CourseCustom courseCustom = courseQueryVo.getCourseCustom();
		
		Course cou=new Course();
		
		BeanUtils.copyProperties(courseCustom, cou);
		
		cou.setCid(UUIDBuild.getUUID());
		
		courseMapper.insert(cou);
		
	}


	@Override
	public void updateCourse(String id, CourseQueryVo courseQueryVo) throws Exception {
		
		if(courseQueryVo==null||courseQueryVo.getCourseCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		CourseCustom cu = courseQueryVo.getCourseCustom();
		
		Course cou=courseMapper.selectByPrimaryKey(id);
		
		cou.setJpkjb(cu.getJpkjb());
		
		cou.setKch(cu.getKch());
		
		cou.setKkxq(cu.getKkxq());
		
		cou.setLb(cu.getLb());
		
		cou.setLlks(cu.getLlks());
		
		cou.setSfsjpk(cu.getSfsjpk());
		
		cou.setSfsywlkt(cu.getSfsywlkt());
		
		cou.setSjks(cu.getSjks());
		
		cou.setZks(cu.getZks());
		
		courseMapper.updateByPrimaryKey(cou);
		
	}


	@Override
	public List<CourseCustom> findCourseList(CourseQueryVo courseQueryVo) throws Exception {
		
		return courseMapperCustom.findCourseList(courseQueryVo);
	}


	@Override
	public int findCourseCount(CourseQueryVo courseQueryVo) throws Exception {
		
		return courseMapperCustom.findCourseCount(courseQueryVo);
	}


	@Override
	public Course getCourseById(String cid) throws Exception {

		return courseMapper.selectByPrimaryKey(cid);
	}


	@Override
	public CourseCustom getCourseBybh(String kch) throws Exception {
		
		CourseExample ce=new CourseExample();
		
		CourseExample.Criteria cec=ce.createCriteria();
		
		cec.andKchEqualTo(kch);

		List<Course> list = courseMapper.selectByExample(ce);
		
		if(list!=null&&list.size()==1){
			return (CourseCustom) list.get(0);
		}
		
		return null;
	}
	

	@Override
	public void deleteCourseById(String cid) throws Exception {
		
		TeaCouExample tce=new TeaCouExample();
		
		TeaCouExample.Criteria tcec=tce.createCriteria();
		
		tcec.andCidEqualTo(cid);
		
		teaCouMapper.deleteByExample(tce);
		
		courseMapper.deleteByPrimaryKey(cid);
		
	}

	@Override
	public List<Teacher> getTeasByCid(String cid,CourseQueryVo courseQueryVo) throws Exception {
		
		CourseCustom courseCustom=new CourseCustom();
		
		courseCustom.setCid(cid);
		
		courseQueryVo=courseQueryVo!=null?courseQueryVo:new CourseQueryVo();
		
		courseQueryVo.setCourseCustom(courseCustom);
		
		return courseMapperCustom.getTeasByCid(courseQueryVo);
	}
	
	
	@Override
	public int getTeasByCidcount(String cid,CourseQueryVo courseQueryVo) throws Exception {
		
		CourseCustom courseCustom=new CourseCustom();
		
		courseCustom.setCid(cid);
		
		courseQueryVo=courseQueryVo!=null?courseQueryVo:new CourseQueryVo();
		
		courseQueryVo.setCourseCustom(courseCustom);
		
		return courseMapperCustom.getTeasByCidcount(courseQueryVo);
	}
	


	@Override
	public List<Teacher> getAllTeas(String cid,CourseQueryVo courseQueryVo) throws Exception {
		
		if(courseMapper.selectByPrimaryKey(cid)==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		CourseCustom courseCustom=new CourseCustom();
		
		courseCustom.setCid(cid);
		
		courseQueryVo=courseQueryVo!=null?courseQueryVo:new CourseQueryVo();
		
		courseQueryVo.setCourseCustom(courseCustom);
		
		List<Teacher> allTeas = courseMapperCustom.getAllTeas(courseQueryVo);
		return allTeas;
	}
	
	@Override
	public int getAllTeasCount(String cid,CourseQueryVo courseQueryVo) throws Exception {
		
		if(courseMapper.selectByPrimaryKey(cid)==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}

		CourseCustom courseCustom=new CourseCustom();
		
		courseCustom.setCid(cid);
		
		courseQueryVo=courseQueryVo!=null?courseQueryVo:new CourseQueryVo();
		
		courseQueryVo.setCourseCustom(courseCustom);
		
		int count = courseMapperCustom.getAllTeasCount(courseQueryVo);
		
		return count;
	}



	@Override
	public void addTeaByCid(String cid, String teaid) throws Exception {
		
		TeaCouKey teaCouKey=new TeaCouKey();
		
		teaCouKey.setCid(cid);
		
		teaCouKey.setTeaid(teaid);
		
		teaCouMapper.insert(teaCouKey);
		
	}



	@Override
	public void deleteTeaByCid(String cid, String teaid) throws Exception {

		TeaCouKey teaCouKey=new TeaCouKey();
		
		teaCouKey.setCid(cid);
		
		teaCouKey.setTeaid(teaid);
		
		teaCouMapper.deleteByPrimaryKey(teaCouKey);
		
	}
	
}
