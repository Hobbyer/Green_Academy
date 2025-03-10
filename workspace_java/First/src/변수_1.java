// 변수(Variable)
// "값 하나"를 저장할 수 있는 공간

// 변수를 사용하기 위해서는
// 1. 변수의 선언
//    변수의 선언문법 : 자료형 변수명;
//    자료형 : 정수(int), 실수(float), 문자(Char), 문자열(String), 배열(Array) 등등..

// 2. 변수의 초기화 : 변수 선언 후 최초에 값을 할당(저장)하는 행위

/* 변수명 정의법
*  변수명은 소문자로 작성한다(관례)
*  변수명은 명확해야하고, 복합어의 경우 카멜케이스(Camel Case)로 작성한다. ex) korScore
* */

public class 변수_1 {
  public static void main(String[] args) {
    // 변수의 선언
    int num; // int -> integer(정수)
    // 변수에 데이터를 저장
    // 프로그래밍에서 '=' : 우측의 데이터를 왼쪽의 변수에 저장한다.
    // 변수의 초기화 (최초에 변수에 데이터를 저장)
    num = 1;

    num = 10;

    int a = 2;

    // 출력문의 소괄호 안에 변수명을 넣으면 변수에 저장된 값을 출력.
    System.out.println(num);
    System.out.println("num");
    System.out.println(a);

  }
}
