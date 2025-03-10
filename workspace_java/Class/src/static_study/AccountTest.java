package static_study;

public class AccountTest {
  public static void main(String[] args) {
    Account ac1 = new Account("C");
    Account ac2 = new Account("자바");
    Account ac3 = new Account("파이썬");

    Account.rate = 10.0; // static 변수의 장점!... 변수의 인스턴스가 변경될 때 변수를 일일이 잡지 않고 모든 객체가 공용으로 적용되는 static 변수 한번만 변경해주면 된다.
  }
}
