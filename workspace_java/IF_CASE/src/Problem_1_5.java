import java.util.Random;
import java.util.Scanner;

public class Problem_1_5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Random rd = new Random();
    int a = rd.nextInt(100);

    String grade;

    if(a > 90 && a <= 100){
      grade = "A";
    } else if (a > 80) {
      grade = "B";
    } else {
      grade = "C";
    }
    System.out.println("학점은 " + grade + " 입니다.");
    System.out.println(a);
  }
}
