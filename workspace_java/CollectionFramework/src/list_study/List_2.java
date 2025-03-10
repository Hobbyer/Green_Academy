package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_2 {
  public static void main(String[] args) {
    // 다수의 정수를 저장할 수 있는 list1 객체 생성
    // 배열과 다르게 저장할 데이터의 갯수를 미리 지정할 필요가 없다.
    List<Integer> list1 = new ArrayList<>();

    // list1에 데이터 추가
    list1.add(45); //넣는 순서대로 0부터 index 가 자동부여된다.
    list1.add(10);
    list1.add(88);
    list1.add(478);
    list1.add(456);

    System.out.println(list1);
    System.out.println(list1.get(0));

    // list1에 저장된 데이터 삭제
    list1.remove(3);

    System.out.println(list1);

    // list1에 저장된 데이터의 갯수
    System.out.println(list1.size());

    // list1에 저장된 데이터를 수정
    list1.set(3, 77);
    System.out.println(list1);

    // list1의 모든 데이터 출력
    for (int i=0; i<list1.size(); i++){
      System.out.println(list1.get(i));
    }
  }
}
