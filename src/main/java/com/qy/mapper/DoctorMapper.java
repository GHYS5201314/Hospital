package com.qy.mapper;

import com.qy.domain.Doctor;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface DoctorMapper {
    List<Doctor> findAll();
    Doctor findByName(String name);
    Integer doctor1Enroll(Doctor doctor);
}
