package com.qy.controller;

import com.qy.domain.ResponseResult;
import com.qy.domain.User;
import com.qy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;
    @RequestMapping("findAll")
    public ResponseResult findAll(){
        List<User> users=userService.findAll();
        System.out.println("findAll");
        return new ResponseResult(200,users);
    }
    @PostMapping("/updata")
    public ResponseResult updata(@RequestBody User user){
        userService.updata(user);
        System.out.println("updata");
        return new ResponseResult(200,"修改成功！");
    }
}
