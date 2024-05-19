package com.qy.controller;

import com.qy.domain.Doctor;
import com.qy.domain.ResponseResult;
import com.qy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @RequestMapping("/findAll")
    ResponseResult findAll(){
        List<Doctor> doctors = doctorService.findAll();
        String msg;
        if(doctors!=null){
            return new ResponseResult(200,"查找成功",doctors);
        }else{
            return new ResponseResult(300,"当前无医生信息！");
        }
    }
}
