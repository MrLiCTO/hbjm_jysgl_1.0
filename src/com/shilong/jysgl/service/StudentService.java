package com.shilong.jysgl.service;

import java.util.List;
import java.util.Map;

import com.shilong.jysgl.pojo.po.Student;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.vo.StudentCustom;
import com.shilong.jysgl.pojo.vo.StudentQueryVo;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年11月19日
 */
public interface StudentService {
	public void insertStudent(StudentQueryVo studentQueryVo) throws Exception;//添加学生
	public void updateStudent(String id,StudentQueryVo studentQueryVo) throws Exception;//修改学生
	public List<StudentCustom> findStudentList(StudentQueryVo studentQueryVo) throws Exception;//学生列表
	public int findStudentCount(StudentQueryVo studentQueryVo) throws Exception;
	public Student getStudentById(String id) throws Exception;//根据id查询学生
	public Student getStudentBybh(String bh) throws Exception;//根据编号查询学生
	public void deleteStudentById(String id) throws Exception;//根据id删除学生

	public List<Map> analysisstudentinfo(StudentQueryVo studentQueryVo);
	
	
}
