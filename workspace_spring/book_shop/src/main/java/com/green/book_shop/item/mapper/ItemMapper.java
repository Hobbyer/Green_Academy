package com.green.book_shop.item.mapper;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
  public List<ItemDTO> allItemList();

  public List<CategoryDTO> cateList();

  public List<ItemDTO> cateItemList(int cateCode);

  public ItemDTO getItem(ItemDTO itemDTO);
}
