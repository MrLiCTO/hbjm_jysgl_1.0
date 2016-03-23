package com.shilong.jysgl.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.shilong.jysgl.dao.culture.mapper.CouGrMapper;
import com.shilong.jysgl.dao.culture.mapper.CoursegroupMapper;
import com.shilong.jysgl.dao.culture.mapper.TeaGrMapper;
import com.shilong.jysgl.dao.custom.mapper.CoursegroupMapperCustom;
import com.shilong.jysgl.pojo.po.CouGr;
import com.shilong.jysgl.pojo.po.CouGrExample;
import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Coursegroup;
import com.shilong.jysgl.pojo.po.TeaGrExample;
import com.shilong.jysgl.pojo.po.TeaGrExample.Criteria;
import com.shilong.jysgl.pojo.po.TeaGrKey;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.CourseGroupService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月16日
 */
public class CourseGroupServiceImpl implements CourseGroupService {

	@Resource
	private CoursegroupMapper courseGroupMapper;
	@Resource
	private CoursegroupMapperCustom courseGroupMapperCustom;
	@Resource
	private CouGrMapper couGrMapper;
	@Resource
	private TeaGrMapper teaGrMapper;

	@Override
	public void insertCourseGroup(CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		if(courseGroupQueryVo==null||courseGroupQueryVo.getCourseGroupCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		CourseGroupCustom groupCustom = courseGroupQueryVo.getCourseGroupCustom();
		
		String kczmc = groupCustom.getKczmc();
		
		if(kczmc==null || kczmc.equals("")){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			
		}
		
		Coursegroup cg=new Coursegroup();
		
		cg.setCgid(UUIDBuild.getUUID());
		
		cg.setKczmc(kczmc);
		
		courseGroupMapper.insert(cg);

	}


	@Override
	public void updateCourseGroup(String id, CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		if(courseGroupQueryVo==null ||//
				courseGroupQueryVo.getCourseGroupCustom()==null ||//
				courseGroupQueryVo.getCourseGroupCustom().getKczmc()==null||//
				courseGroupQueryVo.getCourseGroupCustom().getKczmc().equals("")){//
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		Coursegroup coursegroup = courseGroupMapper.selectByPrimaryKey(id);
		
		if(coursegroup==null){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		coursegroup.setKczmc(courseGroupQueryVo.getCourseGroupCustom().getKczmc());
		
		courseGroupMapper.updateByPrimaryKey(coursegroup);
		
	}


	@Override
	public Coursegroup getCourseGroupById(String cgid) throws Exception {
	
		return courseGroupMapper.selectByPrimaryKey(cgid);
	}


	@Override
	public void deleteCourseGroupById(String cgid) throws Exception {
		courseGroupMapper.deleteByPrimaryKey(cgid);

	}

	
	@Override
	public List<CourseGroupCustom> findCourseGroupList(CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		List<CourseGroupCustom> list = courseGroupMapperCustom.findCourseGroupList(courseGroupQueryVo);
		
		return list;
	}

	
	@Override
	public int findCourseGroupCount(CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		int count = courseGroupMapperCustom.findCourseGroupCount(courseGroupQueryVo);
		
		return count;
	}


	
	@Override
	public List<Teacher> findCgteasById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		courseGroupQueryVo=courseGroupQueryVo!=null ? courseGroupQueryVo:new CourseGroupQueryVo();
		
		CourseGroupCustom courseGroupCustom = courseGroupQueryVo.getCourseGroupCustom();
		
		if(courseGroupCustom==null){
			courseGroupCustom=new CourseGroupCustom();
		}
		
		courseGroupCustom.setCgid(cgid);
		
		courseGroupCustom.setEqCgid(eq);
		
		courseGroupQueryVo.setCourseGroupCustom(courseGroupCustom);
		
		List<Teacher> list = courseGroupMapperCustom.findCgteasById(courseGroupQueryVo);
		
		return list;
	}
	@Override
	public int findCgteasCountById(String cgid,String eq, CourseGroupQueryVo courseGroupQueryVo) throws Exception {

		courseGroupQueryVo=courseGroupQueryVo!=null ? courseGroupQueryVo:new CourseGroupQueryVo();
		
		CourseGroupCustom courseGroupCustom = courseGroupQueryVo.getCourseGroupCustom();
		
		if(courseGroupCustom==null){
			courseGroupCustom=new CourseGroupCustom();
		}
		
		courseGroupCustom.setCgid(cgid);
		
		courseGroupCustom.setEqCgid(eq);
		
		courseGroupQueryVo.setCourseGroupCustom(courseGroupCustom);
		
		int count = courseGroupMapperCustom.findCgteasCountById(courseGroupQueryVo);
		
		return count;
	}

	
	@Override
	public List<Course> findCgcousById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception {
		
		courseGroupQueryVo=courseGroupQueryVo!=null ? courseGroupQueryVo:new CourseGroupQueryVo();
		
		CourseGroupCustom courseGroupCustom = courseGroupQueryVo.getCourseGroupCustom();
		
		if(courseGroupCustom==null){
			courseGroupCustom=new CourseGroupCustom();
		}
		
		courseGroupCustom.setCgid(cgid);
		
		courseGroupCustom.setEqCgid(eq);
		
		courseGroupQueryVo.setCourseGroupCustom(courseGroupCustom);
		
		List<Course> list = courseGroupMapperCustom.findCgcousById(courseGroupQueryVo);
		
		return list;
	}



	@Override
	public int findCgcousCountById(String cgid,String eq, CourseGroupQueryVo courseGroupQueryVo) throws Exception {

		courseGroupQueryVo=courseGroupQueryVo!=null ? courseGroupQueryVo:new CourseGroupQueryVo();
		
		CourseGroupCustom courseGroupCustom = courseGroupQueryVo.getCourseGroupCustom();
		
		if(courseGroupCustom==null){
			courseGroupCustom=new CourseGroupCustom();
		}
		
		courseGroupCustom.setCgid(cgid);
		
		courseGroupCustom.setEqCgid(eq);
		
		courseGroupQueryVo.setCourseGroupCustom(courseGroupCustom);
		
		int count = courseGroupMapperCustom.findCgcousCountById(courseGroupQueryVo);
		
		return count;
	}

	@Override
	public void addCgcou(String cgid, String cid) throws Exception {
		
		CouGr gr = new CouGr();
		
		gr.setCgid(cgid);
		
		gr.setCid(cid);
		
		couGrMapper.insert(gr);
		
	}



	@Override
	public void addCgtea(String cgid, String teaid) throws Exception {
		
		TeaGrKey tg=new TeaGrKey();
		
		tg.setCgid(cgid);
		
		tg.setTeaid(teaid);
		
		teaGrMapper.insert(tg);
		
		
	}



	@Override
	public void delCgcou(String cgid, String cid) throws Exception {
		CouGrExample gr = new CouGrExample();
		
		CouGrExample.Criteria grc=gr.createCriteria();
		
		grc.andCgidEqualTo(cgid);
		
		grc.andCidEqualTo(cid);
		
		couGrMapper.deleteByExample(gr);
	}



	@Override
	public void delCgtea(String cgid, String teaid) throws Exception {
		TeaGrExample tg=new TeaGrExample();
		
		TeaGrExample.Criteria tgc = tg.createCriteria();
		
		tgc.andCgidEqualTo(cgid);
		
		tgc.andTeaidEqualTo(teaid);
		
		teaGrMapper.deleteByExample(tg);
	}


}
