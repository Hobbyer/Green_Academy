package study;

public class AccountTest {
  public static void main(String[] args) {
    //계좌 생성
    // 클래스명 객체명 = new 생성자();
    Account acc1 = new Account();

//    acc1.initAcc("111-222", 10000, "김자바");
//    acc1.deposit(10000);
//
//    //계좌 정보 초기값 세팅
//    acc1.initAcc("111-222", 10000, "김자바");

    // 1. 초기값 세팅인데 그 전에 다른 코드 올 수 있음.
    // 2. 초기 세팅을 여러번 호출할 수 있음.

    acc1.printAccInfo();

  }
}
