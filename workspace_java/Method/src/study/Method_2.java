package study;

import java.util.Scanner;

public class Method_2 {
  // 이름을 출력하는 메서드 정의
  public static void printName(){
    System.out.println("제 이름은 홍길동 입니다.");
  }
  // 나이를 출력하는 메서드 정의
  public static void printAge(){
    System.out.println("제 나이는 30입니다.");
  }
  public static void main(String[] args) {
    printName();
    printAge();
    printName();

    gugudan(4);
  }
  public static void gugudan(int a){
    for (int i=1; i <= 9; i++){
      System.out.print("4 x " + i + " = ");
      System.out.println(a * i);
    }
  }
}
