package com.example.demo.po.LRX;

import java.util.Date;

public class PIS_INFO_GROUP_RELATION extends PIS_INFO_GROUP_RELATIONKey {
    private String isMain;

    private Date mergeTime;

    private String isAppend;

    public String getIsMain() {
        return isMain;
    }

    public void setIsMain(String isMain) {
        this.isMain = isMain == null ? null : isMain.trim();
    }

    public Date getMergeTime() {
        return mergeTime;
    }

    public void setMergeTime(Date mergeTime) {
        this.mergeTime = mergeTime;
    }

    public String getIsAppend() {
        return isAppend;
    }

    public void setIsAppend(String isAppend) {
        this.isAppend = isAppend == null ? null : isAppend.trim();
    }
}