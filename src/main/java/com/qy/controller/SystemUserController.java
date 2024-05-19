package com.qy.controller;

import com.qy.domain.Doctor;
import com.qy.domain.ResponseResult;
import com.qy.domain.SystemUser;
import com.qy.domain.User;
import com.qy.service.DoctorService;
import com.qy.service.SystemUserService;
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
    @PostMapping("/login")
    public ResponseResult login(@RequestBody SystemUser systemuser){
        System.out.println("login");
        Map<String,Object> map=new HashMap<>();
        User loginuser = systemUserService.login(systemuser);
        if(loginuser!=null){
            String token = JwtUtil.createJWT(UUID.randomUUID().toString(), loginuser.getUsername(), null);
            map.put("token",token);
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
    public ResponseResult doctor1enroll(@RequestBody Doctor doctor,@RequestBody String username,@RequestBody String password){
        System.out.println("enroll");
        Integer num = systemUserService.doctor1Enroll(doctor);
        if(num==0){
            return new ResponseResult(300,"该账号已注册！");
        }
        Doctor doctor2 = doctorService.findByName(doctor.getName());

        return new ResponseResult(200,"注册成功！",doctor2);
    }
}