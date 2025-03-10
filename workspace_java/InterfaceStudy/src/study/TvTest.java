package study;

import java.util.HashMap;
import java.util.Map;

// tv 기능 테스트
public class TvTest {
  public static void main(String[] args) {
    Tv tv1 = new SamsungTv();
    tv1.turnOn();
    tv1.volumeUp();
    tv1.volumeDown();
    tv1.turnOff();

    System.out.println();

    // LG tv로 변경할 경우 메서드를 일일이 다 변경해줘야 하는 번거로움이 있다. 그래서 인터페이스를 활용해서 통일 시켜주는 것이다.
    Tv tv2 = new LgTv();
    tv2.turnOn();
    tv2.volumeUp();
    tv2.volumeDown();
    tv2.turnOff();

    System.out.println();

    Map<String, String> map1 = new HashMap<>();
    HashMap<Object, Object> map2 = new HashMap<>();

    map1.put("name", "kim");
    map1.put("addr", "울산시");

    map2.put("age", 18);
    map2.put("name", "kim");
    map2.put("addr", "서울시");

    System.out.println(map1);
    System.out.println(map2);
  }
}
