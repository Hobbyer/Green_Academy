import java.util.Scanner;

public class 정수입력받기 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수 입력 : ");
    int num1 = sc.nextInt();

    System.out.println("답 : " + num1);
  }
}
