package com.green.book_shop.admin.controller;

import com.green.book_shop.admin.service.AdminService;
import com.green.book_shop.item.dto.CategoryDTO;
import com.green.book_shop.item.dto.ItemDTO;
import com.green.book_shop.user.dto.UserDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admins")
@RequiredArgsConstructor
public class AdminController {
  private final AdminService adminService;

  @PostMapping("/category")
  public int insertCategory(@RequestBody CategoryDTO categoryDTO){
    return adminService.insertCategory(categoryDTO);
  }

  @PutMapping("/category/{cateCode}")
  public int updateCategory(@PathVariable("cateCode") int cateCode, @RequestBody CategoryDTO categoryDTO) {
    categoryDTO.setCateCode(cateCode);
    return adminService.updateCategory(categoryDTO);
  }

  @DeleteMapping("/category/{cateCode}")
  public int deleteCategory(@PathVariable("cateCode") int cateCode){
    return adminService.deleteCategory(cateCode);
  }

  @PostMapping("/item")
  public int insertItem(@RequestBody ItemDTO itemDTO){
    return adminService.insertItem(itemDTO);
  }

  @PutMapping("/item/{bookCode}")
  public int updateItem(@RequestBody ItemDTO itemDTO) {
    return adminService.updateItem(itemDTO);
  }

  @DeleteMapping("/item/{bookCode}")
  public int deleteItem(@PathVariable("bookCode") int bookCode){
    return adminService.deleteItem(bookCode);
  }


  @GetMapping("/users")
  public List<UserDTO> userList(){
    return adminService.userList();
  }
}