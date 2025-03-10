package study;

// 클래스 선언문에서 클래스명 extends 부모클래스 문법을 적용하면 상속을 사용할 수 있다.
// 상속을 사용하면 상속하는 부모클래스의 멤버변수, 메서드를 물려 받는다.
// 부모클래스에서 생성자를 선언할 경우, 자식 클래스에 매개변수 정보가 없는 생성자를 자동으로 호출해주지 않는다.
public class BusinessMan extends Man {
  String company;

  public BusinessMan(String company) {
//    this.name = name;
    super("kim"); // 부모클래스의 생성자를 호출하는 것이다!
    this.company = company;
  }

  public void tellCompany() {
    System.out.println("Company is " + company);
  }
}
