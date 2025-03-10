package study;

public class ManTest {
  public static void main(String[] args) {
    BusinessMan m1 = new BusinessMan("samsung");
    System.out.println(m1.name);

    m1.tellName(); // Man 클래스에서 선언한 메서드이다. (BusinessMan 클래스에 상속을 해주었기 때문에 BusinessMan 클래스에서 Man 클래스의 메서드를 사용할 수 있게 됐다.)
    m1.tellCompany(); // BusinessMan 클래스에서 선안한 메서드이다.
  }
}
