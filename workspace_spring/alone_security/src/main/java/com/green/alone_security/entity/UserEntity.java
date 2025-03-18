package com.green.alone_security.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;

import java.sql.Timestamp;

@DynamicInsert
@Entity(name="security_shop_user")
@Data
public class UserEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "USER_ID")
  private String userId;

  @Column(name = "USER_PW", nullable = false)
  private String userPw;
  @Column(name = "USER_NAME", nullable = false)
  private String userName;
  @Column(name = "USER_EMAIL", nullable = false, unique = true)
  private String userEmail;
  @Column(name = "USER_TEL", nullable = false, unique = true)
  private String userTel;
  @Column(name = "USER_ROLE")
  @ColumnDefault("'ROLE_USER'")
  private String userRole;
  @Column(name = "IS_USING")
  @ColumnDefault("'Y'")
  private String isUsing;
  @Column(name = "JOIN_DATE")
  private Timestamp joinDate;
}
