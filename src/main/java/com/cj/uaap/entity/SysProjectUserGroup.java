package com.cj.uaap.entity;

public class SysProjectUserGroup {
    private Long projectUserGroupId;

    private Long projectId;

    private String userProjectGroupName;

    private Long parentId;

    private String userProjectGroupDesc;

    public Long getProjectUserGroupId() {
        return projectUserGroupId;
    }

    public void setProjectUserGroupId(Long projectUserGroupId) {
        this.projectUserGroupId = projectUserGroupId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getUserProjectGroupName() {
        return userProjectGroupName;
    }

    public void setUserProjectGroupName(String userProjectGroupName) {
        this.userProjectGroupName = userProjectGroupName == null ? null : userProjectGroupName.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getUserProjectGroupDesc() {
        return userProjectGroupDesc;
    }

    public void setUserProjectGroupDesc(String userProjectGroupDesc) {
        this.userProjectGroupDesc = userProjectGroupDesc == null ? null : userProjectGroupDesc.trim();
    }
}