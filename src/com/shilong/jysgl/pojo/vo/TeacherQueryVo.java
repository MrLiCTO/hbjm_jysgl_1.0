package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.process.result.PageQuery;

public class TeacherQueryVo {
	private TeacherCustom teacherCustom;
	private List<TeacherCustom> teacherCustoms;
	
	private PageQuery pageQuery;

	public TeacherCustom getTeacherCustom() {
		return teacherCustom;
	}

	public void setTeacherCustom(TeacherCustom teacherCustom) {
		this.teacherCustom = teacherCustom;
	}

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public List<TeacherCustom> getTeacherCustoms() {
		return teacherCustoms;
	}

	public void setTeacherCustoms(List<TeacherCustom> teacherCustoms) {
		this.teacherCustoms = teacherCustoms;
	}
	
	
	
}
