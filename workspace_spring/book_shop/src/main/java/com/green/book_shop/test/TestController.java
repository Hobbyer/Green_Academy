package com.green.book_shop.test;

import com.green.book_shop.util.UploadUtil;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

@RestController
@RequestMapping("/test")
public class TestController {
  @GetMapping("/1")
  public int test1() {
    return 5;
  }

  // 첨부파일 연습1
  @PostMapping("/upload1")
  // @RequestParam: 요청 파라미터를 전달받을 수 있는 어노테이션
  // MultipartFile: 첨부파일을 전달받을 수 있는 객체
  public String upload1(@RequestParam(name = "firstFile", required = false) MultipartFile file) throws IOException {

    // 파일 처리 로직
    UploadUtil uploadUtil = new UploadUtil();
    return uploadUtil.fileUpload(file);

  }

  @PostMapping("/upload2")
  // @RequestParam: 요청 파라미터를 전달받을 수 있는 어노테이션
  // MultipartFile: 첨부파일을 전달받을 수 있는 객체
  public String upload2(@RequestParam(name = "secondFiles", required = false) MultipartFile[] files) throws IOException {
    UploadUtil uploadUtil = new UploadUtil();
    return uploadUtil.multipartFileUpload(files);
  }
}
