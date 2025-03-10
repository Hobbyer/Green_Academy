package com.green.basic_board.controller;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private final BoardService boardService;

//  @Autowired // 클래스안에 생성자가1개만 있으면 자동으로 @Autowired를 붙여준다. 그래서 생략이 가능하다
  public BoardController(BoardService boardService){
    this.boardService =boardService;
  }

  // 게시글 목록 조회 기능을 제공하는 REST API
  // (GET) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    return boardService.selectBoardList();
  }

  @GetMapping("/{boardNum}")
  public List<BoardDTO> getBoard(@PathVariable("boardNum") int boardNum){
    return boardService.getBoard(boardNum);
  }

  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    return boardService.insertBoard(boardDTO);
  }
}
