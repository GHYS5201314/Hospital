package com.qy.service;

import com.qy.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    public Integer insert(Patient patient);
    public Patient findByName(String name);
}
