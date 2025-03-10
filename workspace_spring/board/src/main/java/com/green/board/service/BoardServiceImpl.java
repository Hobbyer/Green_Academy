package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.ReplyDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import com.green.board.mapper.ReplyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
  private final BoardMapper boardMapper;

  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper, ReplyMapper replyMapper) {
    this.boardMapper = boardMapper;
  }

  @Override
  public List<BoardDTO> getBoardList(SearchDTO searchDTO) {
    return boardMapper.getBoardList(searchDTO);
  }

  @Override
  public BoardDTO getBoard(int boardNum) {
    return boardMapper.getBoard(boardNum);
  }

  @Override
  public List<BoardDTO> searchTitle(String search) {
    return boardMapper.searchTitle(search);
  }

  @Override
  public List<BoardDTO> searchWriter(String search) {
    return boardMapper.searchWriter(search);
  }

  @Override
  public int insertBoard(BoardDTO boardDTO) {
    return boardMapper.insertBoard(boardDTO);
  }

  @Override
  public int delBoard(int boardNum) {
    return boardMapper.delBoard(boardNum);
  }

  @Override
  public int updateBoard(BoardDTO boardDTO) {
    return boardMapper.updateBoard(boardDTO);
  }
}