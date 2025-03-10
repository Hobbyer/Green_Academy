package study;

public class StudentTest {
  public static void main(String[] args) {
    Student stu1 = new Student();
    Student stu2 = new Student();
    Student stu3 = new Student();

    stu1.name = "Lee";
    stu1.age = 22;
    stu1.gender = "Women";
    stu1.score = 75;

    stu2.setStuInfo(24);
    stu2.setStuInfo("Park");
    stu2.setStuInfo(91.5);

    stu3.setStuInfo("KEY", 31, 88.7);

    stu1.studentInfo();
    System.out.println();
    stu2.studentInfo();
    System.out.println();
    stu3.studentInfo();
  }
}
