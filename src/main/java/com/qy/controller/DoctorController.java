package com.qy.controller;

import com.qy.domain.Doctor;
import com.qy.domain.DoctorProperties;
import com.qy.domain.ResponseResult;
import com.qy.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    @RequestMapping("findAll2")
    ResponseResult findAll2(){
        List<DoctorProperties>doctorProperties=doctorService.findAll2();
        String msg;
        if(doctorProperties!=null){
            return new ResponseResult(200,"查找成功",doctorProperties);
        }else{
            return new ResponseResult(300,"当前无医生信息！");
        }
    }
    @RequestMapping("/update")
    ResponseResult update(@RequestBody DoctorProperties doctorProperties){
        doctorService.update(doctorProperties);
        return new ResponseResult(200,"更新成功！");
    }
}
