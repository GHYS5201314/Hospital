package com.qy.service;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import com.qy.domain.DoctorSchedule;

import java.util.List;
import java.util.Properties;

public interface DoctorService {
    public Integer doctor1Enroll(Doctor doctor);
    public List<Doctor> findAll();
    public Doctor findByName(String name);
    public void update(DoctorProperties doctorProperties);
    public void addproperties(String name);
    public Properties getproperties(String name);

    List<DoctorProperties> findAll2();
    Doctor findByUsername(String username);
    void addSchedule(DoctorSchedule doctorSchedule);
    void deleteSchedule(DoctorSchedule doctorSchedule);
    List<DoctorSchedule> findAllSchedule();
    void updateschedule(DoctorSchedule doctorSchedule);
    DoctorSchedule findDoctorScheduleByNameAndKind(String name,String kind);
    void updateDoctorStatus(String status,String name);
}
