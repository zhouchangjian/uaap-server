package com.cj.uaap.entity;

public class SysMenuResource {
    private Long menuResourceId;

    private String menuResourceName;

    private String menuResourceUrl;

    private Long permitId;

    public Long getMenuResourceId() {
        return menuResourceId;
    }

    public void setMenuResourceId(Long menuResourceId) {
        this.menuResourceId = menuResourceId;
    }

    public String getMenuResourceName() {
        return menuResourceName;
    }

    public void setMenuResourceName(String menuResourceName) {
        this.menuResourceName = menuResourceName == null ? null : menuResourceName.trim();
    }

    public String getMenuResourceUrl() {
        return menuResourceUrl;
    }

    public void setMenuResourceUrl(String menuResourceUrl) {
        this.menuResourceUrl = menuResourceUrl == null ? null : menuResourceUrl.trim();
    }

    public Long getPermitId() {
        return permitId;
    }

    public void setPermitId(Long permitId) {
        this.permitId = permitId;
    }
}