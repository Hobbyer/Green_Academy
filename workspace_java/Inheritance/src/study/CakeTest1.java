package study;

public class CakeTest1 {
  public static void main(String[] args) {
    StrawberryCheeseCake c1 = new StrawberryCheeseCake();

    c1.eat();
    c1.eat();
    c1.eat();

    // 다형성
//    StrawberryCheeseCake c2 = new Cake(); // 오류! 부모클래스를 자식클래스에 담을 수 없다!
    Cake c2 = new CheeseCake(); // c2는 CheeseCake 객체이다. 하지만 부모클래스인 Cake 에서 선언한 변수 및 메서드만 사용가능하다.
    Cake c3 = new StrawberryCheeseCake(); // c3는 StrawberryCheeseCake 객체이다. 하지만 부모클래스인 Cake 에서 선언한 변수 및 메서드만 사용가능하다.
    CheeseCake c4 = new StrawberryCheeseCake(); // c4는 StrawberryCheeseCake 객체이다. 하지만 부모클래스인 CheeseCake 에서 선언한 변수 및 메서드만 사용가능하다.

    // c4 객체를 딸기치즈케잌으로 변환
    StrawberryCheeseCake c5 =(StrawberryCheeseCake) c4;
    c5.eat();

    Cake c6 = new Cake();
//    StrawberryCheeseCake c7 = (StrawberryCheeseCake) c6; // 오류! c6는 Cake 객체이다. 자식클래스로 형 변환할 수 없다
      CheeseCake c7 = (CheeseCake) c4;
      c7.eat();
  }
}

// Practice
// 1번, 2번, 3번, 4번, 7번, 9번,