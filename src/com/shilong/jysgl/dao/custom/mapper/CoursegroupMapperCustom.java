package com.shilong.jysgl.dao.custom.mapper;

import java.util.List;

import com.shilong.jysgl.pojo.po.Course;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.CourseGroupCustom;
import com.shilong.jysgl.pojo.vo.CourseGroupQueryVo;

public interface CoursegroupMapperCustom {
	public List<CourseGroupCustom> findCourseGroupList(CourseGroupQueryVo courseGroupQueryVo);
	public int findCourseGroupCount(CourseGroupQueryVo courseGroupQueryVo);
	
	public List<Teacher> findCgteasById(CourseGroupQueryVo courseGroupQueryVo);
	public int findCgteasCountById(CourseGroupQueryVo courseGroupQueryVo);
	
	public List<Course> findCgcousById(CourseGroupQueryVo courseGroupQueryVo);
	public int findCgcousCountById(CourseGroupQueryVo courseGroupQueryVo);
}