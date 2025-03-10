package test;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 : ");
    int a = sc.nextInt();

    int h = a / 100;
    int t = (a % 100) / 10;
    int o = a % 10;

    if (h == 3 || h == 6 || h == 9){
      if (t == 3 || t == 6 || t == 9){
        if (o == 3 || o == 6 || o == 9){
          System.out.println("박수 3번");
        } else {
          System.out.println("박수 2번");
        }
      } else {
        if (o == 3 || o == 6 || o == 9){
          System.out.println("박수 2번");
        } else {
          System.out.println("박수 1번");
        }
      }
    } else {
      if (t == 3 || t == 6 || t == 9){
        if (o == 3 || o == 6 || o == 9){
          System.out.println("박수 2번");
        } else {
          System.out.println("박수 1번");
        }
      } else {
        if (o == 3 || o == 6 || o == 9){
          System.out.println("박수 1번");
        } else {
          System.out.println("박수 0번");
        }
      }
    }
  }
}