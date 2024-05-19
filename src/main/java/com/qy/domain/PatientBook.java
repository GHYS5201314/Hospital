package com.qy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientBook {
    private String name;//患者姓名
    private Date bookStartTime;//历史预约开始时间
    private Date bookEndTime;//历史预约结束时间
}
