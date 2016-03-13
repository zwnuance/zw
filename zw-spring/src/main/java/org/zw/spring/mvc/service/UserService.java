package org.zw.spring.mvc.service;

import org.zw.spring.mvc.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    boolean addUser(User user);

    boolean updateUser(User user);

    User getUserByName(String name);
}
