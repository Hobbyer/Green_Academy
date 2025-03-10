package com.green.book_shop.item.service;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.item.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
  private final ItemMapper itemMapper;

  @Override
  public List<ItemDTO> allItemList() {
    return itemMapper.allItemList();
  }

  @Override
  public List<CategoryDTO> cateList() {
    return itemMapper.cateList();
  }

  @Override
  public List<ItemDTO> cateItemList(int cateCode) {
    return itemMapper.cateItemList(cateCode);
  }

  @Override
  public ItemDTO getItem(ItemDTO itemDTO) {
    return itemMapper.getItem(itemDTO);
  }
}
