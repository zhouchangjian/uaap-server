package com.cj.uaap.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cj.uaap.dao.SysUserMapper;
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

	public SysUserMapper getSysUserMapper() {
		return sysUserMapper;
	}

	public void setSysUserMapper(SysUserMapper sysUserMapper) {
		this.sysUserMapper = sysUserMapper;
	}
}
