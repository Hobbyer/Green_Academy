package study;

/*
 - 메서드(method) : 반복 사용되는 기능을 하나의 기능상자로 표현 한 것.
 - 이러한 것을 대부분의 언어에서는 함수(function)라고 표현함. (자바만 메서드라고 표현한다(?))
 - 메서드 사용방법
   1. 메서드를 정의(구현하고 싶은 기능을 정의)
    - 메서드의 정의는 클래스 안(內)이면서 또 다른 메서드 밖에서 작성
    - 메서드의 정의 문법
      >> 접근제한자 [static] 리턴타입 메서드명(매개변수들){ 메서드의 내용... }
      접근제한자 : public,
      메서드명 : 소문자로 작성, 필요한 만큼 여러개 정의 가능.
      메서드명은 중복 불가!
      한 번 정의한 메서드는 여러번 호출 가능!

   2. 정의된 메서드를 호출(사용)
    - 정의된 메서드를 사용하기 위해서는 메서드 호출을 해야하는데, 호출은 '메서드명()'로 작성한다.
*/

public class Method_1 {
  public static void main(String[] args) {
    System.out.println("프로그램 시작");
    printHello();
    System.out.println("프로그램 종료");
  }
  //'안녕하세요'를 출력하는 메서드 정의
  public static void printHello(){
    System.out.println("안녕하세요");
  }
}
