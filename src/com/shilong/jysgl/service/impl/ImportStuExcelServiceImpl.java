package com.shilong.jysgl.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import com.shilong.jysgl.dao.culture.mapper.DictinfoMapper;
import com.shilong.jysgl.dao.culture.mapper.StudentMapper;
import com.shilong.jysgl.dao.culture.mapper.TeacherMapper;
import com.shilong.jysgl.pojo.po.Dictinfo;
import com.shilong.jysgl.pojo.po.DictinfoExample;
import com.shilong.jysgl.pojo.po.Student;
import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.pojo.po.TeacherExample;
import com.shilong.jysgl.pojo.po.TeacherExample.Criteria;
import com.shilong.jysgl.process.context.Config;
import com.shilong.jysgl.process.result.ResultUtil;
import com.shilong.jysgl.utils.HxlsOptRowsInterface;
import com.shilong.jysgl.utils.MD5;
import com.shilong.jysgl.utils.MyUtil;
import com.shilong.jysgl.utils.UUIDBuild;
@Resource
public class ImportStuExcelServiceImpl implements HxlsOptRowsInterface{

	@Resource
	private StudentMapper studentMapper;
	
	@Resource
	private DictinfoMapper dictinfoMapper;
	
	@Resource
	private TeacherMapper teacherMapper;
	
	@Override
	public String optRows(int sheetIndex, int curRow, List<String> rowlist) throws Exception {
		
		try {
			String bh=rowlist.get(0);
			String xm=rowlist.get(1);
			String xb=rowlist.get(2);
			String xy=rowlist.get(3);
			String bj=rowlist.get(4);
			String zy=rowlist.get(5);
			String phone=rowlist.get(6);
			String qq=rowlist.get(7);
			String email=rowlist.get(8);
			String teacherbh=rowlist.get(9);
			
			xb = this.findDictinfoByInfo(xb).getDictcode();
			xy = this.findDictinfoByInfo(xy).getDictcode();
			
			TeacherExample te=new TeacherExample();
			
			TeacherExample.Criteria criteria = te.createCriteria();
			
			criteria.andBhEqualTo(teacherbh);
			
			List<Teacher> list = teacherMapper.selectByExample(te);
			
			if(list==null || list.size()!=1){
				ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,903,null));
			}
			
			String teaid=list.get(0).getTeaid();
			
			Student stu=new Student();
			
			stu.setStuid(UUIDBuild.getUUID());
			
			stu.setBh(bh);
			
			stu.setZy(zy);
			
			stu.setBj(bj);
			
			stu.setEmail(email);
			
			stu.setPhone(phone);
			
			stu.setQq(qq);
			
			stu.setTeaid(teaid);
			
			stu.setXb(xb);
			
			stu.setXm(xm);
			
			stu.setXy(xy);
			
			stu.setXszt("b4402bdac47c412195123b88a6ba25e6");//默认在学
			
			stu.setDw("河北经贸大学");
			
			studentMapper.insert(stu);
		} catch (Exception e) {
			e.printStackTrace();
			return "插入失败";
		}
		
		return "success";
	}
	
	public Dictinfo findDictinfoByInfo(String dictinfo) throws Exception{
		DictinfoExample de=new DictinfoExample();
		
		DictinfoExample.Criteria dc=de.createCriteria();
		
		dc.andDictinfoEqualTo(dictinfo);
		
		List<Dictinfo> list=dictinfoMapper.selectByExample(de);
		
		if(list==null||list.size()!=1){
			ResultUtil.throwExcepion(ResultUtil.createFail(Config.MESSAGE,903,null));
		}
		return list.get(0);
	}

}
