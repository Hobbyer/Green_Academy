package com.green.rest.controller;

import com.green.rest.dto.BoardDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;

@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {

  //1. 모든 게시글을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public void getBoardList(){
    System.out.println("getBoardList() 메서드 실행~");
  }

  //2. 하나의 게시글 정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{boardNum}")
  public void getBoard(@PathVariable("boardNum") int boardNum){
    System.out.println("getBoard() 메서드 실행~");
    System.out.println(boardNum);
  }

  //3. 하나의 게시글을 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void postBoard(@RequestBody BoardDTO boardDTO){
    System.out.println("postBoard() 메서드 실행~");
    System.out.println(boardDTO.toString());
  }
}
