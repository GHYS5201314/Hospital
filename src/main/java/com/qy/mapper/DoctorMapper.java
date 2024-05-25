package com.qy.mapper;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import com.qy.domain.DoctorSchedule;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.print.Doc;
import java.util.List;
import java.util.Properties;

@Mapper
@Repository
public interface DoctorMapper {
    List<Doctor> findAll();
    Doctor findByName(String name);
    Integer doctor1Enroll(Doctor doctor);
    void update(DoctorProperties doctorProperties);
    void addproperties(String name);

    List<DoctorProperties> findAll2();
    Properties getProperties(String name);
    Doctor findByUsername(String username);
    void addSchedule(DoctorSchedule doctorSchedule);
    void deleteSchedule(DoctorSchedule doctorSchedule);
    List<DoctorSchedule> findAllSchedule();
    void updateschedule(DoctorSchedule doctorSchedule);
    DoctorSchedule findDoctorScheduleByNameAndKind(String name,String kind);
    void updateDoctorStatus(String status,String name);
}
