package com.shilong.jysgl.pojo.vo;

import java.util.Date;
import java.util.List;

import com.shilong.jysgl.pojo.po.Project;
import com.shilong.jysgl.utils.MyUtil;

public class ProjectCustom extends Project {
	private List<TeacherCustom> teachers;
	
	private String lxsjstr;
	private String jxsjstr;
	
	private String xmjbmc;
	private String xmlxmc;
	private String shztmc;
	
	private Date lxsj_start;
	private Date lxsj_end;
	private Date jxsj_start;
	private Date jxsj_end;
	
	private String grp_by;

	public List<TeacherCustom> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<TeacherCustom> teachers) {
		this.teachers = teachers;
	}

	public String getLxsjstr() {
		return MyUtil.dateToString2(getLxsj());
	}

	public void setLxsjstr(String lxsjstr) {
		this.lxsjstr = lxsjstr;
	}

	public String getJxsjstr() {
		return MyUtil.dateToString2(getJxsj());
	}

	public void setJxsjstr(String jxsjstr) {
		this.jxsjstr = jxsjstr;
	}

	public String getXmjbmc() {
		return xmjbmc;
	}

	public void setXmjbmc(String xmjbmc) {
		this.xmjbmc = xmjbmc;
	}

	public String getXmlxmc() {
		return xmlxmc;
	}

	public void setXmlxmc(String xmlxmc) {
		this.xmlxmc = xmlxmc;
	}

	public String getShztmc() {
		return shztmc;
	}

	public void setShztmc(String shztmc) {
		this.shztmc = shztmc;
	}

	public Date getLxsj_start() {
		return lxsj_start;
	}

	public void setLxsj_start(Date lxsj_start) {
		this.lxsj_start = lxsj_start;
	}

	public Date getLxsj_end() {
		return lxsj_end;
	}

	public void setLxsj_end(Date lxsj_end) {
		this.lxsj_end = lxsj_end;
	}

	public Date getJxsj_start() {
		return jxsj_start;
	}

	public void setJxsj_start(Date jxsj_start) {
		this.jxsj_start = jxsj_start;
	}

	public Date getJxsj_end() {
		return jxsj_end;
	}

	public void setJxsj_end(Date jxsj_end) {
		this.jxsj_end = jxsj_end;
	}

	public String getGrp_by() {
		return grp_by;
	}

	public void setGrp_by(String grp_by) {
		this.grp_by = grp_by;
	}
    
}
