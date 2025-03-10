package com.green.item_order.mapper;

import com.green.item_order.dto.OrderDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.ResultMap;

import java.util.List;

@Mapper
public interface OrderMapper {
  public int insertOrder(OrderDTO orderDTO);

  public List<OrderDTO> orderList();

  public int deleteOrder(int orderNum);
}
