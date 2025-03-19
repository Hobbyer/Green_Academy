package com.green.book_shop.test;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/test")
public class TestController {
  @GetMapping("/1")
  public int test1(){
    return 5;
  }

  // 첨부파일 연습1
  @PostMapping("/upload1")
  // @RequestParam: 요청 파라미터를 전달받을 수 있는 어노테이션
  // MultipartFile: 첨부파일을 전달받을 수 있는 객체
  public String upload1(@RequestParam("firstFile") MultipartFile file) throws IOException {
    // 파일 처리 로직
    System.out.println(file.getOriginalFilename());

    // 내 컴퓨터에 저장
    String uploadPath = "E:\\Study\\Green_Academy\\WorkSpace\\workspace_spring\\book_shop\\src\\main\\resources\\upload\\"; // 파일 저장 경로
    String fileName = file.getOriginalFilename(); // 파일 이름
    file.transferTo(new File(uploadPath +fileName)); // 파일 저장

    return file.getOriginalFilename();
  }
}
