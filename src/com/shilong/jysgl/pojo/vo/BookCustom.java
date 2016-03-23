package com.shilong.jysgl.pojo.vo;

import java.util.Date;
import java.util.List;

import com.shilong.jysgl.pojo.po.Book;
import com.shilong.jysgl.utils.MyUtil;

public class BookCustom extends Book{
	private String cbsjstr;
	private String shztmc;
	
	private Date cbsj_start;
	private Date cbsj_end;
	
	private String grp_by;
	
	private List<TeacherCustom> teachers;
	


	public String getCbsjstr() {
		return MyUtil.dateToString2(getCbsj());
	}

	public void setCbsjstr(String cbsjstr) {
		this.cbsjstr = cbsjstr;
	}

	public String getShztmc() {
		return shztmc;
	}

	public void setShztmc(String shztmc) {
		this.shztmc = shztmc;
	}

	public List<TeacherCustom> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherCustom> teachers) {
		this.teachers = teachers;
	}

	public Date getCbsj_start() {
		return cbsj_start;
	}

	public void setCbsj_start(Date cbsj_start) {
		this.cbsj_start = cbsj_start;
	}

	public Date getCbsj_end() {
		return cbsj_end;
	}

	public void setCbsj_end(Date cbsj_end) {
		this.cbsj_end = cbsj_end;
	}

	public String getGrp_by() {
		return grp_by;
	}

	public void setGrp_by(String grp_by) {
		this.grp_by = grp_by;
	}




	
	
}
