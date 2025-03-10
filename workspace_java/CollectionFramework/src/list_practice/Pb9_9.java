package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Pb9_9 {
  public static void main(String[] args) {
    Pb9_9_Student s1 = new Pb9_9_Student("java", 40, 90);
    Pb9_9_Student s2 = new Pb9_9_Student("python", 80, 80);
    Pb9_9_Student s3 = new Pb9_9_Student("C", 50, 30);

    List<Pb9_9_Student> list = new ArrayList<>();

    list.add(s1);
    list.add(s2);
    list.add(s3);

    // 1) 리스트에 저장된 모든 정보를 출력해보세요.
    for (Pb9_9_Student e : list){
      System.out.println(e);
    }
    System.out.println();

    // 2) 총점이 150점 이상인 학생의 모든 정보를 출력하세요.
    for (int i=0; i<list.size(); i++){
      if(list.get(i).getTotalScore() >= 150){
        System.out.println(list.get(i));
      }
    }
    System.out.println();

    // 3) 모든 학생에 대한 평균 점수를 출력하세요.
    double avg = 0;
    for (Pb9_9_Student e : list){
      avg = e.getTotalScore() / 2.0;
      System.out.println(e.getName() + " 의 평균 : " + avg);
    }
    System.out.println();

    // 4) 총점이 1등인 학생의 모든 정보를 출력해보세요.
    List<Pb9_9_Student> temp = new ArrayList<>();
    for (int i=0; i<list.size(); i++){
      for (int k=0; k<i; k++){
        if (list.get(i).getTotalScore() >= list.get(k).getTotalScore()){
          temp.add(list.get(k));
          list.remove(k);
          list.add(temp.get(k));
        }
      }
    }
    Pb9_9_Student totalFirst = list.get(0);

    System.out.println(list);
    System.out.println();
    System.out.println(totalFirst);
  }
}
