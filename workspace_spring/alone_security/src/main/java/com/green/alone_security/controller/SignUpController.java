package com.green.alone_security.controller;

import com.green.alone_security.dto.UserDTO;
import com.green.alone_security.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SignUpController {
  private final SignUpService signUpService;

  @PostMapping("/signup")
  @CrossOrigin(origins = "http://localhost:3000")
  public ResponseEntity<String> saveUser(@RequestBody UserDTO userDTO){
    try {

    }
  }
}
