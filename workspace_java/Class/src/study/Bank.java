package study;

public class Bank {
  private String owner, accNum;
  private int balance;

  public Bank(String owner, String accNum, int balance) {
    this.owner = owner;
    this.accNum = accNum;
    this.balance = balance;
  }

  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
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

  public void printInfo(){
    System.out.println("계좌주 : " + owner);
    System.out.println("예금액 : " + balance);
    System.out.println("계좌번호 : " + accNum);
  }
}
