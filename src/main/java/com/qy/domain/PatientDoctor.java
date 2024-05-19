package com.qy.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientDoctor {
    private String patientName;//患者姓名
    private String doctorName;//医生姓名
    private Date bookStartTime;//预约开始时间
    private Date bookEndTime;//预约结束时间
}
