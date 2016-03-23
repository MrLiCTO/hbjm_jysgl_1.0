package com.shilong.jysgl.pojo.po;

public class TeaPapersKey {
    private String teaid;

    private String paid;

    public String getTeaid() {
        return teaid;
    }

    public void setTeaid(String teaid) {
        this.teaid = teaid == null ? null : teaid.trim();
    }

    public String getPaid() {
        return paid;
    }

    public void setPaid(String paid) {
        this.paid = paid == null ? null : paid.trim();
    }
}