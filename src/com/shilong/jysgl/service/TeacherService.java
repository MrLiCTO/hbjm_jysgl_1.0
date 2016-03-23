package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.TeacherCustom;
import com.shilong.jysgl.pojo.vo.TeacherQueryVo;

public interface TeacherService {
	public void insertTeacher(TeacherQueryVo teacherQueryVo) throws Exception;//添加教师
	public void updateTeacher(String id,TeacherQueryVo teacherQueryVo) throws Exception;//修改教师
	public List<TeacherCustom> findTeacherList(TeacherQueryVo teacherQueryVo) throws Exception;//教师列表
	public int findTeacherCount(TeacherQueryVo teacherQueryVo) throws Exception;//教师列表
	public Teacher getTeacherById(String id) throws Exception;//根据id查询教师
	public TeacherCustom getTeacherBybh(String bh) throws Exception;//根据编号查询教师
	public void deleteTeacherById(String id) throws Exception;//根据id删除教师
	public void modifypwd(String pwd, String teaid);
	
	
	public List<Map> analysisTeacherAgeInfo(TeacherQueryVo teacherQueryVo);
	public List<Map> analysisTeacherXbInfo(TeacherQueryVo teacherQueryVo);
	public List<Map> analysisTeacherXWInfo(TeacherQueryVo teacherQueryVo);
	public List<Map> analysisTeacherZzmmInfo(TeacherQueryVo teacherQueryVo);
}
