package com.cj.uaap.entity;

public class SysElementResource {
    private Long elementResourceId;

    private String elementResourceName;

    private String elementResourceCode;

    private Long permitId;

    public Long getElementResourceId() {
        return elementResourceId;
    }

    public void setElementResourceId(Long elementResourceId) {
        this.elementResourceId = elementResourceId;
    }

    public String getElementResourceName() {
        return elementResourceName;
    }

    public void setElementResourceName(String elementResourceName) {
        this.elementResourceName = elementResourceName == null ? null : elementResourceName.trim();
    }

    public String getElementResourceCode() {
        return elementResourceCode;
    }

    public void setElementResourceCode(String elementResourceCode) {
        this.elementResourceCode = elementResourceCode == null ? null : elementResourceCode.trim();
    }

    public Long getPermitId() {
        return permitId;
    }

    public void setPermitId(Long permitId) {
        this.permitId = permitId;
    }
}