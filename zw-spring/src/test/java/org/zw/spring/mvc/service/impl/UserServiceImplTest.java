package org.zw.spring.mvc.service.impl;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zw.spring.mvc.entity.User;
import org.zw.spring.mvc.service.UserService;

import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring-test.xml"})
public class UserServiceImplTest extends TestCase {

    private Logger logger = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    private UserService userService;

    @Test
    public void testGetAllUsers() throws Exception {
        Map<Integer, User> allUsers = userService.getAllUsers();
        assertNotNull(allUsers);
        for (Map.Entry<Integer, User> entry: allUsers.entrySet()) {
            logger.info("user:{}", entry.getValue());
        }
    }
}