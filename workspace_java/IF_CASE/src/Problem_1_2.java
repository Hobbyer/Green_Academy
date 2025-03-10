import java.util.Scanner;

public class Problem_1_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("정수를 입력해주세요 : ");
    int inputNum = sc.nextInt();

    if(inputNum % 2 == 0){
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }
  }
}
