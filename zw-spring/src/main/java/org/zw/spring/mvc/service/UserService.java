package org.zw.spring.mvc.service;

import org.zw.spring.mvc.entity.User;

import java.util.Map;

public interface UserService {

    Map<Integer, User> getAllUsers();

    boolean addUser(User user);

    boolean updateUser(User user);

    User getUserByName(Integer userId);
}
