package com.qy.service.impl;

import com.qy.domain.Doctor;
import com.qy.domain.ResponseResult;
import com.qy.domain.SystemUser;
import com.qy.domain.User;
import com.qy.mapper.SystemUserMapper;
import com.qy.service.DoctorService;
import com.qy.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SystemUserServiceImpl implements SystemUserService {

    @Autowired
    private SystemUserMapper systemUserMapper;
    @Autowired
    private DoctorService doctorService;

    @Override
    public User login(SystemUser systemuser) {
        User loginuser = systemUserMapper.login(systemuser);
        return loginuser;
    }
}