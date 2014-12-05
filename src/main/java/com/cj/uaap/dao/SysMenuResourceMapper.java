package com.cj.uaap.dao;

import com.cj.uaap.entity.SysMenuResource;
@MyBatisRepository
public interface SysMenuResourceMapper {
    int deleteByPrimaryKey(Long menuResourceId);

    int insert(SysMenuResource record);

    int insertSelective(SysMenuResource record);

    SysMenuResource selectByPrimaryKey(Long menuResourceId);

    int updateByPrimaryKeySelective(SysMenuResource record);

    int updateByPrimaryKey(SysMenuResource record);
}