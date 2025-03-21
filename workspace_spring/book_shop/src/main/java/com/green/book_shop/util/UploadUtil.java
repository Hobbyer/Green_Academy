package com.green.book_shop.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

// 첨부파일 업로드를 위한 클래스
public class UploadUtil {
  // application.properties 파일에 설정된 경로를 가져오기 위한 어노테이션
  @Value("${file.upload.path}")
  private String uploadPath;

  // 단일 파일 업로드
  public String fileUpload(MultipartFile file) throws IOException {
    if (file == null) {
      return "파일이 없습니다.";
    } else {
      // 첨부파일 원본 이름
      String fileName = file.getOriginalFilename();

      // 확장자 제외한 원본 파일 이름만 추출
      String attachedFileName = Objects.requireNonNull(fileName).substring(0, fileName.lastIndexOf("."));

      // 확장자 추출
      // Objects.requireNonNull: null이 아닌 경우에만 실행
      // substring(a.lastIndexOf(".")): a 문자열에서 마지막 .의 위치부터 끝까지 추출
      String ext = Objects.requireNonNull(fileName).substring(fileName.lastIndexOf("."));

      // 첨부할 파일 이름
      String uuid = UUID.randomUUID().toString();
      String saveFileName = attachedFileName + "_" + uuid + ext;

      // 파일 저장 경로
      file.transferTo(new File(uploadPath + saveFileName)); // 파일 저장

      return file.getOriginalFilename();
    }
  }

  public String multipartFileUpload(MultipartFile[] files) throws IOException {
    if (files == null) {
      return "파일이 없습니다.";
    } else {
      for (MultipartFile file : files) {
        // 첨부파일 원본 이름
        String fileName = file.getOriginalFilename();

        // 확장자 제외한 원본 파일 이름만 추출
        String attachedFileName = Objects.requireNonNull(fileName).substring(0, fileName.lastIndexOf("."));

        // 확장자 추출
        // Objects.requireNonNull: null이 아닌 경우에만 실행
        // substring(a.lastIndexOf(".")): a 문자열에서 마지막 .의 위치부터 끝까지 추출
        String ext = Objects.requireNonNull(fileName).substring(fileName.lastIndexOf("."));

        // 첨부할 파일 이름
        String uuid = UUID.randomUUID().toString();
        String saveFileName = attachedFileName + "_" + uuid + ext;

        // 파일 저장 경로
        file.transferTo(new File(uploadPath + saveFileName)); // 파일 저장
      }
      return "파일저장 완료";
    }
  }
}
