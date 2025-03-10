package static_study;

public class Count2 {
  int cnt1;
  static int cnt2;

  public void aaa(){
    System.out.println(cnt1);
    System.out.println(cnt2);
  }

  public static void bbb(){
//    System.out.println(cnt1); // 오류 : static 으로 선언된 부분을 먼저 해석 하기 때문에 bbb() -> 다음에 int cnt1을 해석한다. 그래서 cnt1을 인식할 수 없음.
    System.out.println(cnt2);
  }

  public static void main(String[] args){
//    aaa(); // 오류 : static 선언된 구문부터 해석한다.
  }

}
