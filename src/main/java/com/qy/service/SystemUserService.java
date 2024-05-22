package com.qy.service;

import com.qy.domain.Doctor;
import com.qy.domain.ResponseResult;
import com.qy.domain.User;
import com.qy.domain.SystemUser;

public interface SystemUserService {

    public User login(SystemUser systemuser);

}
