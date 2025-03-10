public class 연산자_2 {
  public static void main(String[] args) {
    // 증감 연산자(++, --) : 값을 1 증가, 1 감소
    int a = 1;
    ++a; // 전위 증감 연산자
    a++; // 후위 증감 연산자
    System.out.println("a = " + a);

    --a;
    a--;
    System.out.println("a = " + a);

    // 전위 증감 연산자와 후위 증감 연사자는
    // 단독으로 사용하면 해석에 차이가 없지만,
    // 단독 사용이 아닐 시 해석 순서가 달라진다.

    int num = 5;
    // 증감 연산자는 출력문에 사용해도 변수의 데이터 값이 변한다
    System.out.println(num++); // 변수까지 실행한 이후 증감
    System.out.println(num);
    System.out.println(++num); // 변수까지 실행하기 때문에 전위 증감 연산자는 연산된 채로 실행된다

    int x = 10;
    int y = x++; // y = 10, x = 11
    // 변수까지만 처리한 이후에 후위 연산자를 계산한다.
    x = x +5; // x = 16
    System.out.println(x); // 16
    System.out.println(y); // 10

    System.out.println();
    System.out.println();

    for(int value=10; value<=30; value++) {
      System.out.println(value);
    }

    System.out.println();
    System.out.println();

    for(int count=10; count<=30; ++count){
      System.out.println(count);
    }
  }
}
