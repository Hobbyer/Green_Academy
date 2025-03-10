package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Account {

  private String idNum, accNum;
  private int balance;

  //List<Account> list = new ArrayList<>(); // 계좌정보는 계좌 1개에 대한 데이터를 저장할 내용만 작성

  public Account(){
    idNum = "";
    accNum = "";
    balance = 10000;
  }

  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public String getAccNum() {
    return accNum;
  }

  public void setAccNum(String accNum) {
    this.accNum = accNum;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }
}
