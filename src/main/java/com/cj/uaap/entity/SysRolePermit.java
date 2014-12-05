package com.cj.uaap.entity;

public class SysRolePermit {
    private Long rolePermitId;

    private Long roleId;

    private Long permitId;

    public Long getRolePermitId() {
        return rolePermitId;
    }

    public void setRolePermitId(Long rolePermitId) {
        this.rolePermitId = rolePermitId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getPermitId() {
        return permitId;
    }

    public void setPermitId(Long permitId) {
        this.permitId = permitId;
    }
}