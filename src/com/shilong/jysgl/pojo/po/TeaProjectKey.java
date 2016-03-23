package com.shilong.jysgl.pojo.po;

public class TeaProjectKey {
    private String teaid;

    private String prid;

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid == null ? null : teaid.trim();
    }

    public String getPrid() {
        return prid;
    }

    public void setPrid(String prid) {
        this.prid = prid == null ? null : prid.trim();
    }
}