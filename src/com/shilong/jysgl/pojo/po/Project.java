package com.shilong.jysgl.pojo.po;

import java.util.Date;

public class Project {
    private String prid;//项目ID

    private String xmmc;//项目名称

    private String xmbh;//项目编号

    private String xmjb;//项目级别

    private String pzdw;//批准单位

    private String xmlx;//项目类型

    private Date lxsj;//立项时间

    private Date jxsj;//结项时间

    private String shzt;//项目审核状态

    private String xxshyj;//项目审核意见

    private String fj;//附件

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid == null ? null : prid.trim();
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc == null ? null : xmmc.trim();
    }

    public String getXmbh() {
        return xmbh;
    }

    public void setXmbh(String xmbh) {
        this.xmbh = xmbh == null ? null : xmbh.trim();
    }

    public String getXmjb() {
        return xmjb;
    }

    public void setXmjb(String xmjb) {
        this.xmjb = xmjb == null ? null : xmjb.trim();
    }

    public String getPzdw() {
        return pzdw;
    }

    public void setPzdw(String pzdw) {
        this.pzdw = pzdw == null ? null : pzdw.trim();
    }

    public String getXmlx() {
        return xmlx;
    }

    public void setXmlx(String xmlx) {
        this.xmlx = xmlx == null ? null : xmlx.trim();
    }

    public Date getLxsj() {
        return lxsj;
    }

    public void setLxsj(Date lxsj) {
        this.lxsj = lxsj;
    }

    public Date getJxsj() {
        return jxsj;
    }

    public void setJxsj(Date jxsj) {
        this.jxsj = jxsj;
    }

    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt == null ? null : shzt.trim();
    }

    public String getXxshyj() {
        return xxshyj;
    }

    public void setXxshyj(String xxshyj) {
        this.xxshyj = xxshyj == null ? null : xxshyj.trim();
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj == null ? null : fj.trim();
    }
}