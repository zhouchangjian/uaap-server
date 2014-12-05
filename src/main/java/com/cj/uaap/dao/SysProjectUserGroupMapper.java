package com.cj.uaap.dao;

import com.cj.uaap.entity.SysProjectUserGroup;
@MyBatisRepository
public interface SysProjectUserGroupMapper {
    int deleteByPrimaryKey(Long projectUserGroupId);

    int insert(SysProjectUserGroup record);

    int insertSelective(SysProjectUserGroup record);

    SysProjectUserGroup selectByPrimaryKey(Long projectUserGroupId);

    int updateByPrimaryKeySelective(SysProjectUserGroup record);

    int updateByPrimaryKey(SysProjectUserGroup record);
}