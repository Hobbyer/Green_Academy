package com.green.basic_board.service;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {
  private final BoardMapper boardMapper;

  //생성자 주입(DI)
//  @Autowired
  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }

  @Override
  public List<BoardDTO> selectBoardList() {
    System.out.println("게시글 조회를 시작합니다");
    // 게시글 목록 조회 쿼리를 실행
    List<BoardDTO> boardList = boardMapper.selectBoardList();
    System.out.println("게시글 조회를 완료했습니다");
    return boardList;
  }

  @Override
  public List<BoardDTO> getBoard(int boardNum) {
    return boardMapper.getBoard(boardNum);
  }

  @Override
  public int insertBoard(BoardDTO boardDTO) {
    return boardMapper.insertBoard(boardDTO);
  }
}
