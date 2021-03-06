package com.shilong.jysgl.service;

import java.util.List;

import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Coursegroup;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupQueryVo;
import com.shilong.jysgl.pojo.vo.TeacherCustom;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月16日
 */
public interface CourseGroupService {
	/**
	 * 添加课程组
	 * @param courseGroupGroupQueryVo
	 * @throws Exception
	 */
	public void insertCourseGroup(CourseGroupQueryVo courseGroupQueryVo) throws Exception;
	/**
	 * 修改课程组
	 * @param id
	 * @param courseGroupGroupQueryVo
	 * @throws Exception
	 */
	public void updateCourseGroup(String cgid,CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	
	/**
	 * 根据id查询课程组
	 * @param cgid
	 * @return
	 * @throws Exception
	 */
	public Coursegroup getCourseGroupById(String cgid) throws Exception;//
	
	/**
	 * 根据id删除课程组
	 * @param cgid
	 * @throws Exception
	 */
	public void deleteCourseGroupById(String cgid) throws Exception;//
	/**
	 * 根据id查询课程组组员
	 * @param cgid
	 * @return
	 * @throws Exception
	 */
	public List<Teacher> findCgteasById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	
	/**
	 * 根据id查询课程组组员
	 * @param cgid
	 * @return
	 * @throws Exception
	 */
	public int findCgteasCountById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	
	/**
	 * 根据id查询课程组课程
	 * @param cgid
	 * @return
	 * @throws Exception
	 */
	public List<Course> findCgcousById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	
	/**
	 * 根据id查询课程组课程
	 * @param cgid
	 * @return
	 * @throws Exception
	 */
	public int findCgcousCountById(String cgid,String eq,CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	/**
	 * 为课程组添加成员
	 * @param cgid
	 * @param cid
	 * @throws Exception
	 */
	public void addCgcou(String cgid,String cid) throws Exception;
	/**
	 * 微课程组添加课程
	 * @param cgid
	 * @param teaid
	 * @throws Exception
	 */
	public void addCgtea(String cgid,String teaid) throws Exception;
	
	/**
	 * 为课程组移除成员
	 * @param cgid
	 * @param cid
	 * @throws Exception
	 */
	public void delCgcou(String cgid,String cid) throws Exception;
	/**
	 * 微课程组移除课程
	 * @param cgid
	 * @param teaid
	 * @throws Exception
	 */
	public void delCgtea(String cgid,String teaid) throws Exception;
	/**
	 * 课程组列表
	 * @param courseGroupQueryVo
	 * @return
	 * @throws Exception
	 */
	public List<CourseGroupCustom> findCourseGroupList(CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	/**
	 * 课程组总数
	 * @param courseGroupQueryVo
	 * @return
	 * @throws Exception
	 */
	public int findCourseGroupCount(CourseGroupQueryVo courseGroupQueryVo) throws Exception;//
	
}
