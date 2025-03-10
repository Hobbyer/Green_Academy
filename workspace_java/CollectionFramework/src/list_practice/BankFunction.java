package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankFunction {
  Scanner sc = new Scanner(System.in);

  List<Consumer> csList = new ArrayList<>();
  //Account acc = new Account(); // Consumer, Account 객체를 만들 필요 없다. Consumer 객체는 리스트로 담을 수 있도록 만들었고, Account 객체는 Consumer 객체 안에 존재하기 때문에.

  public BankFunction(){

  }

  public void accRes(){
    System.out.println("계좌개설을 시작합니다.");
    System.out.print("이름 : ");
    String name = sc.next();
    System.out.print("주민등록번호 : ");
    String idNum = sc.next();
    System.out.print("연락처 : ");
    String contact = sc.next();
    System.out.print("계좌번호 : ");
    String accNum = sc.next();

    Consumer cs = new Consumer();
    cs.setName(name);
    cs.setIdNum(idNum);
    cs.setContact(contact);

    Account acc = new Account();
    acc.setAccNum(accNum);
    acc.setIdNum(cs.getIdNum());

    cs.setAcc(acc);

    csList.add(cs);
    System.out.println();
  }

  public void moneyInput(){
    System.out.print("입금계좌번호 : ");
    String accNum = sc.next();
    for (Consumer e : csList){
      int preBalance = e.getAcc().getBalance();
      if(e.getAcc().getAccNum().equals(accNum)){
        System.out.print("현재 총 예금액은 " + preBalance + "원입니다. 예금액을 입력하세요 : ");
        int money = sc.nextInt();
        int balance = preBalance + money;
        e.getAcc().setBalance(balance);
        System.out.println("정상 입금되었습니다. 현재 총 예금액은 " + e.getAcc().getBalance() + "원입니다.");
      }
    }
    System.out.println();
  }

  public void moneyOutput(){
    System.out.print("출금계좌번호 : ");
    String accNum = sc.next();
    for (Consumer e : csList){
      int preBalance = e.getAcc().getBalance();
      if(e.getAcc().getAccNum().equals(accNum)){
        System.out.print("현재 총 예금액은 " + preBalance + "원입니다. 출금액을 입력하세요 : ");
        int money = sc.nextInt();
        int balance = preBalance - money;
        e.getAcc().setBalance(balance);
        System.out.println("정상 출금되었습니다. 현재 총 예금액은 " + e.getAcc().getBalance() + "원입니다.");
      }
    }
    System.out.println();
  }
  public void accInfo() {
    System.out.print("계좌번호 : ");
    String accNum = sc.next();
    for (Consumer e : csList) {
      if (e.getAcc().getAccNum().equals(accNum)) {
        System.out.println("현재 총 예금액은 " + e.getAcc().getBalance() + "원입니다.");
      }
    }
    System.out.println();
  }

  public void removeAcc() {
    System.out.print("해지계좌번호 : ");
    String accNum = sc.next();
    for (int i=0; i<csList.size(); i++) {
      if (csList.get(i).getAcc().getAccNum().equals(accNum)) {
        csList.remove(i);
      }
    }
    System.out.println();
  }

  public void printAllInfo(){
    for (int i=0; i<csList.size(); i++) {
      System.out.println("이름 : " + csList.get(i).getName() + " 주번 : " + csList.get(i).getIdNum() + " 연락처 : " + csList.get(i).getContact() + " 계좌번호 : " + csList.get(i).getAcc().getAccNum() + " 예금액 : " + csList.get(i).getAcc().getBalance());
    }
    System.out.println();
  }
}
