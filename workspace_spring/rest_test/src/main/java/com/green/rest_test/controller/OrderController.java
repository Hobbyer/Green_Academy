package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrderController {
  //1. 모든 상품을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public List<OrderDTO> getItemLIst(){
    OrderDTO o1 = new OrderDTO(101, 3000, 5, "아메리카노", "aaa");
    OrderDTO o2 = new OrderDTO(102, 2000, 2, "우유", "bbb");
    OrderDTO o3 = new OrderDTO(103, 1500, 3, "콜라", "ccc");
    OrderDTO o4 = new OrderDTO(104, 1500, 8, "사이다", "ddd");
    OrderDTO o5 = new OrderDTO(105, 1000, 5, "물", "eee");

    List<OrderDTO> orderList = new ArrayList<>();
    orderList.add(o1);
    orderList.add(o2);
    orderList.add(o3);
    orderList.add(o4);
    orderList.add(o5);

    return orderList;
  }
  @GetMapping("/{itemCode}")
  //2. 하나의 주문정보를 조회하는 기능을 제공하는 REST API
  public void getItem(@PathVariable("itemCode") int itemCode){
    log.info("itemCode : " + itemCode);
  }
  //3. 하나의 주문정보를 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void postItem(@RequestBody OrderDTO orderDTO){
    log.info("item : " + orderDTO);
  }
  //4. 하나의 주문정보를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{itemCode}")
  public void delItem(@PathVariable("itemCode") int itemCode){
    log.info("삭제할 item : " + itemCode);
  }
  //5. 하나의 주문정보에서 상품명과 상품가격을 수정하는 기능 제공 REST API
  @PutMapping("/{itemCode}")
  public void updateItem(@PathVariable("itemCode") int itemCode, @RequestBody OrderDTO orderDTO){
    log.info("수정할 item : " + itemCode);
    log.info("수정 내용 : " + orderDTO);
  }
}
