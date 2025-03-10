package com.green.Second;

import org.springframework.stereotype.Component;

@Component // MemberService memberService = new MemberService(); 객체 생성.
public class MemberService {
  public void aaa(){
    System.out.println("aaa 메서드 실행~");
  }
}