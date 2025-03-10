package study;

/*
* 메서드의 리턴타입 : 메서드의 실행결과 데이터의 자료형
* 리턴 : 메서드를 호출하는 곳에 결과값을 되돌려준다.
* 리턴되는 데이터의 자료형과 메서드의 리턴타입은 일치해야한다.
* return 명령어는 실제 데이터를 리턴하는 역할을 하며, return 명령어 이후에는 어떠한 코드도 올 수 없음.
* 메서드에서 return 명령어는 마지막에 한 번만 가능하다.
* */

import java.util.Random;

public class Method_5 {
  public static void main(String[] args) {

    System.out.println(aaa());
    bbb();
    System.out.println(ccc());
    System.out.println(ddd(10,101));
  }

  public static int aaa() {
    System.out.println(6);
    return 3;
  }

  public static void bbb(){
    System.out.println("안녕");
  }

  public static int ccc(){
    Random rd = new Random();
    return rd.nextInt(0, 1000);
  }

  public static int ddd(int a, int b){
    return a + b;
  }
}
