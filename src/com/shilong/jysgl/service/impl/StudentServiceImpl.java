package com.shilong.jysgl.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;

import com.shilong.jysgl.dao.culture.mapper.StudentMapper;
import com.shilong.jysgl.dao.custom.mapper.StudentMapperCustom;
import com.shilong.jysgl.pojo.po.Student;
import com.shilong.jysgl.pojo.po.StudentExample;
import com.shilong.jysgl.pojo.vo.StudentCustom;
import com.shilong.jysgl.pojo.vo.StudentQueryVo;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.service.StudentService;
import com.shilong.jysgl.utils.MyUtil;
import com.shilong.jysgl.utils.UUIDBuild;

/**
 * @Descriptrion :
 * @author mr-li
 * @Company www.shilong.com
 * @CreateDate 2015年11月19日
 */
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentMapper studentMapper;
	@Resource
	private StudentMapperCustom studentMapperCustom;

	@Override
	public void insertStudent(StudentQueryVo studentQueryVo) throws Exception {

		if (studentQueryVo == null || studentQueryVo.getStudentCustom() == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}

		StudentCustom studentCustom = studentQueryVo.getStudentCustom();

		Student stu = new Student();

		BeanUtils.copyProperties(studentCustom, stu);

		stu.setStuid(UUIDBuild.getUUID());

		studentMapper.insert(stu);

	}

	@Override
	public void updateStudent(String id, StudentQueryVo studentQueryVo) throws Exception {
		if (studentQueryVo == null || studentQueryVo.getStudentCustom() == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 901, null));
		}

		StudentCustom studentCustom = studentQueryVo.getStudentCustom();

		if (id == null) {
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE, 903, null));
		}

		Student stu = studentMapper.selectByPrimaryKey(id);

		stu.setBh(studentCustom.getBh());

		stu.setBj(studentCustom.getBj());

		stu.setDw(studentCustom.getDw());

		stu.setEmail(studentCustom.getEmail());

		stu.setPhone(studentCustom.getPhone());

		stu.setQq(studentCustom.getQq());

		stu.setTeaid(studentCustom.getTeaid());

		stu.setXb(studentCustom.getXb());

		stu.setXm(studentCustom.getXm());

		stu.setXszt(studentCustom.getXszt());

		stu.setXy(studentCustom.getXy());

		stu.setZy(studentCustom.getZy());

		studentMapper.updateByPrimaryKey(stu);

	}

	@Override
	public List<StudentCustom> findStudentList(StudentQueryVo studentQueryVo) throws Exception {

		/*studentQueryVo = studentQueryVo != null ? studentQueryVo : new StudentQueryVo();

		StudentCustom studentCustom = studentQueryVo.getStudentCustom();

		if (studentCustom == null) {
			studentCustom = new StudentCustom();

			studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");
		}

		if (studentCustom != null) {
			if (studentCustom.getRxsj() == null) {

				studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");

			}
		}

		studentQueryVo.setStudentCustom(studentCustom);*/

		return studentMapperCustom.findStuList(studentQueryVo);
	}

	@Override
	public int findStudentCount(StudentQueryVo studentQueryVo) throws Exception {

		/*studentQueryVo = studentQueryVo != null ? studentQueryVo : new StudentQueryVo();

		StudentCustom studentCustom = studentQueryVo.getStudentCustom();

		if (studentCustom == null) {
			studentCustom = new StudentCustom();

			studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");
		}

		if (studentCustom != null) {
			if (studentCustom.getRxsj() == null) {

				studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");

			}
		}

		studentQueryVo.setStudentCustom(studentCustom);*/

		return studentMapperCustom.findStuCount(studentQueryVo);
	}

	@Override
	public Student getStudentById(String id) throws Exception {

		return studentMapper.selectByPrimaryKey(id);
	}

	@Override
	public Student getStudentBybh(String bh) throws Exception {

		StudentExample stue = new StudentExample();

		StudentExample.Criteria stc = stue.createCriteria();

		stc.andBhEqualTo(bh);

		List<Student> list = studentMapper.selectByExample(stue);

		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;

	}

	@Override
	public void deleteStudentById(String id) throws Exception {
		studentMapper.deleteByPrimaryKey(id);

	}

	@Override
	public List<Map> analysisstudentinfo(StudentQueryVo studentQueryVo) {

		studentQueryVo = studentQueryVo != null ? studentQueryVo : new StudentQueryVo();

		StudentCustom studentCustom = studentQueryVo.getStudentCustom();

		if (studentCustom == null) {
			studentCustom = new StudentCustom();

			studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");
		}

		if (studentCustom != null) {
			if (studentCustom.getRxsj() == null) {

				studentCustom.setRxsj(MyUtil.getYear(new Date()) + "");

			}
		}

		studentQueryVo.setStudentCustom(studentCustom);

		return studentMapperCustom.analysisstudentinfo(studentQueryVo);
	}

}
