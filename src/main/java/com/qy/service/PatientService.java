package com.qy.service;

import com.qy.domain.Patient;
import org.springframework.stereotype.Service;

@Service
public interface PatientService {

    Integer insert(Patient patient);
    Patient findByName(String name);
    Patient findByUsername(String username);
}
