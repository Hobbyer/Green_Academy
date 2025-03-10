package com.green.member_manager.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Setter
@Getter
@ToString
public class MemberDTO {
  private String memId, memName, memPw, memTel, memIntro;
  private Timestamp joinDate;
}
