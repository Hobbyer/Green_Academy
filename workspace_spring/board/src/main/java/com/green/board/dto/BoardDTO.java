package com.green.board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class BoardDTO {
  private int boardNum, readCnt;
  private String title, writer, content;
  private LocalDateTime regDate;
}
