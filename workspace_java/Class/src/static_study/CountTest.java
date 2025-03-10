package static_study;

public class CountTest {
  public static void main(String[] args) {
    Count count1 = new Count();
    Count count2 = new Count();
    Count count3 = new Count();
    System.out.println();

    System.out.println(Count.cnt2);  // 클래스.변수 -> static 변수(공용변수)임을 알 수 있다
    System.out.println();

    System.out.println(Math.PI); // 클래스.변수 -> static 변수
    System.out.println(Math.absExact(-10)); // 클래스.메서드() -> static 메서드
  }
}
