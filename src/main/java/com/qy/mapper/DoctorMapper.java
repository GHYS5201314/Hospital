package com.qy.mapper;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DoctorMapper {
    List<Doctor> findAll();
    Doctor findByName(String name);
    Integer doctor1Enroll(Doctor doctor);
    void update(DoctorProperties doctorProperties);
    void addproperties(String name);
}
