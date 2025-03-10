package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Pb9_3 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("홍길동");
    list.add("구길동");
    list.add("이길동");
    list.add("오길동");
    list.add("호길동");

    for (String e : list){
      if(e.equals("홍길동")){
        System.out.println("해당 이름이 존재합니다.");
      }
    }
    System.out.println();

    if(list.contains("홍길동")){
      System.out.println("해당 이름이 존재합니다.");
    }
  }
}
