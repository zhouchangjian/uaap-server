package com.cj.uaap.dao;

import com.cj.uaap.entity.SysProject;
@MyBatisRepository
public interface SysProjectMapper {
    int deleteByPrimaryKey(Long projectId);

    int insert(SysProject record);

    int insertSelective(SysProject record);

    SysProject selectByPrimaryKey(Long projectId);

    int updateByPrimaryKeySelective(SysProject record);

    int updateByPrimaryKey(SysProject record);
}