package com.example.demo.po.LRX;

public class ANLYS_MAJORCAR_ACCIDENT_DATA {
    private String sgid;

    private String sgbh;

    private String ccarnumber;

    private String clicensetype;

    private String sgsj;

    private String sgxq;

    private String rdldm;

    public String getSgid() {
        return sgid;
    }

    public void setSgid(String sgid) {
        this.sgid = sgid == null ? null : sgid.trim();
    }

    public String getSgbh() {
        return sgbh;
    }

    public void setSgbh(String sgbh) {
        this.sgbh = sgbh == null ? null : sgbh.trim();
    }

    public String getCcarnumber() {
        return ccarnumber;
    }

    public void setCcarnumber(String ccarnumber) {
        this.ccarnumber = ccarnumber == null ? null : ccarnumber.trim();
    }

    public String getClicensetype() {
        return clicensetype;
    }

    public void setClicensetype(String clicensetype) {
        this.clicensetype = clicensetype == null ? null : clicensetype.trim();
    }

    public String getSgsj() {
        return sgsj;
    }

    public void setSgsj(String sgsj) {
        this.sgsj = sgsj == null ? null : sgsj.trim();
    }

    public String getSgxq() {
        return sgxq;
    }

    public void setSgxq(String sgxq) {
        this.sgxq = sgxq == null ? null : sgxq.trim();
    }

    public String getRdldm() {
        return rdldm;
    }

    public void setRdldm(String rdldm) {
        this.rdldm = rdldm == null ? null : rdldm.trim();
    }
}