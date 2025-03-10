package study;

public class CarTest {
  public static void main(String[] args) {
    // 객체 생성 문법 : 클래스명 객체명 = new 클래스명();
    // 객체명 == 참조변수명 == 인스턴스(instance)
    // new -> 새로운 인스턴스(객체)를 생성해주세요~
    Car car1 = new Car();

    car1.myCar("kkk", 250);

    System.out.println(car1.carName);
    System.out.println(car1.carPrice);

    car1.powerOn();
    car1.breakOn();
  }
}