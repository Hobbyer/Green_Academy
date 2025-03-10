import java.sql.SQLOutput;
import java.util.Scanner;

public class Problem5_21 {
  public static void main(String[] args) {
    boolean run = true;
    int studentNum = 0;
    int[] scores = new int[3];
    Scanner sc = new Scanner(System.in);

    while(run){
      System.out.println("---------------------------------------------------");
      System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료 ");
      System.out.println("---------------------------------------------------");
      System.out.print("선택 : ");

      int selectNo = sc.nextInt();

      switch(selectNo) {
        case 1:
          System.out.print("학생수 : ");
          studentNum = sc.nextInt();
          break;
        case 2:
          System.out.print("scores[0] :");
          scores[0] = sc.nextInt();
          System.out.print("scores[1] :");
          scores[1] = sc.nextInt();
          System.out.print("scores[2] :");
          scores[2] = sc.nextInt();
          break;
        case 3:
          System.out.println("scores[0] : " + scores[0]);
          System.out.println("scores[0] : " + scores[1]);
          System.out.println("scores[0] : " + scores[2]);
          break;
        case 4:
          int max;
          int avg;
          int temp;

          int sum = 0;
          for (int i = 0; i < scores.length; i++){
            sum += scores[i];
            for (int k = 0; k < i; k++) {
              if (scores[i] >= scores[k]) {
                temp = scores[k];
                scores[k] = scores[i];
                scores[i] = temp;
              }
            }
          }

          max = scores[0];
          avg = sum / scores.length;

          System.out.println("최고점수 : " + max);
          System.out.println("평균점수 : " + avg);
          break;
        case 5:
        default:
          run = false;
      }
    }
    System.out.println("프로그램 종료");
  }
}
