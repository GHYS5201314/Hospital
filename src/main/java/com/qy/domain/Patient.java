package com.qy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private String name;//患者姓名
    private Integer age;//年龄
    private String sex;//性别
    private Integer numberTime;//失约次数
}
