public class 연산자_1 {
  public static void main(String[] args) {
    // 산술 연산자(+, -, *, /, %)
    // '%' : mod(모드) 연산자 : 나눗셈의 나머지 값
    System.out.println(6 % 2);
    System.out.println(8 % 3);
    System.out.println();

    // 정수끼리의 연산일때(만)은 무조건 정수로 결과가 나옴
    System.out.println(8 / 3);
    System.out.println(8.0 / 3);

    int a = 8;
    System.out.println(a / 3);
    System.out.println((double) a / 3);
    System.out.println();

    // 비교 연산자(>, <, >=, <=, ==, !=)
    // '==' : 같다, '!=' : 같지않다
    System.out.println(5 > 1);
    System.out.println(3 == 3);
    System.out.println(3 != 3);
    System.out.println();

    // 복합대입 연산자(+=, -=, *=, /=, %=)
    int num = 3;

    // Q. num이 가진 값을 1증가 시키는 코드
    num = num + 1; // num 변수에 저장해주어야한다.
    System.out.println(num);

    num += 1;
    System.out.println(num);

    num++;
    System.out.println(num);

    System.out.println();

    // 논리 연산자(&&, ||)
    System.out.println(3 > 1 && 2 < 4);
    System.out.println(3 > 1 && 2 > 4);
    System.out.println(3 > 1 || 2 < 4);
    System.out.println(3 < 1 || 2 > 4);
    // && 와 || 연산이 동시에 있으면 && 연산이 우선순위가 높다.
    System.out.println(1 == 1 && 2 > 1 || 3 > 5 && 1 < 4);

    int x = 10;
    int y = 20;
    int z = (++x) + (y--);

    System.out.println(z);
    System.out.println(x);

  }
}
