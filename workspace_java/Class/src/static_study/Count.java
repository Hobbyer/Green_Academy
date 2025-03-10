package static_study;

// static 이 붙은 멤버변수는 객체에 종속적이지 않고, 모든 객체가 공유하는 데이터.
// static 변수는 생정자에서 초기화 하지 않는다!
// static 변수는 초기화 구문이 따로 존재한다!
// 생성자보다 static 초기화가 먼저 진행 된다!
// static 변수는 [객체명.멤버변수;] 형태의 문법으로 호출하는 것은 지양해야한다 (권장x)
// static 변수는 [클래스명.변수명;] 형태의 문법으로 호출 또는 접근한다.
// static 은 변수 및 메서드에 적용할 수 있다.

public class Count {
  int cnt1; // 각 객체별로 적용
  static int cnt2; // 모든 객체가 공용으로 적용

  //static 변수 초기화 구문 : static{}
  static {
    cnt2 = 0;
  }

  public Count() {
//    cnt2 = 0; // static 변수는 생성자에서 초기화 X
    System.out.println("생성자 실행");
    cnt1++;
    cnt2++;
    System.out.println("cnt1 = " + cnt1);
    System.out.println("cnt2 = " + cnt2);
  }
}
