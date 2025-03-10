package practice;

// public > default > protected > private
// 전체(아무나) > 같은 패키지내 > private + 해당 클래스의 자식클래스까지만 허용 > 나만 직접접근 허용
public class A7 {
  protected int n; // protected : private + 해당 클래스의 자식클래스는 접근 허용한다.
  public int getN(){
    return n;
  }
  public void setN(int i){
    n = i;
  }
}
