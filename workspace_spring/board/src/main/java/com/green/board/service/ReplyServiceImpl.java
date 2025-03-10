package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{
  private final ReplyMapper replyMapper;

  public ReplyServiceImpl(ReplyMapper replyMapper) {
    this.replyMapper = replyMapper;
  }

  @Override
  public List<ReplyDTO> getReplyList(int boardNum) {
    return replyMapper.getReplyList(boardNum);
  }

  @Override
  public int insertReply(ReplyDTO replyDTO) {
    return replyMapper.insertReply(replyDTO);
  }

  @Override
  public int delReply(ReplyDTO replyDTO) {
    return replyMapper.delReply(replyDTO);
  }

  @Override
  public int updateReply(ReplyDTO replyDTO) {
    return replyMapper.updateReply(replyDTO);
  }
}
