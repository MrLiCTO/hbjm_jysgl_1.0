package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.process.result.PageQuery;

public class AwardTeaQueryVo {
	private PageQuery pageQuery;
	
	private AwardTeaCustom awardTeaCustom;
	private List<AwardTeaCustom> awardTeaCustoms;
	
	
	
	public PageQuery getPageQuery() {
		return pageQuery;
	}
	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}
	public AwardTeaCustom getAwardTeaCustom() {
		return awardTeaCustom;
	}
	public void setAwardTeaCustom(AwardTeaCustom awardTeaCustom) {
		this.awardTeaCustom = awardTeaCustom;
	}
	public List<AwardTeaCustom> getAwardTeaCustoms() {
		return awardTeaCustoms;
	}
	public void setAwardTeaCustoms(List<AwardTeaCustom> awardTeaCustoms) {
		this.awardTeaCustoms = awardTeaCustoms;
	}
	
	
	
}
