package com.shilong.jysgl.pojo.vo;

import java.util.List;

import com.shilong.jysgl.pojo.po.Coursegroup;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月15日
 */
public class CourseGroupCustom extends Coursegroup{
	private List<TeacherCustom> teachers;
	private List<CourseCustom> courses;
	
	private String eqCgid;
	public List<TeacherCustom> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<TeacherCustom> teachers) {
		this.teachers = teachers;
	}
	public List<CourseCustom> getCourses() {
		return courses;
	}
	public void setCourses(List<CourseCustom> courses) {
		this.courses = courses;
	}
	public String getEqCgid() {
		return eqCgid;
	}
	public void setEqCgid(String eqCgid) {
		this.eqCgid = eqCgid;
	}
	
	
	
}
