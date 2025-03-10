package com.green.book_shop.user.service;

import com.green.book_shop.user.dto.UserDTO;

public interface UserService {
  public int joinUser(UserDTO userDTO);

  public UserDTO getUser(String userId);

  public UserDTO loginUser(UserDTO userDTO);
}
