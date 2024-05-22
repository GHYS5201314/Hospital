package com.qy.service.impl;

import com.qy.domain.User;
import com.qy.mapper.UserMapper;
import com.qy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void updata(User user) {
        userMapper.updata(user);
    }

    @Override
    public void insert(String username, String password,String role,String name) {
        userMapper.insert(username,password,role,name);
    }

    @Override
    public User findbyusername(String username) {
        User user=userMapper.findByName(username);
        return user;
    }
}
