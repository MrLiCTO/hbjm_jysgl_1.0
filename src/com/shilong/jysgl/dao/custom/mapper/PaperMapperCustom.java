package com.shilong.jysgl.dao.custom.mapper;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.vo.PaperCustom;
import com.shilong.jysgl.pojo.vo.PaperQueryVo;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月18日
 */
public interface PaperMapperCustom {
	public List<PaperCustom> findPaperList(PaperQueryVo paperQueryVo);
	public int findPaperCount(PaperQueryVo paperQueryVo);

	public List<Map> analysisPaperInfo(PaperQueryVo paperQueryVo);
	public List<Map> analysisPaperTeaInfo(PaperQueryVo paperQueryVo);
}
