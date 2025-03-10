import java.util.Scanner;

public class IF_3 {
  public static void main(String[] args) {
    // 키보드로 정수 두개를 입력 받아, 입력 받은 두수의 합이 10이상이면서 짝수는 아닐 경우에만 "참"이라는 문자열 출력
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력해주세요 1 : ");
    int inputNum1 = sc.nextInt();
    System.out.print("정수를 입력해주세요 2 : ");
    int inputNum2 = sc.nextInt();

    if(inputNum1 + inputNum2 >= 10 && (inputNum1 + inputNum2) % 2 != 0){
      System.out.println("참");
    } else {
      System.out.println("거짓");
    }
    System.out.println(inputNum1 + inputNum2);
  }
}
