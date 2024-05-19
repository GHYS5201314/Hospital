package com.qy.mapper;

import com.qy.domain.User;
import com.qy.domain.SystemUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface SystemUserMapper {
    public User login(SystemUser systemuser);
}
