import java.util.Scanner;

public class Problem_1_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력해주세요 : ");
    int a = sc.nextInt();

    if(a % 3 == 0){
      System.out.println("3의 배수입니다.");
    } else {
      System.out.println("3의 배수가 아닙니다.");
    }
  }
}
