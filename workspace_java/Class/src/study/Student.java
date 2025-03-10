package study;

// 학생을 표현할 설계도
public class Student {
  String name;
  int age;
  String gender;
  double score;

  // 생성자
  public Student(){
    name = "Kim";
    age = 18;
    gender = "Men";
    score = 88;
  }

  // 학생 정보를 변경하는 메서드 (오버로딩 사용)
  public void setStuInfo(String a){
    name = a;
  }
  public void setStuInfo(int a){
    age = a;
  }
  public void setStuInfo(double a){
    score = a;
  }

  public void setStuInfo(String a, int b, double c){
    name = a;
    age = b;
    score = c;
  }

  // 학생의 이름을 출력하는 기능
  public void studentInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("성별 : " + gender);
    System.out.println("점수 : " + score);
  }
}
