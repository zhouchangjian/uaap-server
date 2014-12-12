package com.cj.uaap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.uaap.dao.SysProjectUserGroupMapper;
import com.cj.uaap.dao.SysUserMapper;
import com.cj.uaap.entity.SysProject;
import com.cj.uaap.entity.SysProjectUserGroup;
import com.cj.uaap.entity.SysUser;

/**
 * 作者：z_changjiang
 * 日期：2014-12-10
 * 描述： 实现用户管理功能
 *
 */
@Service
public class SysUserServiceImpl implements SysUserService {
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private SysProjectUserGroupMapper sysProjectUserGroupMapper;
	@Override
	public SysUser createUser(SysUser sysUser) {
		this.sysUserMapper.insert(sysUser);
		return sysUser;
	}

	@Override
	public SysUser updateUser(SysUser sysUser) {
		this.sysUserMapper.updateByPrimaryKey(sysUser);
		return sysUser;
	}

	@Override
	public void deleteUser(Long userId) {
		this.sysUserMapper.deleteByPrimaryKey(userId);
	}

	@Override
	public void changePassword(Long userId, String newPassword) {
		SysUser sysUser = new SysUser();
		sysUser.setUserId(userId);
		sysUser.setPassword(newPassword);
		this.sysUserMapper.updateByPrimaryKeySelective(sysUser);
	}

	@Override
	public SysUser findSysUser(Long userId) {
		return this.sysUserMapper.selectByPrimaryKey(userId);
	}


	@Override
	public SysUser findByUsername(String username) {
		return this.sysUserMapper.selectByUsername(username);
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
	public SysUserMapper getSysUserMapper() {
		return sysUserMapper;
	}

	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}

	public SysProjectUserGroupMapper getSysProjectUserGroupMapper() {
		return sysProjectUserGroupMapper;
	}

	public void setSysProjectUserGroupMapper(
			SysProjectUserGroupMapper sysProjectUserGroupMapper) {
		this.sysProjectUserGroupMapper = sysProjectUserGroupMapper;
	}
}
