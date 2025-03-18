package com.green.alone_security.repository;

import com.green.alone_security.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, String> {

  UserEntity findByUserId(String userId);
}
