package practice;

import java.util.Scanner;

public class Problem6_8 {
  public static void main(String[] args) {
    printInputValue();
  }
  public static void printInputValue(){
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력해주세요 : ");
    int a = sc.nextInt();
    System.out.println(a);
  }
}
