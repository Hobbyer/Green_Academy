package test;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    // 세 정수를 Scanner 로 입력받아 큰 수부터 나열하여 출력하는 프로그램을 작성하시오. 단 입력받는 세수는 중복값이 없다고 가정한다.
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수 : ");
    int a = sc.nextInt();
    System.out.print("두 번째 정수 : ");
    int b = sc.nextInt();
    System.out.print("세 번째 정수 : ");
    int c = sc.nextInt();

    if (a > b && a > c) {
      if (b > c){
        System.out.println(a + " > " + b + " > " + c);
      } else {
        System.out.println(a + " > " + c + " > " + b);
      }
    } else if (b > a && b > c){
      if (a > c) {
        System.out.println(b + " > " + a + " > " + c);
      } else {
        System.out.println(b + " > " + c + " > " + a);
      }
    } else {
      if (a > b){
        System.out.println(c + " > " + a + " > " + b);
      } else {
        System.out.println(c + " > " + b + " > " + a);
      }
    }
  }
}