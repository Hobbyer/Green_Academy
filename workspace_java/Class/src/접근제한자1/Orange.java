package 접근제한자1;

/* 접근제한자
* - 변수, 메서드, 클래스의 사용 범위를 지정
* 종류 : public > default > protected > private
* public 선언된 변수와 메서드 : 같은 프로젝트라면 접근 가능
* default 선언된 변수와 메서드 : 같은 패키지 내에서 접근 가능
* private : 해당 클래스 안에서만 접근 가능, 타클래스에서 접근 불가능.
*
* 결론
*  - 멤버변수에는 무조건 private
*  - 메서드에는 무조건 public
* */
public class Orange {
  private int a; // private 접근제한자
  int b; // default 접근제한자
  public int c; // public 접근제한자

  private int price; // 직접 접근하는 실수를 막기위해 private
  //setter
  public void setPrice(int price) {
    if (price < 0) {
      price = 0;
    } else {
      this.price = price;
    }
  }

  //getter


  private void aaa(){
    a = 10;
  }
  void bbb(){}
  public void ccc(){}
}
