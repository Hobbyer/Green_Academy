package practice;

import java.util.Arrays;
import java.util.Scanner;

public class StudentProgram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StudentManage sm = new StudentManage();

    System.out.println("학생 관리 프로그램을 실행합니다.");

    //while문 실행여부 값을 갖고 있는 변수
    boolean isRunning = true;

    while(isRunning){
      System.out.print("1)학생등록 2)학생정보변경(연락처) 3)학생정보출력 4)모든학생정보출력 5)프로그램 종료 : ");
      int x = sc.nextInt();
      switch (x){
        case 1:
          sm.studentRegist();
          break;

        case 2:
          sm.studentContact();
          break;

        case 3:
          sm.printStudent();
          break;

        case 4:
          sm.printAllStudents();
          break;

        case 5:
          System.out.println("프로그램을 종료합니다.");
          isRunning = false;
          break;

        default:
          System.out.println("메뉴를 다시 선택해주세요.");
      }
    }
  }
}
