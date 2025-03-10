package com.green.alone_security.service;

import com.green.alone_security.dto.UserDTO;
import com.green.alone_security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SignUpService {
  private final BCryptPasswordEncoder encoder;
  private final UserRepository userRepository;
  @Transactional
  public void signUp(UserDTO userDTO) throws Exception {

  }
}
