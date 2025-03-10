package com.green.basic_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class BoardDTO {
  private int boardNum, readCnt;
  private String title, writer, content;
  private Timestamp createDate;
}