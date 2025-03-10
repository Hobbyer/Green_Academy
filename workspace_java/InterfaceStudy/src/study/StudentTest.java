package study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class StudentTest {
  public static void main(String[] args) {
    StudentUtil f = new MyStudent();

    Student s1 = new Student();
    Student s2 = new Student();
    Student s3 = new Student();
    Student s4 = new Student();
    Student s5 = new Student();

    Student[] stuArr = {s1, s3, s5};
    Student[] stuAll = {s1, s2, s3, s4, s5};

    Object[][] aa = {
            {"kim",90,80,88},
            {"han",80,80,78},
            {"park",70,85,77},
            {"java",88,90,75},
            {"python",60,98,65}
    };

    for (int i=0; i<aa.length; i++){
      for (int k=0; k<aa[i].length; k++){
        switch (k){
          case 0:
            stuAll[i].setName((String)aa[i][k]);
            break;
          case 1:
            stuAll[i].setKorScore((int)aa[i][k]);
            break;
          case 2:
            stuAll[i].setMathScore((int)aa[i][k]);
            break;
          case 3:
            stuAll[i].setEngScore((int)aa[i][k]);
            break;
          default:
            System.out.println("k의 값이 0~3이 아닙니다");
            break;
        }
      }
    }

    int f1 = f.getTotalScore(s1);
    Student f2 = f.getHighScoreStudent(s2, s5);
    String f3 = f.getGradeByStudentName(stuArr, s3);
    String f4 = f.getGradeByStudentName(stuArr, s4);
    int[] f5 = f.getTotalScoresToArray(stuAll);

    System.out.println(f1);
    System.out.println(f2.getName());
    System.out.println(f2.getKorScore()+f2.getMathScore()+f2.getEngScore());
    System.out.println(f3);
    System.out.println(f4);
    System.out.println(Arrays.toString(f5));




//
//    System.out.println();
//
//    for (int i=0; i<aa.length; i++){
//      System.out.println(Arrays.toString(aa[i]));
//    }
  }
}
