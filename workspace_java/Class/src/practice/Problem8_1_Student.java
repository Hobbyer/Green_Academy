package practice;

public class Problem8_1_Student {
  private Problem8_1_PersonInfo p = new Problem8_1_PersonInfo();
  private Problem8_1_Sungjuk s = new Problem8_1_Sungjuk();

  public void setInfo(String name, int age, String address){
    p.setName(name);
    p.setAge(age);
    p.setAddress(address);
  }

  public void setSungjuk(int lanScore, int engScore, int mathScore){
    s.setLanScore(lanScore);
    s.setEngScore(engScore);
    s.setMathScore(mathScore);
    s.setTotalScore();
    s.setAvgScore();
  }

  public void displayStudentInfo(){
    System.out.println("이름 : " + p.getName());
    System.out.println("나이 : " + p.getAge());
    System.out.println("주소 : " + p.getAddress());
    System.out.println("국어점수 : " + s.getLanScore());
    System.out.println("영어점수 : " + s.getEngScore());
    System.out.println("수학점수 : " + s.getMathScore());
    System.out.println("총점 : " + s.getTotalScore());
    System.out.println("평균 : " + s.getAvgScore());
  }
}
