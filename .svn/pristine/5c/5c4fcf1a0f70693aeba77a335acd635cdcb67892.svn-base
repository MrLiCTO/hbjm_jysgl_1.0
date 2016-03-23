package com.shilong.jysgl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.AwardteaMapper;
import com.shilong.jysgl.dao.custom.mapper.AwardteaMapperCustom;
import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.AwardTeaService;
import com.shilong.jysgl.utils.UUIDBuild;

public class AwardTeaServiceImpl implements AwardTeaService {
	
	@Resource
	private AwardteaMapper awardteaMapper;
	@Resource
	private AwardteaMapperCustom awardteaMapperCustom;

	@Override
	public void insertAwardTea(AwardTeaQueryVo awardTeaQueryVo,String teaid) throws Exception {
		
		if(awardTeaQueryVo==null||awardTeaQueryVo.getAwardTeaCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		Awardtea at=new Awardtea();
		
		AwardTeaCustom atc=awardTeaQueryVo.getAwardTeaCustom();
		
		BeanUtils.copyProperties(atc, at);
		
		at.setTaid(UUIDBuild.getUUID());
		
		at.setTeaid(teaid);
		
		at.setShzt("sh000");//默认未通过
		
		awardteaMapper.insert(at);

	}

	@Override
	public void updateAwardTea(String id, AwardTeaQueryVo awardTeaQueryVo) throws Exception {
		
		Awardtea at=null;
		
		if(id!=null){
			at=awardteaMapper.selectByPrimaryKey(id);
		}
		
		if(at==null||awardTeaQueryVo==null||awardTeaQueryVo.getAwardTeaCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		AwardTeaCustom awardTeaCustom = awardTeaQueryVo.getAwardTeaCustom();
		
		at.setBfdw(awardTeaCustom.getBfdw());
		at.setFj(awardTeaCustom.getFj());
		at.setHjjb(awardTeaCustom.getHjjb());
		at.setJxmc(awardTeaCustom.getJxmc());
		at.setHjsj(awardTeaCustom.getHjsj());
		
		awardteaMapper.updateByPrimaryKey(at);
		
		
	}

	@Override
	public Awardtea getAwardTeaById(String id) throws Exception {
		return awardteaMapper.selectByPrimaryKey(id);
	}

	@Override
	public void deleteAwardTeaById(String id) throws Exception {
		awardteaMapper.deleteByPrimaryKey(id);
		
	}

	@Override
	public List<AwardTeaCustom> findAwardTeaList(AwardTeaQueryVo awardTeaQueryVo) throws Exception {
		awardTeaQueryVo=awardTeaQueryVo!=null?awardTeaQueryVo:new AwardTeaQueryVo();
		return awardteaMapperCustom.findAwardteaList(awardTeaQueryVo);
	}

	@Override
	public int findAwardTeaCount(AwardTeaQueryVo awardTeaQueryVo) throws Exception {
		
		awardTeaQueryVo=awardTeaQueryVo!=null?awardTeaQueryVo:new AwardTeaQueryVo();
		
		return awardteaMapperCustom.findAwardteaCount(awardTeaQueryVo);
	}

	@Override
	public List<Map> analysisAwardTeaJbInfo(AwardTeaQueryVo awardTeaQueryVo) {
		return awardteaMapperCustom.analysisAwardTeaJbInfo(awardTeaQueryVo);
	}

	@Override
	public List<Map> analysisAwardTeaYearInfo(AwardTeaQueryVo awardTeaQueryVo) {
		return awardteaMapperCustom.analysisAwardTeaYearInfo(awardTeaQueryVo);
	}

	
}
