package com.qy.service;

import com.qy.domain.Doctor;
import com.qy.domain.ResponseResult;

import java.util.List;

public interface DoctorService {
    public Integer doctor1Enroll(Doctor doctor);
    public List<Doctor> findAll();
    public Doctor findByName(String name);
}
