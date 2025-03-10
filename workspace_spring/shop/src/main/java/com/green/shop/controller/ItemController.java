package com.green.shop.controller;

import com.green.shop.dto.ItemDTO;
import com.green.shop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private final ItemService itemService;

  @Autowired
  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }

  @PostMapping("")
  public int insertItem(@RequestBody ItemDTO itemDTO){
    return itemService.insertItem(itemDTO);
  }

  @GetMapping("{itemCode}")
  public List<ItemDTO> getItem(@PathVariable("itemCode") int itemCode){
    return itemService.getItem(itemCode);
  }

  @GetMapping("")
  public List<ItemDTO> selectItemData(){
    return itemService.selectItemData();
  }

  @DeleteMapping("{itemCode}")
  public int deleteItem(@PathVariable("itemCode") int itemCode){
    return itemService.deleteItem(itemCode);
  }

  @PutMapping("{itemCode}")
  public int updateItem(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    itemDTO.setItemCode(itemCode);
    return itemService.updateItem(itemDTO);
  }
}
