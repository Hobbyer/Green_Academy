package com.green.emp_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class SearchDTO {
  private String id, content, gender, startDate, lastDate;
}
