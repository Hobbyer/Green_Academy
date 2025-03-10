package practice;

public class Problem6_10 {
  public static void main(String[] args) {
    even(7);
  }

  public static void even(int a){
    if (a % 2 == 0){
      System.out.println("짝수입니다.");
    } else {
      System.out.println("홀수입니다.");
    }
  }
}
