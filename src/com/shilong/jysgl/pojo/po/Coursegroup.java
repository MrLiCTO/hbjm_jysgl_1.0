package com.shilong.jysgl.pojo.po;

public class Coursegroup {
	private String cgid;//课程组ID

    private String kczmc;//课程组名称

    private String kczz;//课程组长

    public String getCgid() {
        return cgid;
    }

    public void setCgid(String cgid) {
        this.cgid = cgid == null ? null : cgid.trim();
    }

    public String getKczmc() {
        return kczmc;
    }

    public void setKczmc(String kczmc) {
        this.kczmc = kczmc == null ? null : kczmc.trim();
    }

    public String getKczz() {
        return kczz;
    }

    public void setKczz(String kczz) {
        this.kczz = kczz == null ? null : kczz.trim();
    }
}