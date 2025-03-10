package com.green.book_shop.item.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int bookCode, bookPrice, bookStock, cateCode;
  private String bookName, publisher, bookInfo;
  private LocalDateTime regDate;
}
