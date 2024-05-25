package com.qy.service;

import com.qy.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    Integer insert(Patient patient);
    Patient findByName(String name);
    void updatePatient(Patient patient);

    Patient findByUsername(String username);
}
