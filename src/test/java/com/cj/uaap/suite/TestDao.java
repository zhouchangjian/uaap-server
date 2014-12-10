package com.cj.uaap.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cj.uaap.dao.test.UserDaoTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({UserDaoTest.class})
public class TestDao {

}
