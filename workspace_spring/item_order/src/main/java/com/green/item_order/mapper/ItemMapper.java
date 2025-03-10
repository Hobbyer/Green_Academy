package com.green.item_order.mapper;

import com.green.item_order.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
  public List<ItemDTO> itemList();

  public ItemDTO itemDetail(int itemNum);

  public int insertItem(ItemDTO itemDTO);

  public int updateItem(ItemDTO itemDTO);
}
