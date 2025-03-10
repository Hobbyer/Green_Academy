package com.green.item_order.service;

import com.green.item_order.dto.OrderDTO;
import com.green.item_order.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
  private final OrderMapper orderMapper;

  public OrderServiceImpl(OrderMapper orderMapper) {
    this.orderMapper = orderMapper;
  }

  @Override
  public int insertOrder(OrderDTO orderDTO) {
    return orderMapper.insertOrder(orderDTO);
  }

  @Override
  public List<OrderDTO> orderList() {
    return orderMapper.orderList();
  }

  @Override
  public int deleteOrder(int orderNum) {
    return orderMapper.deleteOrder(orderNum);
  }
}
