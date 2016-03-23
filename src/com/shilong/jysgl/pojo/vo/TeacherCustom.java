package com.shilong.jysgl.pojo.vo;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.shilong.jysgl.pojo.po.Teacher;
import com.shilong.jysgl.utils.MyUtil;

public class TeacherCustom extends Teacher implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String jsmc;
	private String xbmc;
	private String xymc;
	private String zcmc;
	private String shztmc;
	private String zzxlmc;
	private String zzxwmc;
	private String zzmmmc;
	private String zzztmc;	
	private String csrq_str;
	private Date csrq_start;
	private Date csrq_end;
	private Integer age;
	
	private String smwc;
	private String smwcmc;


	public String getJsmc() {
		return jsmc;
	}

	public void setJsmc(String jsmc) {
		this.jsmc = jsmc;
	}

	public String getXbmc() {
		return xbmc;
	}

	public void setXbmc(String xbmc) {
		this.xbmc = xbmc;
	}

	public String getXymc() {
		return xymc;
	}

	public void setXymc(String xymc) {
		this.xymc = xymc;
	}

	public String getZcmc() {
		return zcmc;
	}

	public void setZcmc(String zcmc) {
		this.zcmc = zcmc;
	}

	public String getZzxlmc() {
		return zzxlmc;
	}

	public void setZzxlmc(String zzxlmc) {
		this.zzxlmc = zzxlmc;
	}

	public String getZzxwmc() {
		return zzxwmc;
	}

	public void setZzxwmc(String zzxwmc) {
		this.zzxwmc = zzxwmc;
	}

	public String getZzmmmc() {
		return zzmmmc;
	}

	public void setZzmmmc(String zzmmmc) {
		this.zzmmmc = zzmmmc;
	}

	public Date getCsrq_start() {
		return csrq_start;
	}

	public void setCsrq_start(Date csrq_start) {
		this.csrq_start = csrq_start;
	}

	public Date getCsrq_end() {
		return csrq_end;
	}

	public void setCsrq_end(Date csrq_end) {
		this.csrq_end = csrq_end;
	}

	public String getCsrq_str() {
		DateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		
		return format.format(getCsrq());
	}

	public void setCsrq_str(String csrq_str) {
		this.csrq_str = csrq_str;
	}

	public String getZzztmc() {
		return zzztmc;
	}

	public void setZzztmc(String zzztmc) {
		this.zzztmc = zzztmc;
	}

	public String getShztmc() {
		return shztmc;
	}

	public void setShztmc(String shztmc) {
		this.shztmc = shztmc;
	}

	public Integer getAge() {
		return MyUtil.getYear(new Date())-MyUtil.getYear(getCsrq())+1;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSmwc() {
		return smwc;
	}

	public void setSmwc(String smwc) {
		this.smwc = smwc;
	}

	public String getSmwcmc() {
		return smwcmc;
	}

	public void setSmwcmc(String smwcmc) {
		this.smwcmc = smwcmc;
	}
	
	
}
