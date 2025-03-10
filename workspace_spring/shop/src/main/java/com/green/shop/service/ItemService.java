package com.green.shop.service;

import com.green.shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {
  // 아이템 등록 [기능]
  public int insertItem(ItemDTO itemDTO);

  // 하나의 아이템 조회 [기능]
  public List<ItemDTO> getItem(int itemCode);

  // 아이템 리스트 조회 [기능]
  public List<ItemDTO> selectItemData();

  // 하나의 아이템 삭제 [기능]
  public int deleteItem(int itemCode);

  // 특정 아이템 수정 [기능]
  public int updateItem(ItemDTO itemDTO);
}
