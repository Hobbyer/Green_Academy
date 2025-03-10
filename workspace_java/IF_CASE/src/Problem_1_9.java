import java.util.Scanner;

public class Problem_1_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력하세요 : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력하세요 : ");
    int b = sc.nextInt();

    int max;
    int min;

    if(a > b) {
      max = a;
      min = b;
    } else {
      max = b;
      min = a;
    }
    System.out.println("첫번째 수 : " + a);
    System.out.println("두번째 수 : " + b);
    System.out.println(max + " >= " + min);
  }
}
