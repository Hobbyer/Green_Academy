package com.green.book_shop.item.controller;

import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
@RequiredArgsConstructor
public class ItemController {
  private final ItemService itemService;

  @GetMapping("")
  public List<ItemDTO> allItemList(){
    return itemService.allItemList();
  }

  @GetMapping("/{cateCode}")
  public List<ItemDTO> cateItemList(@PathVariable("cateCode") int cateCode){
    return itemService.cateItemList(cateCode);
  }

  @GetMapping("/{cateCode}/{itemNum}")
  public ItemDTO getItem(@PathVariable("cateCode") int cateCode, @PathVariable("itemNum") int itemNum, ItemDTO itemDTO) {
    itemDTO.setCateCode(cateCode);
    itemDTO.setBookCode(itemNum);
    return itemService.getItem(itemDTO);
  }
}
