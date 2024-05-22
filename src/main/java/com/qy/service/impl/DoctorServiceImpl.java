package com.qy.service.impl;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import com.qy.domain.ResponseResult;
import com.qy.mapper.DoctorMapper;
import com.qy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public Integer doctor1Enroll(Doctor doctor) {
        return doctorMapper.doctor1Enroll(doctor);
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> doctors = doctorMapper.findAll();
        return doctors;
    }

    @Override
    public Doctor findByName(String name) {
        Doctor doctor = doctorMapper.findByName(name);
        return doctor;
    }

    @Override
    public void update(DoctorProperties doctorProperties) {
        doctorMapper.update(doctorProperties);
    }

    @Override
    public void add(String name) {

    }

}
