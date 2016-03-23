package com.shilong.jysgl.pojo.po;

import java.util.Date;

public class Dictinfo {
    private String dictcode;

    private String typecode;

    private String dictinfo;

    private String isenable;

    private String remark;

    private Date updatetime;

    private Integer dictsort;

    public String getDictcode() {
        return dictcode;
    }

    public void setDictcode(String dictcode) {
        this.dictcode = dictcode == null ? null : dictcode.trim();
    }

    public String getTypecode() {
        return typecode;
    }

    public void setTypecode(String typecode) {
        this.typecode = typecode == null ? null : typecode.trim();
    }

    public String getDictinfo() {
        return dictinfo;
    }

    public void setDictinfo(String dictinfo) {
        this.dictinfo = dictinfo == null ? null : dictinfo.trim();
    }

    public String getIsenable() {
        return isenable;
    }

    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getDictsort() {
        return dictsort;
    }

    public void setDictsort(Integer dictsort) {
        this.dictsort = dictsort;
    }
}