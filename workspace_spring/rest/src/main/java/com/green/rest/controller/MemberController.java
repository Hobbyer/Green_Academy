package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import com.green.rest.dto.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

// 객체 생성 + 관제탑 역할 부여(API 통신)
@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {

  @GetMapping("")
  public void getMemberList() {
    System.out.println("getMemberList() 메서드 실행~");
  }

  @GetMapping("/{memId}")
  public void getMember(@PathVariable("memId") String id) {
    System.out.println("getMember() 메서드 실행~");
    System.out.println("id = " + id);
  }

  @PostMapping("")
  public void postMemberList(@RequestBody MemberDTO memberDTO) {
    System.out.println("postMemberList() 메서드 실행~");
    System.out.println(memberDTO.toString());
  }

  @GetMapping("/{memId}/{memAge}")
  public void getMember2(@PathVariable("memId") String memId, @PathVariable("memAge") int memAge){
    System.out.println("memId = " + memId);
    System.out.println("memAge = " + memAge);
  }

  // 회원 한 명을 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{memId}")
  public void delMemId(@PathVariable("memId") String memId){
    System.out.println("삭제할 member : " + memId);
  }
  // 회원 한 명의 이름과 나이를 변경하는 기능을 제공하는 REST API
  @PutMapping("/{memId}")
  public void putMemId(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    System.out.println("수정할 member : " + memId);
//    memberDTO.setMemName("hong");
//    memberDTO.setMemAge(32);
    System.out.println(memberDTO.toString());
  }
}
