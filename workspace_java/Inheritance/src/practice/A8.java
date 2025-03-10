package practice;

public class A8 {
  public int i;
  private int j; // 접근 제한자가 private면 자식클래스도 직접접근이 불가능하다. 자식클래스까지만 허용한다면 protected 사용
  public void setJ(int n){
    j = n;
  }
  public int getJ(){
    return j;
  }
}
