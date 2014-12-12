package com.cj.uaap.service.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

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
		SysUser sysUser = sysUserService.findSysUser(Long.valueOf(1));
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
	@Test
	public void test006InsertUserGroupTree(){
		SysProjectUserGroup fxczg1 = new SysProjectUserGroup();
		fxczg1.setParentId(Long.valueOf(1));
		fxczg1.setProjectId(Long.valueOf(1));
		fxczg1.setUserProjectGroupDesc("分析处用户组");
		fxczg1.setUserProjectGroupName("分析处职工1");
		sysUserService.createSysProjectUserGroup(fxczg1);
		
		SysProjectUserGroup fxczg2 = new SysProjectUserGroup();
		fxczg2.setParentId(Long.valueOf(1));
		fxczg2.setProjectId(Long.valueOf(1));
		fxczg2.setUserProjectGroupDesc("分析处用户组");
		fxczg2.setUserProjectGroupName("分析处职工2");
		sysUserService.createSysProjectUserGroup(fxczg2);
		
		SysProjectUserGroup fxczg3 = new SysProjectUserGroup();
		fxczg3.setParentId(Long.valueOf(1));
		fxczg3.setProjectId(Long.valueOf(1));
		fxczg3.setUserProjectGroupDesc("分析处用户组");
		fxczg3.setUserProjectGroupName("分析处职工3");
		sysUserService.createSysProjectUserGroup(fxczg3);
		
		SysProjectUserGroup fxczg31 = new SysProjectUserGroup();
		fxczg31.setParentId(Long.valueOf(4));
		fxczg31.setProjectId(Long.valueOf(1));
		fxczg31.setUserProjectGroupDesc("分析处用户组");
		fxczg31.setUserProjectGroupName("分析处职工3-1");
		sysUserService.createSysProjectUserGroup(fxczg31);
		
		SysProjectUserGroup fxczg32 = new SysProjectUserGroup();
		fxczg32.setParentId(Long.valueOf(4));
		fxczg32.setProjectId(Long.valueOf(1));
		fxczg32.setUserProjectGroupDesc("分析处用户组");
		fxczg32.setUserProjectGroupName("分析处职工3-2");
		sysUserService.createSysProjectUserGroup(fxczg32);
		
		SysProjectUserGroup fxczg21 = new SysProjectUserGroup();
		fxczg21.setParentId(Long.valueOf(3));
		fxczg21.setProjectId(Long.valueOf(1));
		fxczg21.setUserProjectGroupDesc("分析处用户组");
		fxczg21.setUserProjectGroupName("分析处职工2-1");
		sysUserService.createSysProjectUserGroup(fxczg21);
		
		SysProjectUserGroup fxczg22 = new SysProjectUserGroup();
		fxczg22.setParentId(Long.valueOf(3));
		fxczg22.setProjectId(Long.valueOf(1));
		fxczg22.setUserProjectGroupDesc("分析处用户组");
		fxczg22.setUserProjectGroupName("分析处职工2-2");
		sysUserService.createSysProjectUserGroup(fxczg22);
		
		SysProjectUserGroup fxczg221 = new SysProjectUserGroup();
		fxczg221.setParentId(Long.valueOf(8));
		fxczg221.setProjectId(Long.valueOf(1));
		fxczg221.setUserProjectGroupDesc("分析处用户组");
		fxczg221.setUserProjectGroupName("分析处职工2-2-1");
		sysUserService.createSysProjectUserGroup(fxczg221);
		
		SysProjectUserGroup fxczg222 = new SysProjectUserGroup();
		fxczg222.setParentId(Long.valueOf(8));
		fxczg222.setProjectId(Long.valueOf(1));
		fxczg222.setUserProjectGroupDesc("分析处用户组");
		fxczg222.setUserProjectGroupName("分析处职工2-2-2");
		sysUserService.createSysProjectUserGroup(fxczg222);
		
		
		List<SysProjectUserGroup> sysProjectUserGroupAllchild = sysUserService.queryUserGroupChildrens(Long.valueOf(1), 2);
		assertEquals(3,sysProjectUserGroupAllchild.size());
		for(SysProjectUserGroup sysProjectUserGroup : sysProjectUserGroupAllchild){
			if(sysProjectUserGroup.getChildrens()!=null&&sysProjectUserGroup.getChildrens().size()>0){
				assertEquals(2,sysProjectUserGroup.getChildrens().size());
			}
		}
		SysProjectUserGroup printInfo = sysUserService.findSysProjectUserGroup(Long.valueOf(1));
		sysUserService.queryUserGroupChildrens(printInfo, -1);
		printUserGroupTree(printInfo,"--|");
	}
	
	private void printUserGroupTree(SysProjectUserGroup sysProjectUserGroup,String begin){
		loger.info(begin+sysProjectUserGroup.getUserProjectGroupName());
		List<SysProjectUserGroup> childrens = sysProjectUserGroup.getChildrens();
		for(SysProjectUserGroup children:childrens){
			printUserGroupTree(children,"--"+begin);
		}
	}
	public SysUserService getSysUserService() {
		return sysUserService;
	}
	public void setSysUserService(SysUserService sysUserService) {
		this.sysUserService = sysUserService;
	}
	
}
