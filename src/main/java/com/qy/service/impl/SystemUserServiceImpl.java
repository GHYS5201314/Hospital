package com.qy.service.impl;

import com.qy.domain.*;
import com.qy.mapper.SystemUserMapper;
import com.qy.service.DoctorService;
import com.qy.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public void insertbook(Patient patient, DoctorSchedule doctorSchedule) {
        systemUserMapper.insertbook(patient.getName(),doctorSchedule.getStartTime(),doctorSchedule.getEndTime(),patient.getUsername(),"已预约");
    }

    @Override
    public List<DoctorSchedule> findAllSchedule(String username) {
        return systemUserMapper.findAllSchedule(username);
    }
}