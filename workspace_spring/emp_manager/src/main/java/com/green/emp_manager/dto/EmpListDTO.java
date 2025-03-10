package com.green.emp_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@ToString
public class EmpListDTO {
  private int deptNo, jobNo, empNo;
  private String deptName, jobName, empName, gender;
  private LocalDateTime hireDate;
}
