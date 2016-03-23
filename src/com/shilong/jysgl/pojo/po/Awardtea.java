package com.shilong.jysgl.pojo.po;

import java.util.Date;

public class Awardtea {
    private String taid;//奖项ID

    private String teaid;//教师ID

    private String jxmc;//奖项名称

    private String bfdw;//颁发单位

    private Date hjsj;//获奖时间

    private String hjjb;//获奖级别

    private String shzt;//奖项审核状态

    private String jxshyj;//奖项审核意见

    private String fj;//附件

    public String getTaid() {
        return taid;
    }

    public void setTaid(String taid) {
        this.taid = taid == null ? null : taid.trim();
    }

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid == null ? null : teaid.trim();
    }

    public String getJxmc() {
        return jxmc;
    }

    public void setJxmc(String jxmc) {
        this.jxmc = jxmc == null ? null : jxmc.trim();
    }

    public String getBfdw() {
        return bfdw;
    }

    public void setBfdw(String bfdw) {
        this.bfdw = bfdw == null ? null : bfdw.trim();
    }

    public Date getHjsj() {
        return hjsj;
    }

    public void setHjsj(Date hjsj) {
        this.hjsj = hjsj;
    }

    public String getHjjb() {
        return hjjb;
    }

    public void setHjjb(String hjjb) {
        this.hjjb = hjjb == null ? null : hjjb.trim();
    }

    public String getShzt() {
        return shzt;
    }

    public void setShzt(String shzt) {
        this.shzt = shzt == null ? null : shzt.trim();
    }

    public String getJxshyj() {
        return jxshyj;
    }

    public void setJxshyj(String jxshyj) {
        this.jxshyj = jxshyj == null ? null : jxshyj.trim();
    }

    public String getFj() {
        return fj;
    }

    public void setFj(String fj) {
        this.fj = fj == null ? null : fj.trim();
    }
}