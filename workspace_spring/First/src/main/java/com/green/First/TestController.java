package com.green.First;

import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController // annotation 어노테이션
public class TestController {

  @GetMapping("/t1")
  public String test1() {

    return "java";
  }

  @GetMapping("/t2")
  public int test2() {

    return 10;
  }

  @GetMapping("/t3")
  public int[] test3() {
    int[] arr = {1, 2, 3};

    return arr;
  }

  @GetMapping("/t4")
  public Person test4() {
    //Person 클래스에 대한 객체를 하나 생성!
    Person aaa = new Person("java", "울산시", 32);

    return aaa;
  }

  @GetMapping("/t5")
  public List test5() {
    //Person 클래스에 대한 객체를 다수 저장할 수 있는 리스트 생성
    List<Person> list = new ArrayList<>();

    Person p1 = new Person("kim", "서울시", 29);
    Person p2 = new Person("lee", "울산시", 22);
    Person p3 = new Person("park", "대구시", 30);

    list.add(p1);
    list.add(p2);
    list.add(p3);

    return list;
  }

  @GetMapping("/t6")
  public List test6() {
    List<Students> studentList = new ArrayList<>();

    studentList.add(new Students("kim", 40, 90, 70));
    studentList.add(new Students("lee", 60, 95, 78));
    studentList.add(new Students("park", 78, 80, 77));
    studentList.add(new Students("hong", 70, 88, 92));
    studentList.add(new Students("han", 87, 88, 83));

    return studentList;
  }

  // react에서 전달하는 데이터를 자바에서 받는 문법은 2가지 존재.
  // 1. 클래스를 활용하는 방법
  //   - react에서 전달하는 객체의 key와 자바에서 데이터를 받기 위해 매개변수에 선언한 클래스의 변수명이 동일하면 데이터를 자동으로 받아온다.
  // 2. Collection Framework의 Map을 활용하는 방법
  @PostMapping("/t7")
  public void test7(@RequestBody Students student) {
    System.out.println(student.toString());
  }

  @PostMapping("/t8")
  public void test8(@RequestBody PhoneDTO phoneDTO) {
    System.out.println(phoneDTO.toString());
  }

  @PostMapping("/t9")
  public int test9(@RequestBody Students student) {
//    Students s1 = new Students(student.getName(), student.getKorScore(), student.getEngScore(), student.getMathScore());
    int totalScore = student.getKorScore() + student.getEngScore() + student.getMathScore();

    return totalScore;
  }

  @PostMapping("/t10")
  public FoodDTO test10(@RequestBody FoodDTO food) {

    return food;
  }

  @GetMapping("/t11")
  public int rdNum() {
    Random rd = new Random();
    int result = rd.nextInt(1, 46);

    return result;
  }

  @GetMapping("/t12")
  public List<Board> textList() {
    Board t1 = new Board("제목입니다1", "김자바", "안녕하세요~1", 1, 0);
    Board t2 = new Board("제목입니다2", "이자바", "안녕하세요~2", 2, 5);
    Board t3 = new Board("제목입니다3", "박자바", "안녕하세요~3", 3, 1);
    Board t4 = new Board("제목입니다4", "안자바", "안녕하세요~4", 4, 3);
    Board t5 = new Board("제목입니다5", "한자바", "안녕하세요~5", 5, 2);
    Board t6 = new Board("제목입니다6", "최자바", "안녕하세요~6", 6, 7);
    Board t7 = new Board("제목입니다7", "구자바", "안녕하세요~7", 7, 6);

    List<Board> boardList = new ArrayList<>();

    boardList.add(t1);
    boardList.add(t2);
    boardList.add(t3);
    boardList.add(t4);
    boardList.add(t5);
    boardList.add(t6);
    boardList.add(t7);

    return boardList;
  }

  @GetMapping("/t13")
  public List<Order> orderList(){
    Order o1 = new Order(15000, 2, "101", "데님 청바지", "abc");
    Order o2 = new Order(10000, 3, "102", "맨투맨 반팔 티셔츠", "aaa");
    Order o3 = new Order(25000, 2, "103", "오버핏 니트", "abb");
    Order o4 = new Order(55000, 1, "104", "롱 패딩", "bbb");
    Order o5 = new Order(12000, 3, "105", "맨투맨 긴팔 티셔츠", "ccc");

    List<Order> list = new ArrayList<>();

    list.add(o1);
    list.add(o2);
    list.add(o3);
    list.add(o4);
    list.add(o5);

   return list;
  }
}