package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;

public interface AwardTeaService {
	public void insertAwardTea(AwardTeaQueryVo awardTeaQueryVo,String teaid) throws Exception;//添加获奖信息
	public void updateAwardTea(String id,AwardTeaQueryVo awardTeaQueryVo) throws Exception;//修改获奖信息
	
	public Awardtea getAwardTeaById(String id) throws Exception;//根据id查询获奖信息
	public void deleteAwardTeaById(String id) throws Exception;//根据id删除获奖信息
	
	public List<AwardTeaCustom> findAwardTeaList(AwardTeaQueryVo awardTeaQueryVo) throws Exception;//获奖信息列表
	public int findAwardTeaCount(AwardTeaQueryVo awardTeaQueryVo) throws Exception;
	
	public List<Map> analysisAwardTeaJbInfo(AwardTeaQueryVo awardTeaQueryVo);
	public List<Map> analysisAwardTeaYearInfo(AwardTeaQueryVo awardTeaQueryVo);

}
