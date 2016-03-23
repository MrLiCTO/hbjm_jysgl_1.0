package com.shilong.jysgl.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.AwardstuMapper;
import com.shilong.jysgl.dao.custom.mapper.AwardstuMapperCustom;
import com.shilong.jysgl.pojo.po.Awardstu;
import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.vo.AwardStuCustom;
import com.shilong.jysgl.pojo.vo.AwardStuQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.AwardStuService;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月26日
 */
public class AwardStuServiceImpl implements AwardStuService {
	
	@Resource
	private AwardstuMapper awardstuMapper;
	@Resource
	private AwardstuMapperCustom awardstuMapperCustom;


	@Override
	public void insertAwardStu(AwardStuQueryVo awardStuQueryVo) throws Exception {
		
		if(awardStuQueryVo==null || awardStuQueryVo.getAwardStuCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		AwardStuCustom awardStuCustom = awardStuQueryVo.getAwardStuCustom();
		
		String stuid = awardStuCustom.getStuid();
		
		String teaid = awardStuCustom.getTeaid();
		
		if(stuid==null||teaid==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		Awardstu as=new Awardstu();
		
		BeanUtils.copyProperties(awardStuCustom, as);
		
		as.setSaid(UUIDBuild.getUUID());
		
		as.setShzt("sh000");
		
		awardstuMapper.insert(as);

	}

	@Override
	public void updateAwardStu(AwardStuQueryVo awardStuQueryVo,String said) throws Exception {
		if(awardStuQueryVo==null || awardStuQueryVo.getAwardStuCustom()==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		AwardStuCustom awardStuCustom = awardStuQueryVo.getAwardStuCustom();
		
		String stuid = awardStuCustom.getStuid();
		
		String teaid = awardStuCustom.getTeaid();
		
		if(stuid==null||teaid==null){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}
		
		Awardstu as=awardstuMapper.selectByPrimaryKey(said);
		
		as.setBfdw(awardStuCustom.getBfdw());
		
		as.setFj(awardStuCustom.getFj());
		
		as.setHjjb(awardStuCustom.getHjjb());
		
		as.setJxmc(awardStuCustom.getJxmc());
		
		as.setStuid(awardStuCustom.getStuid());
		
		as.setTeaid(awardStuCustom.getTeaid());
		
		awardstuMapper.updateByPrimaryKey(as);
	}

	@Override
	public Awardstu getAwardStuById(String said) throws Exception {
		return awardstuMapper.selectByPrimaryKey(said);
	}

	@Override
	public void deleteAwardStuById(String said) throws Exception {
		awardstuMapper.deleteByPrimaryKey(said);

	}


	@Override
	public List<AwardStuCustom> findAwardStuList(AwardStuQueryVo awardStuQueryVo) throws Exception {
		
		return awardstuMapperCustom.findAwardStuList(awardStuQueryVo);
	}

	
	@Override
	public int findAwardStuCount(AwardStuQueryVo awardStuQueryVo) throws Exception {
		
		return awardstuMapperCustom.findAwardStuCount(awardStuQueryVo);
	}

	@Override
	public List<Map> analysisAwardStuInfo(AwardStuQueryVo awardStuQueryVo) {
		
		return awardstuMapperCustom.analysisAwardStuInfo(awardStuQueryVo);
	}

}
