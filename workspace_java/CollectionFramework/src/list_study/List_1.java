package list_study;

import java.util.ArrayList;
import java.util.List;


// List 에 저장할 자료혀은 기본 자료형으로 사용하지 못 한다. 예> int(x) -> Integer(o)
// List 에서 사용할 자료형을 위해 기본 자료형을 클래스화 시킨 자료형이 존재한다 (Wrapper 클래스)
public class List_1 {
  public static void main(String[] args) {
    // List<자료형> 객체명 = new ArrayList<>();

    // 다수의 문자열을 저장할 수 있는 List 생성. String
    List<String> stringList = new ArrayList<>();

    // 다수의 정수를 저장할 수 있는 List 생성. Integer
    List<Integer> intList = new ArrayList<>();

    // 다수의 실수를 저장할 수 있는 List 생성. Double
    List<Double> doubleList = new ArrayList<>();

    // 다수의 참과 거짓 조건의 데이터를 저장할 수 있는 List 생성. Boolean
    List<Boolean> booleanList = new ArrayList<>();
  }
}
