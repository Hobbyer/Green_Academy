package com.green.First;

public class Board {
  private String title, writer, content;
  private int textNum, viewCnt;

  public Board(String title, String writer, String content, int textNum, int viewCnt) {
    this.title = title;
    this.writer = writer;
    this.content = content;
    this.textNum = textNum;
    this.viewCnt = viewCnt;

  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriter() {
    return writer;
  }

  public void setWriter(String writer) {
    this.writer = writer;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public int getTextNum() {
    return textNum;
  }

  public void setTextNum(int textNum) {
    this.textNum = textNum;
  }

  public int getViewCnt() {
    return viewCnt;
  }

  public void setViewCnt(int viewCnt) {
    this.viewCnt = viewCnt;
  }
}
