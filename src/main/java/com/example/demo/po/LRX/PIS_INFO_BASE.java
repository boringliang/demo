package com.example.demo.po.LRX;

import java.util.Date;

public class PIS_INFO_BASE {
    private String infoId;

    private String infoChannel;

    private String infoSource;

    private String infoFeature;

    private String infoLevel;

    private String infoType;

    private String infoSubtype;

    private Date infoTime;

    private Date createTime;

    private String infoStage;

    private Date dispatchTime;

    private Date signTime;

    private String thirdsyscode;

    private String simhashcode;

    private String infoCoordinate;

    private Object infoAddress;

    private Date confirmTime;

    private String confirmUserid;

    private Date closeTime;

    private String infoDeptid;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getInfoChannel() {
        return infoChannel;
    }

    public void setInfoChannel(String infoChannel) {
        this.infoChannel = infoChannel == null ? null : infoChannel.trim();
    }

    public String getInfoSource() {
        return infoSource;
    }

    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource == null ? null : infoSource.trim();
    }

    public String getInfoFeature() {
        return infoFeature;
    }

    public void setInfoFeature(String infoFeature) {
        this.infoFeature = infoFeature == null ? null : infoFeature.trim();
    }

    public String getInfoLevel() {
        return infoLevel;
    }

    public void setInfoLevel(String infoLevel) {
        this.infoLevel = infoLevel == null ? null : infoLevel.trim();
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType == null ? null : infoType.trim();
    }

    public String getInfoSubtype() {
        return infoSubtype;
    }

    public void setInfoSubtype(String infoSubtype) {
        this.infoSubtype = infoSubtype == null ? null : infoSubtype.trim();
    }

    public Date getInfoTime() {
        return infoTime;
    }

    public void setInfoTime(Date infoTime) {
        this.infoTime = infoTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getInfoStage() {
        return infoStage;
    }

    public void setInfoStage(String infoStage) {
        this.infoStage = infoStage == null ? null : infoStage.trim();
    }

    public Date getDispatchTime() {
        return dispatchTime;
    }

    public void setDispatchTime(Date dispatchTime) {
        this.dispatchTime = dispatchTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getThirdsyscode() {
        return thirdsyscode;
    }

    public void setThirdsyscode(String thirdsyscode) {
        this.thirdsyscode = thirdsyscode == null ? null : thirdsyscode.trim();
    }

    public String getSimhashcode() {
        return simhashcode;
    }

    public void setSimhashcode(String simhashcode) {
        this.simhashcode = simhashcode == null ? null : simhashcode.trim();
    }

    public String getInfoCoordinate() {
        return infoCoordinate;
    }

    public void setInfoCoordinate(String infoCoordinate) {
        this.infoCoordinate = infoCoordinate == null ? null : infoCoordinate.trim();
    }

    public Object getInfoAddress() {
        return infoAddress;
    }

    public void setInfoAddress(Object infoAddress) {
        this.infoAddress = infoAddress;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmUserid() {
        return confirmUserid;
    }

    public void setConfirmUserid(String confirmUserid) {
        this.confirmUserid = confirmUserid == null ? null : confirmUserid.trim();
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getInfoDeptid() {
        return infoDeptid;
    }

    public void setInfoDeptid(String infoDeptid) {
        this.infoDeptid = infoDeptid == null ? null : infoDeptid.trim();
    }
}