package com.qy.mapper;

import com.qy.domain.DoctorSchedule;
import com.qy.domain.User;
import com.qy.domain.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Mapper
@Repository
public interface SystemUserMapper {
    public User login(SystemUser systemuser);
    void insertbook(String name, Date bookStartTime,Date bookEndTime,String username,String status);

    List<DoctorSchedule> findAllSchedule(String username);
}
