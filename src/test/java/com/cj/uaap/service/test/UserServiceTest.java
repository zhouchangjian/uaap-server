package com.cj.uaap.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.cj.uaap.dao.test.UserDaoTest;
import com.cj.uaap.entity.SysProjectUserGroup;
import com.cj.uaap.entity.SysUser;
import com.cj.uaap.service.SysUserService;
@ContextConfiguration(locations = { "/spring-config.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserServiceTest extends AbstractJUnit4SpringContextTests{
	Logger loger = LoggerFactory.getLogger(UserServiceTest.class);
	@Autowired
	private SysUserService sysUserService;
	
	@Test
	public void test001SysUserServiceIsNull(){
		assertNotNull("userDao not found", sysUserService);
		loger.info("test001SysUserServiceIsNull");
	}
	@Test
	public void test002CrateUser(){
		SysUser sysUser = new SysUser();
		sysUser.setUsername("admin001");
		sysUser.setPassword("12345qwert");
		sysUser.setSalt("000000");
		sysUser.setLocked(false);
		sysUser.setOwnerId(null);
		sysUserService.createUser(sysUser);
		assertNotNull(sysUser.getUserId());
	}
	@Test
	public void test003ChangePassword(){
		sysUserService.changePassword(Long.valueOf(1), "qwert12345");
		SysUser sysUser = sysUserService.findOne(Long.valueOf(1));
		assertEquals("qwert12345",sysUser.getPassword());
	}
	
	@Test
	public void test004CreateSysProjectUserGroup(){
		SysProjectUserGroup sysProjectUserGroup = new SysProjectUserGroup();
		sysProjectUserGroup.setParentId(null);
		sysProjectUserGroup.setProjectId(Long.valueOf(1));
		sysProjectUserGroup.setUserProjectGroupDesc("分析处用户组");
		sysProjectUserGroup.setUserProjectGroupName("分析处");
		sysUserService.createSysProjectUserGroup(sysProjectUserGroup);
		assertNotNull(sysProjectUserGroup.getProjectUserGroupId());
	}
	@Test
	public void test005UpdateSysProjectUserGroup(){
		SysProjectUserGroup sysProjectUserGroup = sysUserService.findSysProjectUserGroup(Long.valueOf(1));
		sysProjectUserGroup.setUserProjectGroupDesc("分析处用户组描述");
		sysUserService.updateSysProjectUserGroup(sysProjectUserGroup);
		SysProjectUserGroup newSysProjectUserGroup = sysUserService.findSysProjectUserGroup(Long.valueOf(1));
		assertEquals("分析处用户组描述",newSysProjectUserGroup.getUserProjectGroupDesc());
	}
	
	
	public SysUserService getSysUserService() {
		return sysUserService;
	}
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}
	
}
