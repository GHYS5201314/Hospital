package com.qy.mapper;

import com.qy.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> findAll();
    void updata(User user);
    User findByName(String username);
    void insert(String username,String password,String role,String name);
}
