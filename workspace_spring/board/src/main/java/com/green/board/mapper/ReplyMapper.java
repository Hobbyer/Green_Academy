package com.green.board.mapper;

import com.green.board.dto.ReplyDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReplyMapper {
  public List<ReplyDTO> getReplyList(int boardNum);

  public int insertReply(ReplyDTO replyDTO);

  public int delReply(ReplyDTO replyDTO);

  public int updateReply(ReplyDTO replyDTO);
}
