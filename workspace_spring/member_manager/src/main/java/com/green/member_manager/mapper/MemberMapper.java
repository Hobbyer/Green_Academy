package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.lang.reflect.Member;
import java.util.List;

@Mapper
public interface MemberMapper {
  public List<MemberDTO> getMemberList();

  public List<MemberDTO> getMember(String memId);

  public int insertMember(MemberDTO memberDTO);

  public int deleteMember(String memId);

  public int updateMember(MemberDTO memberDTO);
}
