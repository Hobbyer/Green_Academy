package com.green.alone_security.controller;

import com.green.alone_security.entity.UserEntity;
import com.green.alone_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private BCryptPasswordEncoder bCryptPasswordEncoder;

  @GetMapping({"", "/"})
  public String index() {

    return "index";
  }

  @PostMapping("/join")
  public String join(UserEntity user) {
    String rawPassword = user.getUserPw();
    String encPassword = bCryptPasswordEncoder.encode(rawPassword);
    user.setUserPw(encPassword);

    userRepository.save(user);

    return "redirect:/login";
  }
}
