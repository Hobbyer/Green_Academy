package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;

import java.util.List;

public interface MemberService {
  public List<MemberDTO> getMemberList();

  public List<MemberDTO> getMember(String memId);

  public int insertMember(MemberDTO memberDTO);

  public int deleteMember(String memId);

  public int updateMember(MemberDTO memberDTO);
}
