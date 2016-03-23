package com.shilong.jysgl.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.CourseMapper;
import com.shilong.jysgl.dao.culture.mapper.SourcefileMapper;
import com.shilong.jysgl.dao.custom.mapper.SourcefileMapperCustom;
import com.shilong.jysgl.pojo.po.Sourcefile;
import com.shilong.jysgl.pojo.vo.CourseQueryVo;
import com.shilong.jysgl.pojo.vo.SourceFileCustom;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.SourceFileService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月9日
 */
public class SourceFileServiceImpl implements SourceFileService{
	
	@Resource
	private SourcefileMapper sourcefileMapper;

	@Resource
	private CourseMapper couseMapper;

	@Resource
	private SourcefileMapperCustom sourcefileMapperCustom;

	@Override
	public void insertSourceFile(String cid, String teaid, CourseQueryVo courseQueryVo) throws Exception {
		
		if(cid==null||teaid==null||courseQueryVo==null||courseQueryVo.getSourcefileCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		SourceFileCustom sourcefileCustom = courseQueryVo.getSourcefileCustom();
		
		Sourcefile sf=new Sourcefile();
		
		BeanUtils.copyProperties(sourcefileCustom, sf);
		
		sf.setCid(cid);
		
		sf.setScsj(new Date());
		
		sf.setSfid(UUIDBuild.getUUID());
		
		sf.setTeaid(teaid);
		
		sf.setXzcs(0);
		
		sourcefileMapper.insert(sf);
	}
	

	@Override
	public void insertSourceFile(String teaid, CourseQueryVo courseQueryVo) throws Exception {
		if(teaid==null||courseQueryVo==null||courseQueryVo.getSourcefileCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		SourceFileCustom sourcefileCustom = courseQueryVo.getSourcefileCustom();
		
		Sourcefile sf=new Sourcefile();
		
		BeanUtils.copyProperties(sourcefileCustom, sf);
		
		sf.setTeaid(teaid);
		
		sf.setCid(null);
		
		sf.setScsj(new Date());
		
		sf.setSfid(UUIDBuild.getUUID());
		
		sf.setXzcs(0);
		
		sourcefileMapper.insert(sf);
		
	}

	
	@Override
	public void updateSourceFile(String id, CourseQueryVo courseQueryVo) throws Exception {
		if(id==null||courseQueryVo==null||courseQueryVo.getSourcefileCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		SourceFileCustom sourcefileCustom = courseQueryVo.getSourcefileCustom();
		
		Sourcefile sf=sourcefileMapper.selectByPrimaryKey(id);
		
		if(sf==null){
			
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
			
		}
		
		sf.setZywjlx(sourcefileCustom.getZywjlx());
		
		sf.setZywjmc(sourcefileCustom.getZywjmc());
		
		sourcefileMapper.updateByPrimaryKey(sf);
		
	}

	
	@Override
	public List<SourceFileCustom> findSourceFileList(String cid, CourseQueryVo courseQueryVo) throws Exception {
		
		courseQueryVo=courseQueryVo!=null ? courseQueryVo : new CourseQueryVo();
		
		SourceFileCustom sourcefileCustom = courseQueryVo.getSourcefileCustom();
		
		if(sourcefileCustom==null){
			sourcefileCustom=new SourceFileCustom();
		}
		
		sourcefileCustom.setCid(cid);
		
		courseQueryVo.setSourcefileCustom(sourcefileCustom);
		
		List<SourceFileCustom> list = sourcefileMapperCustom.findSourceFileList(courseQueryVo);
		
		return list;
	}

	
	@Override
	public int findSourceFileCount(String cid, CourseQueryVo courseQueryVo) throws Exception {
		
		if(cid==null||couseMapper.selectByPrimaryKey(cid)==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		courseQueryVo=courseQueryVo!=null ? courseQueryVo : new CourseQueryVo();
		
		SourceFileCustom sourcefileCustom = courseQueryVo.getSourcefileCustom();
		
		if(sourcefileCustom==null){
			sourcefileCustom=new SourceFileCustom();
		}
		
		sourcefileCustom.setCid(cid);
		
		courseQueryVo.setSourcefileCustom(sourcefileCustom);
		
		return sourcefileMapperCustom.findSourceFileCount(courseQueryVo);
	}

	
	@Override
	public List<SourceFileCustom> findSourceFileList(CourseQueryVo courseQueryVo) throws Exception {
		
		List<SourceFileCustom> list = sourcefileMapperCustom.findSourceFileList(courseQueryVo);
		
		return list;
	}

	
	@Override
	public int findSourceFileCount(CourseQueryVo courseQueryVo) throws Exception {
		
		return sourcefileMapperCustom.findSourceFileCount(courseQueryVo);
	}

	
	@Override
	public Sourcefile getSourceFileById(String sfid) throws Exception {
		
		return sourcefileMapper.selectByPrimaryKey(sfid);
	}

	
	@Override
	public void deleteSourceFileById(String sfid) throws Exception {
		
         sourcefileMapper.deleteByPrimaryKey(sfid);
	}





}
