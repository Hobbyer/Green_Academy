import java.util.Scanner;

/*
* 키보드로 국어, 영어, 수학 점수를 입력받은 후,
* 국어, 영어, 수학 각각의 점수 및 촘점, 평균을 출력
* 단, 국어, 영어, 수학 점수는 정수만 저장된다고 가정.
* */

public class 성적프로그램_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("국어 점수를 입력해주세요. : ");
    int lanScore = sc.nextInt();
    System.out.print("영어 점수를 입력해주세요 : ");
    int engScore = sc.nextInt();
    System.out.print("수학 점수를 입력해주세요 : ");
    int mathScore = sc.nextInt();

    int totalScore = lanScore + engScore + mathScore;
    double averScore = totalScore / 3;

    System.out.println("국어점수 : " + lanScore + "점");
    System.out.println("영어점수 : " + engScore + "점");
    System.out.println("수학점수 : " + mathScore + "점");
    System.out.println();
    System.out.println("총점 : " + totalScore + "점");
    System.out.println("평균 : " + averScore + "점");
  }
}
