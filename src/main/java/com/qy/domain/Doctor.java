package com.qy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Doctor {
    private String name;//医生姓名
    private Integer age;//年龄
    private String sex;//性别
    private String department;//科室
    private String direction;//擅长方向
    private String position;//职位
    private String status;//挂号状态
    private String username;//账号
    private String password;//密码
}
