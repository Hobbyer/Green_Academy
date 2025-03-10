package com.green.book_shop.user.service;

import com.green.book_shop.user.dto.UserDTO;
import com.green.book_shop.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
  private final UserMapper userMapper;

  @Override
  public int joinUser(UserDTO userDTO) {
    if (userMapper.getUser(userDTO.getUserId()) == null) {
      return userMapper.joinUser(userDTO);
    } else {
      return 0;
    }
  }

  @Override
  public UserDTO getUser(String userId) {
    return userMapper.getUser(userId);
  }

  @Override
  public UserDTO loginUser(UserDTO userDTO) {
      return userMapper.loginUser(userDTO);
  }
}
