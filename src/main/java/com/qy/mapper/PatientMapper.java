package com.qy.mapper;


import com.qy.domain.DoctorSchedule;
import com.qy.domain.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Mapper
@Repository
public interface PatientMapper {
    Integer insert(Patient patient);
    Patient findByName(String name);
    void updatePatient(Patient patient);
    void insertpatientdoctor(String patientname, String doctorName, Date bookStartTime,String bookEndTime);

    Patient findByUsername(String username);
}
