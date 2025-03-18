package com.green.book_shop.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/test")
public class TestController {
  @GetMapping("/1")
  public int test1(){
    return 5;
  }

  // 첨부파일 연습1
  @PostMapping("/upload1")
  public String upload1(@RequestParam("firstFile")MultipartFile file){
    // 파일 처리 로직
    System.out.println(file.getOriginalFilename());
    return file.getOriginalFilename();
  }
}
