package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {
  public List<BoardDTO> getBoardList(SearchDTO searchDTO);

  public BoardDTO getBoard(int boardNum);

  public List<BoardDTO> searchTitle(String search);

  public List<BoardDTO> searchWriter(String search);

  public int insertBoard(BoardDTO boardDTO);

  public int delBoard(int boardNum);

  public int updateBoard(BoardDTO boardDTO);
}
