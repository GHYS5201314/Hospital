package com.qy.service.impl;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import com.qy.domain.DoctorSchedule;
import com.qy.domain.ResponseResult;
import com.qy.mapper.DoctorMapper;
import com.qy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Properties;

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
    public void addproperties(String name) {
        doctorMapper.addproperties(name);
    }

    @Override
    public Properties getproperties(String name) {
        return doctorMapper.getProperties(name);
    }

    @Override
    public List<DoctorProperties> findAll2() {
        List<DoctorProperties>doctorProperties= doctorMapper.findAll2();
        return doctorProperties;
    }

    @Override
    public Doctor findByUsername(String username) {
        return doctorMapper.findByUsername(username);
    }

    @Override
    public void addSchedule(DoctorSchedule doctorSchedule) {
        doctorMapper.addSchedule(doctorSchedule);
    }

    @Override
    public void deleteSchedule(DoctorSchedule doctorSchedule) {
        doctorMapper.deleteSchedule(doctorSchedule);
    }

    @Override
    public List<DoctorSchedule> findAllSchedule() {
        return doctorMapper.findAllSchedule();
    }

    @Override
    public void updateschedule(DoctorSchedule doctorSchedule) {
        doctorMapper.updateschedule(doctorSchedule);
    }

    @Override
    public DoctorSchedule findDoctorScheduleByNameAndKind(String name, String kind) {
        return doctorMapper.findDoctorScheduleByNameAndKind(name,kind);
    }

    @Override
    public void updateDoctorStatus(String status, String name) {
        doctorMapper.updateDoctorStatus(status,name);
    }

}
