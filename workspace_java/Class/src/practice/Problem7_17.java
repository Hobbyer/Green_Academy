package practice;

import java.util.Scanner;

public class Problem7_17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculator cal = new Calculator();

    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();
    System.out.print("연산자 : ");
    String c = sc.next();

    cal.setCal(a, b, c);

    switch (c){
      case "+":
        System.out.println(a + " " + c + " " + b + " = " + cal.getSum());
        break;
      case "-":
        System.out.println(a + " " + c + " " + b + " = " + cal.getSub());
        break;
      case "*":
        System.out.println(a + " " + c + " " + b + " = " + cal.getMulti());
        break;
      case "/":
        System.out.println(a + " " + c + " " + b + " = " + cal.getDiv());
        break;
      default:
        System.out.println("연산자를 잘못 입력했습니다.");
    }
  }
}
