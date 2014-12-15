package com.cj.uaap.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.uaap.dao.SysProjectMapper;
import com.cj.uaap.dao.SysProjectUserGroupMapper;
import com.cj.uaap.dao.SysUserProjectMapper;
import com.cj.uaap.entity.SysProject;
import com.cj.uaap.entity.SysProjectUserGroup;
import com.cj.uaap.entity.SysUserProject;
/**
 * 作者：z_changjiang
 * 日期：2014-12-13
 * 描述：实现项目管理相关功能
 */
@Service
public class SysProjectServiceImpl implements SysProjectService {

	/**
	 * 项目管理DAO
	 */
	@Autowired
	private SysProjectMapper sysProjectMapper;
	/**
	 * 用户项目关系DAO
	 */
	@Autowired
	private SysUserProjectMapper sysUserProjectMapper;
	/**
	 * 项目用户组
	 */
	@Autowired
	private SysProjectUserGroupMapper sysProjectUserGroupMapper;
	
	@Override
	public SysProject createSysProject(SysProject sysProject) {
		this.sysProjectMapper.insert(sysProject);
		return sysProject;
	}

	@Override
	public SysProject updateSysProject(SysProject sysProject) {
		this.getSysProjectMapper().updateByPrimaryKey(sysProject);
		return sysProject;
	}

	@Override
	public void deleteSysProject(Long projectId) {
		this.getSysProjectMapper().deleteByPrimaryKey(projectId);
	}

	@Override
	public SysProject findSysProject(Long projectId) {
		return this.getSysProjectMapper().selectByPrimaryKey(projectId);
	}
	@Override
	public SysProjectUserGroup createSysProjectUserGroup(
			SysProjectUserGroup sysProjectUserGroup) {
		this.sysProjectUserGroupMapper.insert(sysProjectUserGroup);
		return sysProjectUserGroup;
	}

	@Override
	public SysProjectUserGroup updateSysProjectUserGroup(
			SysProjectUserGroup sysProjectUserGroup) {
		this.sysProjectUserGroupMapper.updateByPrimaryKey(sysProjectUserGroup);
		return sysProjectUserGroup;
	}

	@Override
	public SysProjectUserGroup findSysProjectUserGroup(Long userId) {
		return this.sysProjectUserGroupMapper.selectByPrimaryKey(userId);
	}
	@Override
	public List<SysProjectUserGroup> queryUserGroupChildrens(
			Long projectUserGroupId, int height) {
		int curentHeight =0;
		List<SysProjectUserGroup> list = this.sysProjectUserGroupMapper.queryByparentId(projectUserGroupId);
		curentHeight++;
		if(curentHeight<height||height<=0){
			for(SysProjectUserGroup sysProjectUserGroup:list){
				sysProjectUserGroup.setChildrens(this.queryUserGroupChildrens(sysProjectUserGroup.getProjectUserGroupId(), height-1));
			}
		}
		return list;
	}

	@Override
	public void queryUserGroupChildrens(
			SysProjectUserGroup sysProjectUserGroup, int height) {
		List<SysProjectUserGroup> childrens = this.queryUserGroupChildrens(sysProjectUserGroup.getProjectUserGroupId(), height);
		sysProjectUserGroup.setChildrens(childrens);
	}
	
	@Override
	public SysUserProject assignUserToProject(SysUserProject sysUserProject) {
		this.getSysUserProjectMapper().insert(sysUserProject);
		return sysUserProject;
	}

	@Override
	public void deleteUserFromProject(Long userId, Long projectId) {
		Map<String,Long> userIdAndProjectId = new HashMap<>();
		userIdAndProjectId.put("userId", userId);
		userIdAndProjectId.put("projectId", projectId);
		this.getSysUserProjectMapper().deleteByUserIdAndProjectId(userIdAndProjectId);
	}

	@Override
	public SysUserProject updateUserProject(SysUserProject sysUserProject) {
		this.getSysUserProjectMapper().updateByPrimaryKey(sysUserProject);
		return sysUserProject;
	}

	public SysProjectMapper getSysProjectMapper() {
		return sysProjectMapper;
	}

	public void setSysProjectMapper(SysProjectMapper sysProjectMapper) {
		this.sysProjectMapper = sysProjectMapper;
	}

	public SysUserProjectMapper getSysUserProjectMapper() {
		return sysUserProjectMapper;
	}

	public void setSysUserProjectMapper(SysUserProjectMapper sysUserProjectMapper) {
		this.sysUserProjectMapper = sysUserProjectMapper;
	}

	public SysProjectUserGroupMapper getSysProjectUserGroupMapper() {
		return sysProjectUserGroupMapper;
	}

	public void setSysProjectUserGroupMapper(
			SysProjectUserGroupMapper sysProjectUserGroupMapper) {
		this.sysProjectUserGroupMapper = sysProjectUserGroupMapper;
	}
}
