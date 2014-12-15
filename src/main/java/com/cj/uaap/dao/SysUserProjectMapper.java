package com.cj.uaap.dao;

import java.util.Map;

import com.cj.uaap.entity.SysUserProject;
@MyBatisRepository
public interface SysUserProjectMapper {
    int deleteByPrimaryKey(Long userProjectId);
    
    int deleteByUserIdAndProjectId(Map<String,Long> userIdAndProjectId);
    
    int insert(SysUserProject record);

    int insertSelective(SysUserProject record);

    SysUserProject selectByPrimaryKey(Long userProjectId);

    int updateByPrimaryKeySelective(SysUserProject record);

    int updateByPrimaryKey(SysUserProject record);
}