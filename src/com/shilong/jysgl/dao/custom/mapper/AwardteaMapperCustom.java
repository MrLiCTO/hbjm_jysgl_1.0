package com.shilong.jysgl.dao.custom.mapper;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;

public interface AwardteaMapperCustom {
	public List<AwardTeaCustom> findAwardteaList(AwardTeaQueryVo awardTeaQueryVo);
	public int findAwardteaCount(AwardTeaQueryVo awardTeaQueryVo);
	
	public List<Map> analysisAwardTeaJbInfo(AwardTeaQueryVo awardTeaQueryVo);
	public List<Map> analysisAwardTeaYearInfo(AwardTeaQueryVo awardTeaQueryVo);
}
