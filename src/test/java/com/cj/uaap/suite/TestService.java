package com.cj.uaap.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.cj.uaap.dao.test.UserDaoTest;
import com.cj.uaap.service.test.ProjectServiceTest;
import com.cj.uaap.service.test.UserServiceTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({UserServiceTest.class,ProjectServiceTest.class})
public class TestService {

}
