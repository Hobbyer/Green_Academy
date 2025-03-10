package com.green.book_shop.user.mapper;

import com.green.book_shop.user.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
  public int joinUser(UserDTO userDTO);

  public UserDTO getUser(String userId);

  public UserDTO loginUser(UserDTO userDTO);
}
