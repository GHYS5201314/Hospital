package com.qy.domain;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DoctorProperties {
    private String doctorName; //医生姓名
    private String registerdName;//挂号名称
    private int cost;//挂号费用
    private Date DateStartTime;//预计看诊开始时间
    private Date DateEndTime;//预计看诊结束时间
}
