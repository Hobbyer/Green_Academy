import java.util.Scanner;

public class Problem_1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력주세요 1 : ");
    int a = sc.nextInt();
    System.out.print("정수를 입력해주세요 2 : ");
    int b = sc.nextInt();

    if(a > b){
      System.out.println("a가 큽니다.");
    } else if (a < b) {
      System.out.println("b가 큽니다.");
    } else {
      System.out.println("같습니다.");
    }
  }
}
