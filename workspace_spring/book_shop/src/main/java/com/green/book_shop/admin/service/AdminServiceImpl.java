package com.green.book_shop.admin.service;

import com.green.book_shop.admin.mapper.AdminMapper;
import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.user.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
  private final AdminMapper adminMapper;

  @Override
  public int insertCategory(CategoryDTO categoryDTO) {

    return adminMapper.insertCategory(categoryDTO);
  }

  @Override
  public int updateCategory(CategoryDTO categoryDTO) {
    return adminMapper.updateCategory(categoryDTO);
  }

  @Override
  public int deleteCategory(int cateCode) {
    return adminMapper.deleteCategory(cateCode);
  }


  @Override
  public int insertItem(ItemDTO itemDTO) {
    return adminMapper.insertItem(itemDTO);
  }

  @Override
  public int updateItem(ItemDTO itemDTO) {
    return adminMapper.updateItem(itemDTO);
  }

  @Override
  public int deleteItem(int bookCode) {
    return adminMapper.deleteItem(bookCode);
  }

  @Override
  public List<UserDTO> userList() {
    return adminMapper.userList();
  }
}
