package org.zw.spring.mvc.service.impl;

import org.springframework.stereotype.Service;
import org.zw.spring.mvc.entity.User;
import org.zw.spring.mvc.service.UserService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service(value = "userService")
public class UserServiceImpl implements UserService{

    private Map<String, User> users = new HashMap<>();


    @Override
    public List<User> getAllUsers() {

        return new ArrayList<User>(users.values());
    }

    @Override
    public boolean addUser(User user) {
        return users.put(user.getName(), user) == null;
    }

    @Override
    public boolean updateUser(User user) {
        return users.put(user.getName(), user) == null;
    }

    @Override
    public User getUserByName(String name){
        return users.get(name);
    }
}
