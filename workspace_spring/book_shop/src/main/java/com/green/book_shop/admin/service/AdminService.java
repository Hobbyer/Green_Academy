package com.green.book_shop.admin.service;

import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.user.dto.UserDTO;

import java.util.List;

public interface AdminService {
  public int insertCategory(CategoryDTO categoryDTO);

  public int updateCategory(CategoryDTO categoryDTO);

  public int deleteCategory(int cateCode);


  public int insertItem(ItemDTO itemDTO);

  public int updateItem(ItemDTO itemDTO);

  public int deleteItem(int bookCode);


  public List<UserDTO> userList();
}
