package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_3 {
  public static void main(String[] args) {
    // 다수의 문자열을 저장할 수 있는 list 객체 생성.
    List<String> list = new ArrayList<>();

    list.add("java");
    list.add("C");
    list.add("C#");
    list.add("python");

    for (int i=0; i<list.size(); i++){
      System.out.print(list.get(i) + " ");
    }

    System.out.println();

    for (String e : list) {
      System.out.print(e + " ");
    }
  }
}
