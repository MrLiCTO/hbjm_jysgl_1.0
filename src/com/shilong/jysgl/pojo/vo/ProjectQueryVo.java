package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.process.result.PageQuery;

public class ProjectQueryVo {
	private ProjectCustom projectCustom;
	private List<ProjectCustom> projectCustoms;
	
	private TeacherCustom teacherCustom;
	private List<TeacherCustom> teacherCustoms;
	
	private PageQuery pageQuery;

	public PageQuery getPageQuery() {
		return pageQuery;
	}

	public void setPageQuery(PageQuery pageQuery) {
		this.pageQuery = pageQuery;
	}

	public ProjectCustom getProjectCustom() {
		return projectCustom;
	}

	public void setProjectCustom(ProjectCustom projectCustom) {
		this.projectCustom = projectCustom;
	}

	public TeacherCustom getTeacherCustom() {
		return teacherCustom;
	}

	public void setTeacherCustom(TeacherCustom teacherCustom) {
		this.teacherCustom = teacherCustom;
	}

	public List<TeacherCustom> getTeacherCustoms() {
		return teacherCustoms;
	}

	public void setTeacherCustoms(List<TeacherCustom> teacherCustoms) {
		this.teacherCustoms = teacherCustoms;
	}

	public List<ProjectCustom> getProjectCustoms() {
		return projectCustoms;
	}

	public void setProjectCustoms(List<ProjectCustom> projectCustoms) {
		this.projectCustoms = projectCustoms;
	}
	
	
}
