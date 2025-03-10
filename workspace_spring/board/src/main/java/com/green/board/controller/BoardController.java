package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import com.green.board.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardController {
  private final BoardService boardService;
  private final BoardMapper boardMapper;

  @Autowired
  public BoardController(BoardService boardService, BoardMapper boardMapper) {
    this.boardService = boardService;
    this.boardMapper = boardMapper;
  }

  @GetMapping("")
  public List<BoardDTO> getBoardList(SearchDTO searchDTO){
    return boardService.getBoardList(searchDTO);
  }

  @GetMapping("/{boardNum}")
  public BoardDTO getBoard(@PathVariable("boardNum") int boardNum,BoardDTO boardDTO){
    boardDTO.setReadCnt(boardService.getBoard(boardNum).getReadCnt());
    boardMapper.updateCnt(boardDTO);
    return boardService.getBoard(boardNum);
  }

//  @GetMapping("/title")
//  public List<BoardDTO> searchBoardList(@RequestParam("search") String search){
//    return boardService.searchTitle(search);
//  }
//  @GetMapping("/writer")
//  public List<BoardDTO> searchWriter(@RequestParam("search") String search){
//    return boardService.searchWriter(search);
//  }

  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO) {
    return boardService.insertBoard(boardDTO);
  }

  @DeleteMapping("/{boardNum}")
  public int delBoard(@PathVariable("boardNum") int boardNum) {
    return boardService.delBoard(boardNum);
  }

  @PutMapping("/{boardNum}")
  public int updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO) {
    boardDTO.setBoardNum(boardNum);
    return boardService.updateBoard(boardDTO);
  }
}
