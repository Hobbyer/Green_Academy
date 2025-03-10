package com.green.book_shop.user.controller;

import com.green.book_shop.user.dto.UserDTO;
import com.green.book_shop.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
  private final UserService userService;

  @GetMapping("/{userId}")
  public UserDTO getUser(@PathVariable String userId) {
    return userService.getUser(userId);
  }

  @PostMapping("/login")
  public UserDTO loginUser(@RequestBody UserDTO userDTO) {
    return userService.loginUser(userDTO);
  }

  @PostMapping("")
  public int joinUser(@RequestBody UserDTO userDTO){
    return userService.joinUser(userDTO);
  }
}
