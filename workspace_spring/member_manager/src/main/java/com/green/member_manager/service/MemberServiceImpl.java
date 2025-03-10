package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
  private final MemberMapper memberMapper;

  public MemberServiceImpl(MemberMapper memberMapper) {
    this.memberMapper = memberMapper;
  }

  public List<MemberDTO> getMemberList(){
    return memberMapper.getMemberList();
  }

  @Override
  public List<MemberDTO> getMember(String memId) {
    return memberMapper.getMember(memId);
  }

  @Override
  public int insertMember(MemberDTO memberDTO) {
    return memberMapper.insertMember(memberDTO);
  }

  @Override
  public int deleteMember(String memId) {
    return memberMapper.deleteMember(memId);
  }

  @Override
  public int updateMember(MemberDTO memberDTO) {
    return memberMapper.updateMember(memberDTO);
  }
}
