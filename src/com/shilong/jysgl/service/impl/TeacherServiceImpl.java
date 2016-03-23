package com.shilong.jysgl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.dao.custom.mapper.TeacherMapperCustom;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.pojo.vo.TeacherQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.TeacherService;
import com.shilong.jysgl.utils.MD5;
import com.shilong.jysgl.utils.UUIDBuild;

public class TeacherServiceImpl implements TeacherService {
	
	@Resource
	private TeacherMapper teacherMapper;
	@Resource
	private TeacherMapperCustom teacherMapperCustom;
	
	
	
	@Override
	public void insertTeacher(TeacherQueryVo teacherQueryVo) throws Exception{
		
		if(teacherQueryVo==null||teacherQueryVo.getTeacherCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		TeacherCustom tea=teacherQueryVo.getTeacherCustom();
		
		Teacher tea_insert=new Teacher();
		
		BeanUtils.copyProperties(tea, tea_insert);
		
		tea_insert.setTeaid(UUIDBuild.getUUID());
		
		tea_insert.setZzzt("zz001");//默认在职
		
		tea_insert.setMm(new MD5().getMD5ofStr("123456"));
		
		tea_insert.setShzt("sh001");//默认通过
	
		
		teacherMapper.insert(tea_insert);
		
	}

	@Override
	public void updateTeacher(String id,TeacherQueryVo teacherQueryVo)  throws Exception{
		
		if(teacherQueryVo==null||teacherQueryVo.getTeacherCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		TeacherCustom tea=teacherQueryVo.getTeacherCustom();
		
		Teacher tea_old=teacherMapper.selectByPrimaryKey(id);
		
		if(tea_old==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 902, null));
		}
		
		tea_old.setBh(tea.getBh());
		tea_old.setByyx(tea.getByyx());
		tea_old.setCsrq(tea.getCsrq());
		tea_old.setJs(tea.getJs());
		if(tea.getMm()!=null&&!tea.getMm().equals("")){
			tea_old.setMm(tea.getMm());
		}
		tea_old.setSxzy(tea.getSxzy());
		tea_old.setXb(tea.getXb());
		tea_old.setXm(tea.getXm());
		tea_old.setXy(tea.getXy());
		tea_old.setYjfx(tea.getYjfx());
		tea_old.setZc(tea.getZc());
		tea_old.setZzmm(tea_old.getZzmm());
		tea_old.setZzxl(tea.getZzxl());
		tea_old.setZzxw(tea.getZzxw());

		
		teacherMapper.updateByPrimaryKey(tea_old);
		
	}
	
	@Override
	public Teacher getTeacherById(String id)  throws Exception{
		
		return teacherMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public TeacherCustom getTeacherBybh(String bh)  throws Exception{
		
		
		
		TeacherQueryVo teacherQueryVo = new TeacherQueryVo();
		
		TeacherCustom tea=new TeacherCustom();
		
		tea.setBh(bh);
		
		teacherQueryVo.setTeacherCustom(tea); 
		
		List<TeacherCustom> list = teacherMapperCustom.findTeacherList(teacherQueryVo);
		
		if(list!=null&&list.size()==1){
			return list.get(0);
		}
		return null;
	}
	
	@Override
	public void deleteTeacherById(String id)  throws Exception{
		teacherMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<TeacherCustom> findTeacherList(TeacherQueryVo teacherQueryVo)  throws Exception{
		
		return teacherMapperCustom.findTeacherList(teacherQueryVo);
	}


	@Override
	public int findTeacherCount(TeacherQueryVo teacherQueryVo) throws Exception {
		return teacherMapperCustom.findTeacherCount(teacherQueryVo);
	}

	@Override
	public void modifypwd(String pwd, String teaid) {
		Teacher teacher = teacherMapper.selectByPrimaryKey(teaid);
		
		teacher.setMm(new MD5().getMD5ofStr(pwd));
		
		teacherMapper.updateByPrimaryKey(teacher);
		
	}

	@Override
	public List<Map> analysisTeacherAgeInfo(TeacherQueryVo teacherQueryVo) {
		
		return teacherMapperCustom.analysisTeacherAgeInfo(teacherQueryVo);
	}

	@Override
	public List<Map> analysisTeacherXbInfo(TeacherQueryVo teacherQueryVo) {
		return teacherMapperCustom.analysisTeacherXbInfo(teacherQueryVo);
	}

	@Override
	public List<Map> analysisTeacherXWInfo(TeacherQueryVo teacherQueryVo) {
		return teacherMapperCustom.analysisTeacherXWInfo(teacherQueryVo);
	}

	@Override
	public List<Map> analysisTeacherZzmmInfo(TeacherQueryVo teacherQueryVo) {
		return teacherMapperCustom.analysisTeacherZzmmInfo(teacherQueryVo);
	}

}
