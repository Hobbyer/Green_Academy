package practice;

import java.util.Scanner;

public class Problem7_2 {
  public static void main(String[] args) {
    Problem7_2 inputN = new Problem7_2();
    System.out.println(inputN.inputNum());
  }

  public int inputNum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력해주세요(1) : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력해주세요(2) : ");
    int b = sc.nextInt();

    return a * b;
  }
}
