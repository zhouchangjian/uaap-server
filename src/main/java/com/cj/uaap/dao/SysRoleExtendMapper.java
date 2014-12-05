package com.cj.uaap.dao;

import com.cj.uaap.entity.SysRoleExtend;
@MyBatisRepository
public interface SysRoleExtendMapper {
    int deleteByPrimaryKey(Long roleExtendId);

    int insert(SysRoleExtend record);

    int insertSelective(SysRoleExtend record);

    SysRoleExtend selectByPrimaryKey(Long roleExtendId);

    int updateByPrimaryKeySelective(SysRoleExtend record);

    int updateByPrimaryKey(SysRoleExtend record);
}