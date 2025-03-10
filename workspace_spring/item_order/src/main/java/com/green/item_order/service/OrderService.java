package com.green.item_order.service;

import com.green.item_order.dto.OrderDTO;

import java.util.List;

public interface OrderService {
  public int insertOrder(OrderDTO orderDTO);

  public List<OrderDTO> orderList();

  public int deleteOrder(int orderNum);
}
