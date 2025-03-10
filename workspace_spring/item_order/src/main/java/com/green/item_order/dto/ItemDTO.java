package com.green.item_order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ItemDTO {
  private int itemNum, itemPrice;
  private String itemName, seller, itemIntro;
  private LocalDateTime regDate;
}
