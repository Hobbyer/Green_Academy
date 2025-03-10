package com.green.shop.mapper;

import com.green.shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {
  // 아이템 등록 [쿼리 실행]
  public int insertItem(ItemDTO itemDTO);

  // 하나의 아이템 조회 [쿼리 실행]
  public List<ItemDTO> getItem(int itemCode);

  // 하나의 아이템 일부 내용 조회 [쿼리 실행]
  public List<ItemDTO> selectItemData();

  // 하나의 아이템 삭제 [쿼리 실행]
  public int deleteItem(int itemCode);

  // 특정 아이템 수정 [쿼리 실행]
  public int updateItem(ItemDTO itemDTO);
}
