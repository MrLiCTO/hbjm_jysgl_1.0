package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Awardstu;
import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.pojo.vo.AwardStuCustom;
import com.shilong.jysgl.pojo.vo.AwardStuQueryVo;
import com.shilong.jysgl.pojo.vo.AwardTeaCustom;
import com.shilong.jysgl.pojo.vo.AwardTeaQueryVo;

public interface AwardStuService {
	public void insertAwardStu(AwardStuQueryVo awardStuQueryVo) throws Exception;//添加获奖信息
	public void updateAwardStu(AwardStuQueryVo awardStuQueryVo,String said) throws Exception;//修改获奖信息
	
	public Awardstu getAwardStuById(String said) throws Exception;//根据id查询获奖信息
	public void deleteAwardStuById(String said) throws Exception;//根据id删除获奖信息
	
	public List<AwardStuCustom> findAwardStuList(AwardStuQueryVo awardStuQueryVo) throws Exception;//获奖信息列表
	public int findAwardStuCount(AwardStuQueryVo awardStuQueryVo) throws Exception;
	
	public List<Map> analysisAwardStuInfo(AwardStuQueryVo awardStuQueryVo);

}
