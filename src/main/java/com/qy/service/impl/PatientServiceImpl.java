package com.qy.service.impl;

import com.qy.domain.Patient;
import com.qy.mapper.PatientMapper;
import com.qy.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientMapper patientMapper;
    @Override
    public Integer insert(Patient patient) {
        Integer num=patientMapper.insert(patient);
        return num;
    }

    @Override
    public Patient findByName(String name) {
        Patient patient = patientMapper.findByName(name);
        return patient;
    }

    @Override
    public Patient findByUsername(String username) {
        return patientMapper.findByUsername(username);
    }
}
