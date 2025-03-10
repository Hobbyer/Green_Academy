package list_practice;

import java.util.Scanner;

public class Pb10_1 {
  public static void main(String[] args) {
    Pb10_1_EmpService empS = new Pb10_1_EmpService();

    Scanner sc = new Scanner(System.in);

    boolean isRunning = true;
    while(isRunning) {
      System.out.print("1)로그인 2)부서별 월급 현황 3)월급 인상 4)프로그램 종료 : ");
      int x = sc.nextInt();
      switch (x) {
        case 1:
          empS.login();
          break;

        case 2:
          empS.deptInfo();
          break;

        case 3:
          empS.payrollUp();
          break;

        case 4:
          System.out.println("프로그램을 종료합니다.");
          isRunning = false;
          break;

        default:
          System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
          System.out.println();
      }
    }
  }
}
