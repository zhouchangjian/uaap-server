package com.cj.uaap.dao;

import com.cj.uaap.entity.SysProjectUserGroupRole;
@MyBatisRepository
public interface SysProjectUserGroupRoleMapper {
    int deleteByPrimaryKey(Long projectUserGroupRoleId);

    int insert(SysProjectUserGroupRole record);

    int insertSelective(SysProjectUserGroupRole record);

    SysProjectUserGroupRole selectByPrimaryKey(Long projectUserGroupRoleId);

    int updateByPrimaryKeySelective(SysProjectUserGroupRole record);

    int updateByPrimaryKey(SysProjectUserGroupRole record);
}