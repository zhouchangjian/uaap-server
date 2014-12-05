package com.cj.uaap.dao;

import com.cj.uaap.entity.SysPermit;
@MyBatisRepository
public interface SysPermitMapper {
    int deleteByPrimaryKey(Long permitId);

    int insert(SysPermit record);

    int insertSelective(SysPermit record);

    SysPermit selectByPrimaryKey(Long permitId);

    int updateByPrimaryKeySelective(SysPermit record);

    int updateByPrimaryKey(SysPermit record);
}