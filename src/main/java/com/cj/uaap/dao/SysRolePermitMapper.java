package com.cj.uaap.dao;

import com.cj.uaap.entity.SysRolePermit;
@MyBatisRepository
public interface SysRolePermitMapper {
    int deleteByPrimaryKey(Long rolePermitId);

    int insert(SysRolePermit record);

    int insertSelective(SysRolePermit record);

    SysRolePermit selectByPrimaryKey(Long rolePermitId);

    int updateByPrimaryKeySelective(SysRolePermit record);

    int updateByPrimaryKey(SysRolePermit record);
}