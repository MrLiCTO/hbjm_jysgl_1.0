package com.shilong.jysgl.pojo.vo;

import java.util.Date;

import com.shilong.jysgl.pojo.po.Sourcefile;
import com.shilong.jysgl.utils.MyUtil;

/**
 *	@Descriptrion :
 * 	@author mr-li
 *	@Company www.shilong.com
 *	@CreateDate 2015年12月9日
 */
public class SourceFileCustom extends Sourcefile {
	private String scsjstr;
	private Date scsj_start;
	private Date scsj_end;
	private String scrxm;
	private String wjdx_;
	private String zywjlxmc;
	public String getScsjstr() {
		return MyUtil.dateToString2(getScsj());
	}
	public Date getScsj_start() {
		return scsj_start;
	}
	public void setScsj_start(Date scsj_start) {
		this.scsj_start = scsj_start;
	}
	public Date getScsj_end() {
		return scsj_end;
	}
	public void setScsj_end(Date scsj_end) {
		this.scsj_end = scsj_end;
	}
	public String getScrxm() {
		return scrxm;
	}
	public void setScrxm(String scrxm) {
		this.scrxm = scrxm;
	}
	public String getZywjlxmc() {
		return zywjlxmc;
	}
	public void setZywjlxmc(String zywjlxmc) {
		this.zywjlxmc = zywjlxmc;
	}
	public String getWjdx_() {
		String str= getWjdx()/1000000f+"";
		
		str=str.substring(0, str.indexOf(".")+2);
		
		return str+"M";
	}
	
	
	
}
