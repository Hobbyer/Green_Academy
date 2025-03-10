import java.util.Scanner;

public class Problem_1_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하세요 : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력하세요 : ");
    int b = sc.nextInt();
    System.out.print("정수를 입력하세요 : ");
    int c = sc.nextInt();

    int first, second, third;

    if(a >= b && b >= c){
      first = a;
      second = b;
      third = c;
    } else if(b >= a && a >= c) {
      first = b;
      second = a;
      third = c;
    } else if(c >= a && a >= b){
      first = c;
      second = a;
      third = b;
    } else if(b >= a && b >= c && a <= c){
      first = b;
      second = c;
      third = a;
    } else if(a >= b && a >= c && b <= c){
      first = a;
      second = c;
      third = b;
    } else {
      first = c;
      second = b;
      third = a;
    }
    System.out.println("첫번째 수 : " + a);
    System.out.println("두번째 수 : " + b);
    System.out.println("세번째 수 : " + c);
    System.out.println(first + " >= " + second + " >= " + third);
  }
}