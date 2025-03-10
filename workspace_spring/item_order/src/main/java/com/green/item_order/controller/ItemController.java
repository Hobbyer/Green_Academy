package com.green.item_order.controller;

import com.green.item_order.dto.ItemDTO;
import com.green.item_order.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private final ItemService itemService;

  public ItemController(ItemService itemService) {
    this.itemService = itemService;
  }

  @GetMapping("")
  public List<ItemDTO> itemList(){
    return itemService.itemList();
  }

  @GetMapping("/{itemNum}")
  public ItemDTO itemDetail(@PathVariable("itemNum") int itemNum){
    return itemService.itemDetail(itemNum);
  }

  @PostMapping("")
  public int insertItem(@RequestBody ItemDTO itemDTO){
    return itemService.insertItem(itemDTO);
  }

  @PutMapping("/{itemNum}")
  public int updateItem(@PathVariable("itemNum") int itemNum, @RequestBody ItemDTO itemDTO) {
    itemDTO.setItemNum(itemNum);
    return itemService.updateItem(itemDTO);
  }
}
