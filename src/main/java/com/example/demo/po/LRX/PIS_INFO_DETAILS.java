package com.example.demo.po.LRX;

import java.math.BigDecimal;

public class PIS_INFO_DETAILS {
    private String infoId;

    private String areaid;

    private String infoLocation;

    private String locationCoordinate;

    private String reporterName;

    private String reporterSex;

    private String reporterPhone;

    private BigDecimal woundedNum;

    private BigDecimal deathNum;

    private String accidentShape;

    private String entrustDept;

    private String entrustPerson;

    private String entrustPhone;

    public String getInfoId() {
        return infoId;
    }

    public void setInfoId(String infoId) {
        this.infoId = infoId == null ? null : infoId.trim();
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid == null ? null : areaid.trim();
    }

    public String getInfoLocation() {
        return infoLocation;
    }

    public void setInfoLocation(String infoLocation) {
        this.infoLocation = infoLocation == null ? null : infoLocation.trim();
    }

    public String getLocationCoordinate() {
        return locationCoordinate;
    }

    public void setLocationCoordinate(String locationCoordinate) {
        this.locationCoordinate = locationCoordinate == null ? null : locationCoordinate.trim();
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName == null ? null : reporterName.trim();
    }

    public String getReporterSex() {
        return reporterSex;
    }

    public void setReporterSex(String reporterSex) {
        this.reporterSex = reporterSex == null ? null : reporterSex.trim();
    }

    public String getReporterPhone() {
        return reporterPhone;
    }

    public void setReporterPhone(String reporterPhone) {
        this.reporterPhone = reporterPhone == null ? null : reporterPhone.trim();
    }

    public BigDecimal getWoundedNum() {
        return woundedNum;
    }

    public void setWoundedNum(BigDecimal woundedNum) {
        this.woundedNum = woundedNum;
    }

    public BigDecimal getDeathNum() {
        return deathNum;
    }

    public void setDeathNum(BigDecimal deathNum) {
        this.deathNum = deathNum;
    }

    public String getAccidentShape() {
        return accidentShape;
    }

    public void setAccidentShape(String accidentShape) {
        this.accidentShape = accidentShape == null ? null : accidentShape.trim();
    }

    public String getEntrustDept() {
        return entrustDept;
    }

    public void setEntrustDept(String entrustDept) {
        this.entrustDept = entrustDept == null ? null : entrustDept.trim();
    }

    public String getEntrustPerson() {
        return entrustPerson;
    }

    public void setEntrustPerson(String entrustPerson) {
        this.entrustPerson = entrustPerson == null ? null : entrustPerson.trim();
    }

    public String getEntrustPhone() {
        return entrustPhone;
    }

    public void setEntrustPhone(String entrustPhone) {
        this.entrustPhone = entrustPhone == null ? null : entrustPhone.trim();
    }
}