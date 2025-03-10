package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
  public List<BoardDTO> getBoardList(SearchDTO searchDTO);

  public BoardDTO getBoard(int boardNum);

  public List<BoardDTO> searchTitle(String search);

  public List<BoardDTO> searchWriter(String search);

  public int insertBoard(BoardDTO boardDTO);

  public int delBoard(int boardNum);

  public int updateBoard(BoardDTO boardDTO);

  public void updateCnt(BoardDTO boardDTO);
}