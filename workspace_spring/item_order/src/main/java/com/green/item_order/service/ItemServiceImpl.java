package com.green.item_order.service;

import com.green.item_order.dto.ItemDTO;
import com.green.item_order.mapper.ItemMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
  private final ItemMapper itemMapper;

  public ItemServiceImpl(ItemMapper itemMapper) {
    this.itemMapper = itemMapper;
  }

  @Override
  public List<ItemDTO> itemList() {
    return itemMapper.itemList();
  }

  @Override
  public ItemDTO itemDetail(int itemNum) {
    return itemMapper.itemDetail(itemNum);
  }

  @Override
  public int insertItem(ItemDTO itemDTO) {
    return itemMapper.insertItem(itemDTO);
  }

  @Override
  public int updateItem(ItemDTO itemDTO) {
    return itemMapper.updateItem(itemDTO);
  }
}
