import java.util.Scanner;

public class Problem5_11_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] list = {"국어", "영어", "수학"};
    int[] grade = new int[list.length];

    int sum = 0;
    double avg;
    for (int i = 0; i < grade.length; i++){
      while(true){
        System.out.print(list[i] + "점수를 입력주세요 : ");
        grade[i] = sc.nextInt();
        if(grade[i]>=0 && grade[i]<=100){
          sum += grade[i];
          break;
        } else {
          System.out.println("0~100까지의 정수만 입력해주세요.");
        }
      }
    }

    System.out.println();
    System.out.println("****** 입력하신 정보로 점수 정보를 출력합니다 ******");

    for (int i = 0; i < list.length; i++){
      System.out.println(list[i] + "점수 : " + grade[i] + "점");
    }

    avg = (double) sum / list.length;

    System.out.println("총점 : " + sum + "점");
    System.out.println("평균 : " + avg + "점");
  }
}
