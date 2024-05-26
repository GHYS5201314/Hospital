package com.qy.controller;

import com.qy.domain.DoctorSchedule;
import com.qy.domain.Patient;
import com.qy.domain.ResponseResult;
import com.qy.service.DoctorService;
import com.qy.service.PatientService;
import com.qy.service.SystemUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/patient")
public class PatientController {


    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    @Autowired
    private SystemUserService systemUserService;

    @PostMapping("/book")
    public ResponseResult Book(@RequestBody Map<String,Object> map){
        Patient patient= (Patient) map.get("patient");
        DoctorSchedule doctorSchedule= (DoctorSchedule) map.get("doctorSchedule");
        patient.setNumberTime(patient.getNumberTime()+1);
        patientService.updatePatient(patient);
        doctorService.updateDoctorStatus("已预约",doctorSchedule.getName());
        systemUserService.insertbook(patient,doctorSchedule);
        return new ResponseResult(200,"预约成功！");
    }

    List<DoctorSchedule> findAllSchedule(@RequestBody String name)
    {
        Patient patient = patientService.findByName(name);
        return systemUserService.findAllSchedule(patient.getUsername());
    }

}
