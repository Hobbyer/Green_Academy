public class 변수_2 {
  public static void main(String[] args) {
    // 변수는 필요하면 여러개 사용할 수 있음
    int num1; //변수 선언
    num1 = 10; //변수 초기화

    int num2;
    num2 = 20;

//  int num1; 이미 선언된 변수는 재선언 불가능하다.

    //num1 변수와 num2 변수에 저장된 데이터의 합을 출력
    System.out.println(num1 + num2);
    System.out.println("num1 + num2 = " + num1 + num2); // num1 + num2 = 1020 이 된다. 연산 순서에 의해서.
    System.out.println("num1 + num2 = " + (num1 + num2));
  }
}