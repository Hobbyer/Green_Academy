package test;

public class MemberTest {
  public static void main(String[] args) {
    // a. Member 클래스의 객체를 하나 생성
    Member m1 = new Member();
    // a. 회원의 아디디는 "java", 패스워드는 "1234", 이름은 "kim", 나이는 20으로 변경
    m1.setInfo("java", "1234", "kim", 20);

    // b. 생성한 모든 객체의 정보를 출력
    m1.showInfo();

    // c. isLogin("java", "1234") 메서드 호출 시 결과로 '로그인 가능'이 출력되어야함.
    if (m1.isLogin("java", "1234")){
      System.out.println("로그인 가능");
    } else {
      System.out.println("로그인 불가능");
    }
    // d. isLogin("java", "1111") 메서드 호출 시 결과로 '로그인 불가능'이 출력되어야함.
    if (m1.isLogin("java", "1111")){
      System.out.println("로그인 가능");
    } else {
      System.out.println("로그인 불가능");
    }
  }
}