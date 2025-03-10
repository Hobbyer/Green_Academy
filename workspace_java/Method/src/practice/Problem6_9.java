package practice;

import java.util.Scanner;

public class Problem6_9 {
  public static void main(String[] args) {
    inputNumSum();
  }

  public static void inputNumSum(){
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력해주세요(1) : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력해주세요(2) : ");
    int b = sc.nextInt();

    System.out.println("두 수의 합 : " + (a + b));
  }
}
