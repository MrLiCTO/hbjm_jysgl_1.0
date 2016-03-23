package com.shilong.jysgl.service;

import java.util.List;

import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseCustom;
import com.shilong.jysgl.pojo.vo.CourseQueryVo;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月2日
 */
public interface CourseService {
	
	public void insertCourse(CourseQueryVo courseQueryVo) throws Exception;//添加课程
	public void updateCourse(String id,CourseQueryVo courseQueryVo) throws Exception;//修改课程
	public List<CourseCustom> findCourseList(CourseQueryVo courseQueryVo) throws Exception;//课程列表
	public int findCourseCount(CourseQueryVo courseQueryVo) throws Exception;//课程列表
	public Course getCourseById(String cid) throws Exception;//根据id查询课程
	public CourseCustom getCourseBybh(String kch) throws Exception;//根据编号查询课程
	public void deleteCourseById(String cid) throws Exception;//根据id删除课程
	
	public List<Teacher> getTeasByCid(String cid,CourseQueryVo courseQueryVo) throws Exception;//根据课程查询授课教师
	public int getTeasByCidcount(String cid,CourseQueryVo courseQueryVo) throws Exception;//根据课程查询授课教师
	
	public List<Teacher> getAllTeas(String cid,CourseQueryVo courseQueryVo) throws Exception;//教师列表
	public int getAllTeasCount(String cid,CourseQueryVo courseQueryVo) throws Exception;//教师列表
	
	public void addTeaByCid(String cid,String teaid) throws Exception;//根据课程id添加授课教师
	
	public void deleteTeaByCid(String cid,String teaid) throws Exception;//根据课程id添加授课教师
	
}
