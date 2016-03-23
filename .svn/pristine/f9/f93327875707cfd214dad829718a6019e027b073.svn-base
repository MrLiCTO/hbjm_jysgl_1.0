package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Paper;
import com.shilong.jysgl.pojo.vo.PaperCustom;
import com.shilong.jysgl.pojo.vo.PaperQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月18日
 */
public interface PaperService {
	public void insertPaper(PaperQueryVo paperQueryVo,int[] indexs) throws Exception;//添加著作信息
	public void updatePaper(PaperQueryVo paperQueryVo,int[] indexs,String pid) throws Exception;//修改著作信息
	
	public Paper getPaperById(String pid) throws Exception;//根据id查询著作信息
	public void deletePaperById(String pid) throws Exception;//根据id删除著作信息
	
	public List<TeacherCustom> getTeasBybId(String pid)throws Exception;
	
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo)throws Exception;
	public int findPaperCount(PaperQueryVo paperQueryVo)throws Exception;
	
	public List<Map> analysisPaperInfo(PaperQueryVo paperQueryVo)throws Exception;
}
