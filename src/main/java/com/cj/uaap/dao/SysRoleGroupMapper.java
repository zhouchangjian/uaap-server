package com.cj.uaap.dao;

import com.cj.uaap.entity.SysRoleGroup;
@MyBatisRepository
public interface SysRoleGroupMapper {
    int deleteByPrimaryKey(Long roleGroupId);

    int insert(SysRoleGroup record);

    int insertSelective(SysRoleGroup record);

    SysRoleGroup selectByPrimaryKey(Long roleGroupId);

    int updateByPrimaryKeySelective(SysRoleGroup record);

    int updateByPrimaryKey(SysRoleGroup record);
}