package com.green.member_manager.controller;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/members")
public class MemberController {
  private final MemberService memberService;

  public MemberController(MemberService memberService) {
    this.memberService = memberService;
  }

  @GetMapping("")
  public List<MemberDTO> getMemberList(){
    return memberService.getMemberList();
  }

  @GetMapping("/detail/{memId}")
  public List<MemberDTO> getMember(@PathVariable("memId") String memId){
    return memberService.getMember(memId);
  }

  @PostMapping("")
  public int insertMember(@RequestBody MemberDTO memberDTO){
    return memberService.insertMember(memberDTO);
  }

  @DeleteMapping("/{memId}")
  public int deleteMember(@PathVariable("memId") String memId){
    return memberService.deleteMember(memId);
  }

  @PutMapping("/detail/{memId}")
  public int updateMember(@PathVariable("memId") String memId, @RequestBody MemberDTO memberDTO){
    memberDTO.setMemId(memId);
    return memberService.updateMember(memberDTO);
  }
}
