package com.green.Second;

import org.springframework.stereotype.Component;

@Component("service") // BoardService service = new BoardService(); 객체명 설정하여 객체생성.
public class BoardService {
  public void bbb(){
    System.out.println("bbb 메서드 실행~");
  }
}
