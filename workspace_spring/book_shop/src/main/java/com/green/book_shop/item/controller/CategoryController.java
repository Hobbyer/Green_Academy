package com.green.book_shop.item.controller;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
public class CategoryController {
  private final ItemService itemService;

  @GetMapping("")
  public List<CategoryDTO> cateList() {
    return itemService.cateList();
  }
}
