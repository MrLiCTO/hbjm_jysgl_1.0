package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.process.result.PageQuery;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月2日
 */
public class CourseQueryVo {
	private CourseCustom courseCustom;
	private List<CourseCustom> courseCustoms;
	
	private TeacherCustom teacherCustom;
	private List<TeacherCustom> teacherCustoms;
	
	private SourceFileCustom sourcefileCustom;
	private List<SourceFileCustom> sourcefileCustoms;
	
	private PageQuery pageQuery;

	public CourseCustom getCourseCustom() {
		return courseCustom;
	}

	public void setCourseCustom(CourseCustom courseCustom) {
		this.courseCustom = courseCustom;
	}

	public List<CourseCustom> getCourseCustoms() {
		return courseCustoms;
	}

	public void setCourseCustoms(List<CourseCustom> courseCustoms) {
		this.courseCustoms = courseCustoms;
	}

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

	public SourceFileCustom getSourcefileCustom() {
		return sourcefileCustom;
	}

	public void setSourcefileCustom(SourceFileCustom sourcefileCustom) {
		this.sourcefileCustom = sourcefileCustom;
	}

	public List<SourceFileCustom> getSourcefileCustoms() {
		return sourcefileCustoms;
	}

	public void setSourcefileCustoms(List<SourceFileCustom> sourcefileCustoms) {
		this.sourcefileCustoms = sourcefileCustoms;
	}
	
	
	
}
