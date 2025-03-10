package study;

public class StudentTest2 {
  public static void main(String[] args) {
    // Student 클래스의 객체 stu1 생성
    Student stu1 = new Student();

    // 학생 객체의 데이터 변경
    stu1.setStuInfo("Lu", 30, 67.8);
    stu1.gender = "Women";

    stu1.studentInfo();

    System.out.println();

    // Student 클래스의 객체 stu2 생성
    Student stu2 = new Student();

    // stu2 객체의 데이터 변경
    stu2.setStuInfo("King");

    stu2.studentInfo();

    System.out.println();

    // Student 클래스의 객체 stu3 생성
    Student stu3 = new Student();

    stu3.setStuInfo("New", 40,77.7);
    stu3.studentInfo();
  }
}
