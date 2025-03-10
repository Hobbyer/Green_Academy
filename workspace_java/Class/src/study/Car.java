package study;

/*
 * 자동차를 객체로 만들기 위해 자동차 설계도를 작성!!
 * 클래스의 구성 요소 : 데이터(변수), 기능(메서드), 생성자
 * 클래스 안에서 선언한 변수 : 멤버변수, 필드
 * 메서드 안에서 선언한 변수 : 지역변수(local variable)
 * 멤버변수 vs 지역변수
   - 지역변수는 반드시 초기화 필요!
   - 멤버변수는 초기화하지 않으면 기본값으로 초기화가 자동 진행.(기본값으로 바로 사용가능)
 * */
public class Car {
  String carName; // 자동차명
  int carPrice; // 자동차 가격


  public void myCar(String a, int b){
    carName = a;
    carPrice = b;
  }

  // 시동 기능
  public void powerOn() {
    System.out.println("시동을 겁니다.");
  }

  // 브레이크 기능
  public void breakOn() {
    System.out.println("브레이크");
  }
}
