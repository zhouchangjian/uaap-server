package com.cj.uaap.entity;

public class SysRoleExtend {
    private Long roleExtendId;

    private Long roleId;

    private Long parentId;

    public Long getRoleExtendId() {
        return roleExtendId;
    }

    public void setRoleExtendId(Long roleExtendId) {
        this.roleExtendId = roleExtendId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
}