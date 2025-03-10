import java.util.Scanner;

public class Problem_2_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("1~99까지의 수 중 임의로 하나를 입력하세요 : ");
    int x = sc.nextInt();
    int a = x/10;
    int b = x%10;

    if(x >= 100 || x <= 0) {
      System.out.println("1~99의 정수가 아닙니다.");
    } else if((a == 3 || a == 6 || a == 9) && b % 3 == 0){
      System.out.println("박수짝짝");
    } else if((a == 3 || a == 6 || a == 9) && b % 3 != 0){
      System.out.println("박수짝");
    } else if(b % 3 == 0){
      System.out.println("박수짝");
    } else {
      System.out.println("박수x");
    }
  }
}
