package com.cj.uaap.dao.test;

import static org.junit.Assert.*;
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

import com.cj.uaap.dao.UserDao;
import com.cj.uaap.entity.User;
@ContextConfiguration(locations = { "/spring-config.xml" })
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserDaoTest extends AbstractJUnit4SpringContextTests{
	Logger loger = LoggerFactory.getLogger(UserDaoTest.class);
	@Autowired
	private UserDao userDao;
	@Test
	public void test001UserDaoIsNull() throws Exception {
		assertNotNull("userDao not found", userDao);
		loger.info("test001UserDaoIsNull");
	}
	@Test
	public void test002CreateUser() throws Exception {
		User user = new User();
		user.setLocked(false);
		user.setUsername("adminA");
		user.setPassword("123456");
		user.setSalt("1234");
		user.setOwnerId(Long.valueOf(121));
		userDao.createUser(user);
		assertNotNull("user is not null",user.getUserId());
		loger.info("test002CreateUser");
	}
	@Test
	public void test003FindByUsername(){
		User user = userDao.findByUsername("adminA");
		assertEquals("adminA",user.getUsername());
		loger.info("test003FindByUsername");
	}
	@Test
	public void test004FindOne(){
		User user = userDao.findOne(Long.valueOf(1));
		assertEquals("adminA",user.getUsername());
		loger.info("test004FindOne");
	}
	@Test
	public void test005UpdateUser(){
		User user = userDao.findOne(Long.valueOf(1));
		user.setOwnerId(Long.valueOf(12213));
		userDao.updateUser(user);
		user =  userDao.findOne(Long.valueOf(1));
		assertEquals(Long.valueOf(12213),user.getOwnerId());
		loger.info("test005UpdateUser");
	}
}
