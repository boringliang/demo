package com.example.demo.po.LRX;

public class ANLYS_POLICE_CASE_HOUR {
    private String nid;

    private String caseCategory;

    private String concreteType;

    private String caseTime;

    private String areaId;

    private String alarmAmoubt;

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid == null ? null : nid.trim();
    }

    public String getCaseCategory() {
        return caseCategory;
    }

    public void setCaseCategory(String caseCategory) {
        this.caseCategory = caseCategory == null ? null : caseCategory.trim();
    }

    public String getConcreteType() {
        return concreteType;
    }

    public void setConcreteType(String concreteType) {
        this.concreteType = concreteType == null ? null : concreteType.trim();
    }

    public String getCaseTime() {
        return caseTime;
    }

    public void setCaseTime(String caseTime) {
        this.caseTime = caseTime == null ? null : caseTime.trim();
    }

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId == null ? null : areaId.trim();
    }

    public String getAlarmAmoubt() {
        return alarmAmoubt;
    }

    public void setAlarmAmoubt(String alarmAmoubt) {
        this.alarmAmoubt = alarmAmoubt == null ? null : alarmAmoubt.trim();
    }
}