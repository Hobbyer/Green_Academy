package com.green.shop2.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemCode, itemPrice;
  private String itemName, itemIntro;
  private Timestamp regDate;
}
