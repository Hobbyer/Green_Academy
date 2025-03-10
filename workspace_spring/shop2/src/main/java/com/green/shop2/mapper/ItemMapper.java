package com.green.shop2.mapper;

import com.green.shop2.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
  // 아이템 리스트 조회
  public List<ItemDTO> itemList();

  // 특정 아이템 조회
  public List<ItemDTO> getItem();

  // 아이템 등록
  public int insertItem(ItemDTO itemDTO);
}
