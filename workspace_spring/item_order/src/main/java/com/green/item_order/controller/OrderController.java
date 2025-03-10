package com.green.item_order.controller;

import com.green.item_order.dto.OrderDTO;
import com.green.item_order.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {
  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @GetMapping("")
  public List<OrderDTO> orderList(){
    return orderService.orderList();
  }

  @PostMapping("")
  public int insertOrder(@RequestBody OrderDTO orderDTO){
    return orderService.insertOrder(orderDTO);
  }

  @DeleteMapping("/{orderNum}")
  public int deleteOrder(@PathVariable("orderNum") int orderNum){
    return orderService.deleteOrder(orderNum);
  }
}
