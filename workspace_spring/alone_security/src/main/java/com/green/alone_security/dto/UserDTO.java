package com.green.alone_security.dto;

import com.green.alone_security.entity.UserEntity;
import lombok.Data;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.sql.Timestamp;

@Data
public class UserDTO {
  private String userId, userPw, userName, userEmail, userTel, userRole, isUsing;
  private Timestamp joinDate;

  private UserEntity userEntity(PasswordEncoder passwordEncoder) {
    UserEntity user = new UserEntity();
    user.setUserId(userId);
    user.setUserPw(passwordEncoder.encode(userPw));
    user.setUserName(userName);
    user.setUserEmail(userEmail);
    user.setUserTel(userTel);

    return user;
  }
}
