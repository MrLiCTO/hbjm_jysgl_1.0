package com.shilong.jysgl.pojo.po;

public class CouGr {
    private String cid;

    private String cgid;

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid == null ? null : cid.trim();
    }

    public String getCgid() {
        return cgid;
    }

    public void setCgid(String cgid) {
        this.cgid = cgid == null ? null : cgid.trim();
    }
}