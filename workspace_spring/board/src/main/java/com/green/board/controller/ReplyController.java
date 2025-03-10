package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class ReplyController {
  private final ReplyService replyService;

  public ReplyController(ReplyService replyService) {
    this.replyService = replyService;
  }

  @GetMapping("reply/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum, BoardDTO boardDTO){
    return replyService.getReplyList(boardNum);
  }

  @PostMapping("reply/{boardNum}")
  public int insertReply(@PathVariable("boardNum") int boardNum, @RequestBody ReplyDTO replyDTO){
    replyDTO.setBoardNum(boardNum);
    return replyService.insertReply(replyDTO);
  }

  @DeleteMapping("reply/{boardNum}/{replyNum}")
  public int delReply(@PathVariable("boardNum") int boardNum, @PathVariable("replyNum") int replyNum, ReplyDTO replyDTO){
    replyDTO.setBoardNum(boardNum);
    replyDTO.setReplyNum(replyNum);
    return replyService.delReply(replyDTO);
  }

  @PutMapping("reply/{boardNum}/{replyNum}")
  public int updateReply(@PathVariable("boardNum") int boardNum, @PathVariable("replyNum") int replyNum, @RequestBody ReplyDTO replyDTO){
    replyDTO.setBoardNum(boardNum);
    replyDTO.setReplyNum(replyNum);
    return replyService.updateReply(replyDTO);
  }
}
