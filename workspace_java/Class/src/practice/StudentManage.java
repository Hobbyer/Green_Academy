package practice;

import java.util.Scanner;

public class StudentManage {
  private Scanner sc;
  private Students[] studentArr;
  private int index;

  public StudentManage(){
    sc = new Scanner(System.in);
    studentArr = new Students[3];
    index = 0;
  }

  //1. 학생등록
  public void studentRegist(){
    System.out.println("학생 등록을 시작합니다. 학생 정보를 입력하세요.");
    System.out.print("이름 : ");
    String a = sc.next();
    System.out.print("나이 : ");
    int b = sc.nextInt();
    System.out.print("연락처 : ");
    String c = sc.next();
    System.out.print("학점 : ");
    String d = sc.next();

    // 입력받은 정보로 학생 객체 생성
    Students sd = new Students(a, b, c, d);

    //생성한 학생을 studentArr 배열에 저장
    studentArr[index++] = sd;
  }

  //2. 학생정보변경(연락처)
  public void studentContact(){
    System.out.println("학생의 연락처를 변경합니다.");
    System.out.print("변경 학생 : ");
    String who = sc.next();
    for (int i=0; i<index; i++){
      if (studentArr[i].getName().equals(who)){
        System.out.print("연락처 : ");
        String whatNum = sc.next();
        studentArr[i].setContact(whatNum);
        System.out.println("변경 완료 되었습니다.");
        break;
      }
    }
  }
  //3. 학생정보출력
  public void printStudent(){
    System.out.print("정보를 열람할 학생 : ");
    String name = sc.next();
    for (Students e : studentArr){
      if (e.getName().equals(name)){
        System.out.println("요청하신 학생의 정보입니다.");
        System.out.println("이름 : " + e.getName() + ", 나이 : " + e.getAge() + ", 연락처 : " + e.getContact() + ", 학점 : " + e.getGrade().toUpperCase());
        break;
      } else {
        System.out.println("일치하는 정보가 없습니다.");
      }
    }
  }
  //4. 모든학생정보출력
  public void printAllStudents(){
    System.out.println("모든 학생의 정보입니다. 현재 총 학생 수는 " + index + "명입니다.");
    for (int i=0; i<index; i++){
      System.out.println("이름 : " + studentArr[i].getName() + ", 나이 : " + studentArr[i].getAge() + ", 학점 : " + studentArr[i].getGrade().toUpperCase());
    }
  }
  //5. 프로그램 종료
}
