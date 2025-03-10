package study;

// 변수의 사용 영역은 해당 변수가 선언된 {} 안에서만 가능!
public class 변수의사용영역 {
  public static void main(String[] args) {
    int a = 5;

    if(a>3){
      int b = 10;
      System.out.println(a);
      System.out.println(b);
    }
    System.out.println(a);
//    System.out.println(b);   // 변수 b는 if문 안에서만 사용 가능!(if문 안에서 선언됐기 때문)

    System.out.println();


    if(10>5){
      int num2 = 5;
    }

    if(3>1){
      int num2 = 10;
    }

    for(int i = 0; i < 10; i++){
      //for문의 ()안에서 정의된 변수 i는 해당 for문 안에서만 사용 가능하다.
    }

    for(int i = 0; i <10; i++){
      int data = 1;
      System.out.println("data : " + data);
      data++;
    }
  }
}
