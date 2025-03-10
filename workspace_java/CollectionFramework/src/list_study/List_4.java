package list_study;

import java.util.ArrayList;
import java.util.List;

public class List_4 {
  public static void main(String[] args) {
    Person p1 = new Person("kim", 20, "울산시");
    Person p2 = new Person("hong", 30, "부산시");
    Person p3 = new Person("lee", 28, "대구시");

    System.out.println(p1.toString());
    // 출력문에 객체명만 작성하면 객체명.toString() 메서드를 자동호출
    System.out.println(p2);

    // Person 클래스의 객체를 다수 저장할 수 있는 객체 생성
    List<Person> list = new ArrayList<>();

    // Person 클래스리스트에 클래스 객체 추가
    list.add(p1);
    list.add(p2);
    list.add(p3);

    // Q. 리스트에 저장된 모든 Person 객체의 정보를 출력(hint: toString 메서드 활용)
    System.out.println(list);

    for (int i=0; i<list.size(); i++) {
      System.out.print(list.get(i).getName() + " ");
      System.out.print(list.get(i).getAge() + " ");
      System.out.println(list.get(i).getAddr());
    }
    System.out.println();


    for (int i=0; i<list.size(); i++){
      if(list.get(i).getAddr().equals("울산시")){
        System.out.println(list.get(i).getName());
      }
    }
    System.out.println();
    for (Person e : list){
      if(e.getAddr().equals("울산시")){
        System.out.println(e.getName());
      }
    }
  }
}
