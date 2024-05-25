package com.qy.controller;

import com.qy.domain.*;
import com.qy.service.DoctorService;
import com.qy.service.PatientService;
import com.qy.service.SystemUserService;
import com.qy.service.UserService;
import com.qy.utils.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("/sys_user")
public class SystemUserController {
    Map<String,Object> map=new HashMap<>();

    @Autowired
    private SystemUserService systemUserService;
    @Autowired
    private DoctorService doctorService;
    @Autowired
    private UserService userService;
    @Autowired
    private PatientService patientService;
    @PostMapping("/login")
    public ResponseResult login(@RequestBody SystemUser systemuser){
        System.out.println("login");
        Map<String,Object> map=new HashMap<>();
        User loginuser = systemUserService.login(systemuser);
        String name;
        if(loginuser!=null){
            String token = JwtUtil.createJWT(UUID.randomUUID().toString(), loginuser.getUsername(), null);
            name=loginuser.getName();
            map.put("token",token);
            map.put("name",name);
        }else{
            return new ResponseResult(300,"用户名或密码或身份错误，请重新登录！");
        }
        if(loginuser.getRole().compareTo("doctor")==0){
            return new ResponseResult(100,"登录成功！",map);
        }
        else{
            return new ResponseResult(200,"登录成功！",map);
        }
    }
    @PostMapping("/doctor1Enroll")
    public ResponseResult doctor1enroll(@RequestBody Doctor doctor){
        Doctor doctor2 = doctorService.findByName(doctor.getName());
        User user = userService.findbyusername(doctor.getUsername());
        if(doctor2!=null||user!=null){
            return new ResponseResult(300,"该账号已注册！");
        }
        doctorService.doctor1Enroll(doctor);
        userService.insert(doctor.getUsername(),doctor.getPassword(),"doctor",doctor.getName());
        doctorService.addproperties(doctor.getName());
        return new ResponseResult(200,"注册成功！",doctor2);
    }
    @PostMapping("/patientEnroll")
    public ResponseResult patientEnroll(@RequestBody Patient patient){
        Patient patient2 = patientService.findByName(patient.getName());
        User user = userService.findbyusername(patient.getUsername());
        if(patient2!=null||user!=null){
            return new ResponseResult(300,"该账号已注册");
        }
        patientService.insert(patient);
        userService.insert(patient.getUsername(),patient.getPassword(),"patient",patient.getName());
        return new ResponseResult(200,"注册成功！",patient);
    }
}