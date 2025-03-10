package study;

public class MyStudent implements StudentUtil{
  @Override
  public int getTotalScore(Student a) {
    return a.getKorScore() + a.getMathScore() + a.getEngScore();
  }

  @Override
  public Student getHighScoreStudent(Student a, Student b) {
    int x = a.getKorScore()+a.getMathScore()+a.getEngScore();
    int y = b.getKorScore()+b.getMathScore()+b.getEngScore();
    return x > y ? a : b;
  }

  @Override
  public String getGradeByStudentName(Student[] a, Student b) {
    for (int i = 0; i < a.length; i++) {
      if (a[i].getName().equals(b.getName())) {
        double grade = (a[i].getKorScore() + a[i].getMathScore() + a[i].getEngScore()) / 3.0;
        if (grade >= 90) {
          return "A";
        } else if (grade >= 80) {
          return "B";
        } else if (grade >= 70) {
          return "C";
        } else {
          return "D";
        }
      }
    }
    return "학생 정보 없음";
  }

  @Override
  public int[] getTotalScoresToArray(Student[] a) {
    int[] arr = new int[a.length];

    for (int i=0; i<a.length; i++){
      arr[i] = a[i].getKorScore()+a[i].getMathScore()+a[i].getEngScore();
    }
    return arr;
  }
}
