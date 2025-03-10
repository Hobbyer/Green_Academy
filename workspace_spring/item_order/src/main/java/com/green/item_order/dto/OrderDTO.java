package com.green.item_order.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class OrderDTO {
  private int orderNum, itemNum, buyCnt, buyPrice;
  private String buyer;
  private LocalDateTime buyDate;
  private ItemDTO itemDTO;
}
