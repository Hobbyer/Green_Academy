/* 자료형(data type)
* 자바의 자료형은 크게 기본자료형, 참조자료형으로 구분.
* 기본자료형(primitive) 8개 존재. 8개 모두 소문자
* 참과 거짓 : boolean -> true, false
* 정수 : byte(1바이트), short, int(4바이트), long(8바이트)
* 실수 : float, double
* 문자 : char (한 글자, 작은따옴표로 감싼다)
*
* 문자열 : String (문자의 나열, 쌍따옴표로 감싼다)
* 자바의 기본자료형에는 문자열을 저장할 기본자료형을 제공하지 않는다.
*
* 참조자료형은 무한대.
*
* */

public class 자료형_1 {
  public static void main(String[] args) {
    // 참과 거짓
    boolean a = true;
    boolean b = false;

    System.out.println(a);
    System.out.println(b);

    // 정수
    int d =1;
    byte e = 1;
    short f = 1;
    long g = 1L;

    // 실수
    double h = 1.5;
    float i = 0.1F;

    // 문자열
    String s = "hello~";

    System.out.println(s);
  }
}
