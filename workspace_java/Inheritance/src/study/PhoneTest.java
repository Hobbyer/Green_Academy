package study;

public class PhoneTest {
  public static void main(String[] args) {
    // 다형성 : 다양한 형태로 객체 생성
    SmartPhone p1 = new SmartPhone();
    MobilePhone p2 = new MobilePhone();
    MobilePhone p3 = new SmartPhone(); // 부모클래스로 자식클래스의 객체 생성 가능
    // SmartPhone p4 = new MobilePhone(); // 오류 : 자식클래스로 부모클래스의 객체 생성은 불가능

    p1.playApp(); // 부모클래스의 변수, 메서드를 상속받은 자식클래스의 메서드 호출 가능
    p1.sendMsg(); // 부모클래스의 변수, 메서드를 상속받은 자식클래스가 부모클래스의 메서드를 호출 가능
    System.out.println();
    p2.sendMsg(); // SmartPhone의 부모클래스인 본인 클래스를 사용! 본인 클래스의 변수, 메서드만 호출 가능
    System.out.println();
    p3.sendMsg(); // 부모클래스로 자식클래스의 객체를 생성했지만 부모클래스의 변수, 메서드만 호출 가능
  }
}
