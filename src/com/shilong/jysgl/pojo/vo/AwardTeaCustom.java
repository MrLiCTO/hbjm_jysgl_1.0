package com.shilong.jysgl.pojo.vo;

import java.util.Date;

import com.shilong.jysgl.pojo.po.Awardtea;
import com.shilong.jysgl.utils.MyUtil;

public class AwardTeaCustom extends Awardtea {
	private String teabh;
	private String teaxm;
	private String shztmc;
	private String hjjbmc;
	private String hjsjstr;
	private Date hjsj_start;
	private Date hjsj_end;
	
	public String getTeabh() {
		return teabh;
	}
	public void setTeabh(String teabh) {
		this.teabh = teabh;
	}
	public String getTeaxm() {
		return teaxm;
	}
	public void setTeaxm(String teaxm) {
		this.teaxm = teaxm;
	}
	public String getShztmc() {
		return shztmc;
	}
	public void setShztmc(String shztmc) {
		this.shztmc = shztmc;
	}
	public String getHjjbmc() {
		return hjjbmc;
	}
	public void setHjjbmc(String hjjbmc) {
		this.hjjbmc = hjjbmc;
	}
	public String getHjsjstr() {
		
		return MyUtil.dateToString2(getHjsj());
	}
	public void setHjsjstr(String hjsjstr) {
		this.hjsjstr = hjsjstr;
	}
	public Date getHjsj_start() {
		return hjsj_start;
	}
	public void setHjsj_start(Date hjsj_start) {
		this.hjsj_start = hjsj_start;
	}
	public Date getHjsj_end() {
		return hjsj_end;
	}
	public void setHjsj_end(Date hjsj_end) {
		this.hjsj_end = hjsj_end;
	}
	

	
	
}
