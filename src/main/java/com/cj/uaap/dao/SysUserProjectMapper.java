package com.cj.uaap.dao;

import com.cj.uaap.entity.SysUserProject;
@MyBatisRepository
public interface SysUserProjectMapper {
    int deleteByPrimaryKey(Long userProjectId);

    int insert(SysUserProject record);

    int insertSelective(SysUserProject record);

    SysUserProject selectByPrimaryKey(Long userProjectId);

    int updateByPrimaryKeySelective(SysUserProject record);

    int updateByPrimaryKey(SysUserProject record);
}