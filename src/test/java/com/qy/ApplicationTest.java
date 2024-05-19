package com.qy;

import com.qy.domain.Doctor;
import com.qy.mapper.DoctorMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class ApplicationTest {

    @Autowired
    private DoctorMapper doctorMapper;

    @Test
    public void testMapper(){
        List<Doctor> doctors = doctorMapper.findAll();
        System.out.println(doctors);
    }
    @Test
    public void testMapper2(){
        Doctor doctor=doctorMapper.findByName("张三");
        System.out.println(doctor);
    }
}
