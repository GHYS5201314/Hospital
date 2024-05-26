package com.qy.service;

import com.qy.domain.*;

import java.util.List;

public interface SystemUserService {

    public User login(SystemUser systemuser);

    void insertbook(Patient patient, DoctorSchedule doctorSchedule);

    List<DoctorSchedule> findAllSchedule(String username);
}
