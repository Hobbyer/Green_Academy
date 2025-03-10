package com.green.shop.service;

import com.green.shop.dto.ItemDTO;
import com.green.shop.mapper.ItemMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {
  private final ItemMapper itemMapper;

//  @Autowired
  public ItemServiceImpl(ItemMapper itemMapper) {
    this.itemMapper = itemMapper;
  }


  @Override
  public int insertItem(ItemDTO itemDTO) {
    return itemMapper.insertItem(itemDTO);
  }

  @Override
  public List<ItemDTO> getItem(int itemCode) {
    return itemMapper.getItem(itemCode);
  }

  @Override
  public List<ItemDTO> selectItemData() {
    return itemMapper.selectItemData();
  }

  @Override
  public int deleteItem(int itemCode) {
    return itemMapper.deleteItem(itemCode);
  }

  @Override
  public int updateItem(ItemDTO itemDTO) {
    return itemMapper.updateItem(itemDTO);
  }
}
