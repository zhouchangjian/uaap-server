package com.cj.uaap.entity;

public class SysUserProject {
    private Long userProjectId;

    private Long userId;

    private Long projectId;

    private String userProjectType;

    private Long projectUserGroupId;

    public Long getUserProjectId() {
        return userProjectId;
    }

    public void setUserProjectId(Long userProjectId) {
        this.userProjectId = userProjectId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    public String getUserProjectType() {
        return userProjectType;
    }

    public void setUserProjectType(String userProjectType) {
        this.userProjectType = userProjectType == null ? null : userProjectType.trim();
    }

    public Long getProjectUserGroupId() {
        return projectUserGroupId;
    }

    public void setProjectUserGroupId(Long projectUserGroupId) {
        this.projectUserGroupId = projectUserGroupId;
    }
}