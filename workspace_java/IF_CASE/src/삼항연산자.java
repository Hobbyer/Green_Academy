import java.util.Scanner;

public class 삼항연산자 {
  public static void main(String[] args) {
    int a = 3;
    int b;

    if(a > 5){
      b = 1;
    } else {
      b = 2;
    }

    System.out.println(b);

    b = a > 5 ? 1 : 2; //위의 if문을 한줄로... << 삼항연산자,  변수 = 조건식 ? 참인경우 : 거짓인경우;

    System.out.println(b);

    //num이 5이면 "참" 출력, 그렇지 않으면 "거짓" 출력
    int num = 5;

    System.out.println(num == 5 ? "참" : "거짓");


    //키보드로 정수 두 개를 입력 받아, 입력받은 수 중에서 큰 수는 max라는 변수에 저장하고,
    //작은 수는 min이라는 변수에 저장.

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int num2 = sc.nextInt();

    int max;
    int min;

    max = num1 >= num2 ? num1 : num2;
    min = num1 <= num2 ? num1 : num2;

    System.out.println(max);
    System.out.println(min);
  }
}
