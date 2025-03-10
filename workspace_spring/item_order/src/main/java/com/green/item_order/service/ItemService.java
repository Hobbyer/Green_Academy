package com.green.item_order.service;

import com.green.item_order.dto.ItemDTO;

import java.util.List;

public interface ItemService {
  public List<ItemDTO> itemList();

  public ItemDTO itemDetail(int itemNum);

  public int insertItem(ItemDTO itemDTO);

  public int updateItem(ItemDTO itemDTO);
}
