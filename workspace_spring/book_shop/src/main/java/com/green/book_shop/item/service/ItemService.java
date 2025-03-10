package com.green.book_shop.item.service;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;

import java.util.List;

public interface ItemService {
  public List<ItemDTO> allItemList();

  public List<CategoryDTO> cateList();

  public List<ItemDTO> cateItemList(int cateCode);

  public ItemDTO getItem(ItemDTO itemDTO);
}
