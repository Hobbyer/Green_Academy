package com.green.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardDTO {
  private String title, content, writer;
  private int boardNum;
}
