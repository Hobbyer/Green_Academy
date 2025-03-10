package practice;

public class Problem6_11 {
  public static void main(String[] args) {
    allEven(1, 5);
  }

  public static void allEven(int a, int b){
    if (a % 2 == 0 && b % 2 == 0){
      System.out.println("두 수는 짝수입니다.");
    } else if (a % 2 == 0 || b % 2 == 0) {
      System.out.println("한 수만 짝수입니다.");
    } else {
      System.out.println("두 수는 홀수 입니다.");
    }
  }
}
