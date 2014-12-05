package com.cj.uaap.dao;

import com.cj.uaap.entity.SysUserProjectRole;
@MyBatisRepository
public interface SysUserProjectRoleMapper {
    int deleteByPrimaryKey(Long userProjectRoleId);

    int insert(SysUserProjectRole record);

    int insertSelective(SysUserProjectRole record);

    SysUserProjectRole selectByPrimaryKey(Long userProjectRoleId);

    int updateByPrimaryKeySelective(SysUserProjectRole record);

    int updateByPrimaryKey(SysUserProjectRole record);
}