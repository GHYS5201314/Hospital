package com.qy.service;

import com.qy.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void updata(User user);
}
