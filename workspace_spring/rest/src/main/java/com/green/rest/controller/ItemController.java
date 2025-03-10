package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/items")
public class ItemController {
  //1. 모든 상품을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public void getItemLIst(){
    log.info("모든 상품의 리스트를 조회");
  }
  @GetMapping("/{itemCode}")
  //2. 상품 하나를 조회하는 기능을 제공하는 REST API
  public void getItem(@PathVariable("itemCode") int itemCode){
    log.info("itemCode : " + itemCode);
  }
  //3. 상품 하나를 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void postItem(@RequestBody ItemDTO itemDTO){
    log.info("item : " + itemDTO);
  }
  //4. 상품 하나를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{itemCode}")
  public void delItem(@PathVariable("itemCode") int itemCode){
    log.info("삭제할 item : " + itemCode);
  }
  //5. 상품 하나의 상품명과 가격, 색상을 변경하는 기능 제공 REST API
  @PutMapping("/{itemCode}")
  public void updateItem(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("수정할 item : " + itemCode);
    log.info("수정 내용 : " + itemDTO);
  }
}
