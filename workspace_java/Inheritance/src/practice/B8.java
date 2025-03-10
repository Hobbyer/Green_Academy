package practice;

public class B8 extends A8{
  private int n;
  public void setN(int i){
    n = i;
  }

  public int getN(){
    return n;
  }
  public int getSum() {
    return n + i + getJ(); // 부모클래스에 j가 접근제한자 private 로 돼있고 j값을 리턴하는 getJ()함수는 public 으로 돼있다.
  }
}
