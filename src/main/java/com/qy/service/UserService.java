package com.qy.service;

import com.qy.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void updata(User user);

    void insert(String username, String password,String role,String name);

    User findbyusername(String username);
}
