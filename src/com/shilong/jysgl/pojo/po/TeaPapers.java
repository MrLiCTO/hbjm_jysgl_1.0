package com.shilong.jysgl.pojo.po;

public class TeaPapers extends TeaPapersKey {
    private String smwc;

    public String getSmwc() {
        return smwc;
    }

    public void setSmwc(String smwc) {
        this.smwc = smwc == null ? null : smwc.trim();
    }
}