package com.shilong.jysgl.pojo.vo;

import com.shilong.jysgl.pojo.po.Course;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月2日
 */
public class CourseCustom extends Course {
	private String lbmc;
	private String jpkjbmc;
	
	//excel
	private String kkxq_e;
	private String sfsjpk_e;
	private String sfsywlkt_e;
	
	private String xf_e;
	private String llks_e;
	private String sjks_e;
	
	private String sbyy;
	
	//excel

	
	
	private Integer zks_start;
	private Integer zks_end;

	private Integer llks_start;
	private Integer llks_end;
	
	private Integer xf_start;
	private Integer xf_end;
	
	private Integer sjks_start;
	private Integer sjks_end;

	
	public String getLbmc() {
		return lbmc;
	}
	public void setLbmc(String lbmc) {
		this.lbmc = lbmc;
	}
	public String getJpkjbmc() {
		return jpkjbmc;
	}
	public void setJpkjbmc(String jpkjbmc) {
		this.jpkjbmc = jpkjbmc;
	}
	public Integer getZks_start() {
		return zks_start;
	}
	public void setZks_start(Integer zks_start) {
		this.zks_start = zks_start;
	}
	public Integer getLlks_start() {
		return llks_start;
	}
	public void setLlks_start(Integer llks_start) {
		this.llks_start = llks_start;
	}
	public Integer getSjks_start() {
		return sjks_start;
	}
	public void setSjks_start(Integer sjks_start) {
		this.sjks_start = sjks_start;
	}
	public Integer getZks_end() {
		return zks_end;
	}
	public void setZks_end(Integer zks_end) {
		this.zks_end = zks_end;
	}
	public Integer getLlks_end() {
		return llks_end;
	}
	public void setLlks_end(Integer llks_end) {
		this.llks_end = llks_end;
	}
	public Integer getSjks_end() {
		return sjks_end;
	}
	public void setSjks_end(Integer sjks_end) {
		this.sjks_end = sjks_end;
	}
	public Integer getXf_start() {
		return xf_start;
	}
	public void setXf_start(Integer xf_start) {
		this.xf_start = xf_start;
	}
	public Integer getXf_end() {
		return xf_end;
	}
	
	public String getKkxq_e() {
		String str = getKkxq();

		if(str.equals("1")){
			this.kkxq_e ="第一学期";
		}else if(str.equals("2")){
			this.kkxq_e ="第二学期";
		}else if(str.equals("3")){
			this.kkxq_e ="两学期均有";
		}else{
			this.kkxq_e ="未定";
		}
		
		return kkxq_e;
	}
	public String getSfsjpk_e() {
		String str = getSfsjpk();
		
		if(str.equals("1")){
			this.sfsjpk_e="是精品课";
		}else{
			this.sfsjpk_e="非精品课";
		}
		
		return sfsjpk_e;
	}
	public String getSfsywlkt_e() {
		String str = getSfsywlkt();
		
		if(str.equals("1")){
			this.sfsywlkt_e="使用";
		}else{
			this.sfsywlkt_e="不使用";
		}
		
		return sfsywlkt_e;
	}
	public String getXf_e() {
		return xf_e;
	}
	public void setXf_e(String xf_e) {
		this.xf_e = xf_e;
	}
	public String getLlks_e() {
		return llks_e;
	}
	public void setLlks_e(String llks_e) {
		this.llks_e = llks_e;
	}
	public String getSjks_e() {
		return sjks_e;
	}
	public void setSjks_e(String sjks_e) {
		this.sjks_e = sjks_e;
	}
	public String getSbyy() {
		return sbyy;
	}
	public void setSbyy(String sbyy) {
		this.sbyy = sbyy;
	}
	
	
	
	
	
	
}
