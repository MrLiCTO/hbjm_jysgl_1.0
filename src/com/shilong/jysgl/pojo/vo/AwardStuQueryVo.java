package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.process.result.PageQuery;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月26日
 */
public class AwardStuQueryVo {
	private AwardStuCustom awardStuCustom;
	private List<AwardStuCustom> awardStuCustoms;
	private PageQuery pageQuery;
	
	
	
	public AwardStuCustom getAwardStuCustom() {
		return awardStuCustom;
	}
	public void setAwardStuCustom(AwardStuCustom awardStuCustom) {
		this.awardStuCustom = awardStuCustom;
	}
	public List<AwardStuCustom> getAwardStuCustoms() {
		return awardStuCustoms;
	}
	public void setAwardStuCustoms(List<AwardStuCustom> awardStuCustoms) {
		this.awardStuCustoms = awardStuCustoms;
	}
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	
	
	
}
