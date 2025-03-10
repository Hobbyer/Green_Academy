package com.green.book_shop.admin.mapper;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
  public int insertCategory(CategoryDTO categoryDTO);

  public int updateCategory(CategoryDTO categoryDTO);

  public int deleteCategory(int cateCode);


  public int insertItem(ItemDTO itemDTO);

  public int updateItem(ItemDTO itemDTO);

  public int deleteItem(int bookCode);


  public List<UserDTO> userList();
}
