package org.zw.spring.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.zw.spring.mvc.entity.User;
import org.zw.spring.mvc.service.UserService;

import java.util.HashMap;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    private Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        users.put(1, new User(1, "11", 11));
        users.put(2, new User(2, "22", 22));
        users.put(3, new User(3, "33", 33));
        users.put(4, new User(4, "44", 44));
    }

    @Override
    public Map<Integer, User> getAllUsers() {
        return users;
    }

    @Override
    public boolean addUser(User user) {
        return users.put(user.getUserId(), user) == null;
    }

    @Override
    public boolean updateUser(User user) {
        return users.put(user.getUserId(), user) == null;
    }

    @Override
    public User getUserByName(Integer userId){
        return users.get(userId);
    }
}
