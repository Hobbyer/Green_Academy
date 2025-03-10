import java.util.Arrays;
import java.util.Scanner;

public class Problem5_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] grade = new int[3];
    int total = 0;
    double avg;

    String[] list = {"국어", "영어", "수학"};

    for (int i = 0; i < grade.length; i++) {
      System.out.print(list[i] + "점수를 입력해주세요 : ");
      grade[i] = sc.nextInt();
      if(grade[i] >= 0 && grade[i] <= 100){
        total += grade[i];
      } else {
        i--;
        System.out.println("0~100까지만 입력해주세요.");
      }
    }

    for (int i = 0; i < grade.length; i++){
      System.out.println(list[i] + "점수 : " + grade[i] + "점");
    }

    avg = (double)total / grade.length;

    System.out.println("총점 : " + total + "점");
    System.out.println("평균 : " + avg);
  }
}
