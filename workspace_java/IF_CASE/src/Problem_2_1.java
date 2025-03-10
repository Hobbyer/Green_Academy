import java.util.Scanner;

public class Problem_2_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력해주세요 1 : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력해주세요 2 : ");
    int b = sc.nextInt();
    System.out.print("정수를 입력해주세요 3 : ");
    int c = sc.nextInt();

    if(a + b > c && b + c > a && a + c > b){
      System.out.println("삼각형을 만들 수 있습니다.");
    } else {
      System.out.println("삼각형을 만들 수 없습니다.");
    }
  }
}
