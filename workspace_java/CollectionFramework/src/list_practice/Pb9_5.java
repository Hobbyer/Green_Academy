package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Pb9_5 {
  public static void main(String[] args) {
    Pb9_5_8 m1 = new Pb9_5_8("java", "j12340", "자바", 22);
    Pb9_5_8 m2 = new Pb9_5_8("C", "c12340", "씨", 12);
    Pb9_5_8 m3 = new Pb9_5_8("python", "p12340", "파이썬", 32);

    List<Pb9_5_8> list = new ArrayList<>();

    list.add(m1);
    list.add(m2);
    list.add(m3);

    for (Pb9_5_8 e : list){
      System.out.println(e);
    }
    System.out.println();

    // 7. List 에 저장된 모든 회원의 나이의 합을 출력하세요.
    int sum = 0;
    for (Pb9_5_8 e : list){
      sum += e.getAge();
    }
    System.out.println(sum);
    System.out.println();

    // 8. List 에 저장된 회원 중 id가 java 인 회원을 지우는 코드를 작성하세요.
    for (int i=0; i<list.size(); i++){
      if(list.get(i).getId().equals("java")){
        list.remove(i);
      }
    }
    System.out.println(list);
  }
}
