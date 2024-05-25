package com.qy.mapper;


import com.qy.domain.Patient;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface PatientMapper {
    Integer insert(Patient patient);
    Patient findByName(String name);
    Patient findByUsername(String username);
}
