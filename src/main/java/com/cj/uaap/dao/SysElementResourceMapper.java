package com.cj.uaap.dao;

import com.cj.uaap.entity.SysElementResource;
@MyBatisRepository
public interface SysElementResourceMapper {
    int deleteByPrimaryKey(Long elementResourceId);

    int insert(SysElementResource record);

    int insertSelective(SysElementResource record);

    SysElementResource selectByPrimaryKey(Long elementResourceId);

    int updateByPrimaryKeySelective(SysElementResource record);

    int updateByPrimaryKey(SysElementResource record);
}