package com.example.demo.po.LRX;

public class PIS_INFO_BASEWithBLOBs extends PIS_INFO_BASE {
    private String infoDesc;

    private String infoContent;

    private String infoTopic;

    public String getInfoDesc() {
        return infoDesc;
    }

    public void setInfoDesc(String infoDesc) {
        this.infoDesc = infoDesc == null ? null : infoDesc.trim();
    }

    public String getInfoContent() {
        return infoContent;
    }

    public void setInfoContent(String infoContent) {
        this.infoContent = infoContent == null ? null : infoContent.trim();
    }

    public String getInfoTopic() {
        return infoTopic;
    }

    public void setInfoTopic(String infoTopic) {
        this.infoTopic = infoTopic == null ? null : infoTopic.trim();
    }
}