package com.green.rest_test.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int itemCode, itemPrice, itemCnt;
  private String itemName, orderUserId;

  public OrderDTO(){

  }

  public OrderDTO(int itemCode, int itemPrice, int itemCnt, String itemName, String orderUserId) {
    this.itemCode = itemCode;
    this.itemPrice = itemPrice;
    this.itemCnt = itemCnt;
    this.itemName = itemName;
    this.orderUserId = orderUserId;
  }
}
