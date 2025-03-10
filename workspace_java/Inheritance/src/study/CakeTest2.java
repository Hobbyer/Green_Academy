package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CakeTest2 {
  public static void main(String[] args) {
    // 일반적인 클래스의 내용
    // 기능구현을 위해 사전적으로 많은 클래스에 대한 내용을 다 알고 있어야한다.
    // 다형성 : 부모클래스로 모든 객체의 자료형을 통일 시킬 수 있음. (아주 유리한 코딩이다!!!!)
    Cake c1 = new Cake();
    Cake c2 = new CheeseCake();
    Cake c3 = new StrawberryCheeseCake();
    // ////// //////// ///////// ////// ////// //////// //
    // 각 클래스의 메서드를 통일시킴(오버라이딩)으로써 사전적으로 알고 있어야하는 내용의 양을 확 줄임.
    c1.eat();
    c2.eat();
    c3.eat();

    System.out.println();

    // 다형성 + 오버라이딩으로 반복문을 사용할 수 있게 됨.
    Cake[] a = {c1, c2, c3};

    for (int i=0; i < a.length; i++){
      a[i].eat();
    }

    List<Cake> b = new ArrayList<>();
    b.add(c1);
    b.add(c2);
    b.add(c3);

    System.out.println(b);
  }
}
