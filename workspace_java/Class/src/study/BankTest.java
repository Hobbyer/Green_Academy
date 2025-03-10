package study;

public class BankTest {
  public static void main(String[] args) {
    // Bank 클래스에 대한 객체를 5개 저장할 수 있는 배열 bankArr를 생성
    Bank[] bankArr = new Bank[5];

    //bank클래스에 대한 객체를 5개 생성. 초기값만 마음대로.
    bankArr[0] = new Bank("김자바", "001-001", 10000);
    bankArr[1] = new Bank("김파이썬", "002-001", 20000);
    bankArr[2] = new Bank("최자바", "001-002", 15000);
    bankArr[3] = new Bank("최C", "001-003", 13000);
    bankArr[4] = new Bank("최파이썬", "003-003", 56000);

    //1. bankArr 배열에 저장된 모든 계좌의 예금액 합을 출력
    int sum = 0;
    for (int i=0; i< bankArr.length; i++){
      sum += bankArr[i].getBalance();
    }
    System.out.println(sum);

    System.out.println();

    sum = 0;
    for (Bank e : bankArr) {
      sum += e.getBalance();
    }
    System.out.println(sum);
    System.out.println();

    //2. bankArr에 저장된 모든 계좌정보 중에서 계좌주가 "최자바"인 계좌정보를 찾고,
    // 그 정보중 예금액을 20%인상 시키는 코드를 작성.
    for (Bank e : bankArr){
      if (e.getOwner() == "최자바"){;
        e.setBalance((int) (e.getBalance() * 1.2));
        System.out.println(e.getBalance());
      }
    }
  }
}
