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
}
