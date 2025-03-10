package com.green.book_shop.user.dto;

import com.green.book_shop.item.dto.ItemDTO;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@ToString
public class UserDTO {
  private String userId, userPw, userName, userEmail, userTel, userRoll, isUsing;
  private LocalDateTime joinDate;
}
