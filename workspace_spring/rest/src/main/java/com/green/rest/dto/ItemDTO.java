package com.green.rest.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemCode, itemPrice;
  private String itemName, itemColor;
}
