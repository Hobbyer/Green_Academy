package study;

public class Student {
  private int stuNum;
  private String name;

  public Student(int stuNum, String name) {
    this.stuNum = stuNum;
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    Student student = (Student) obj;
    if(stuNum == student.stuNum && name == student.name) {
      return true;
    } else {
      return false;
    }
  }
}
