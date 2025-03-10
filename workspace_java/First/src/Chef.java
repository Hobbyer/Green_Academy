public class Chef implements Cookable {
  // 결합도가 높은 코드 작성시 문제 : 하나의 클래스의 내용이 변경되면 연결된 클래스들의 내용도 일일이 변경해야한다.
  // 결합도를 낮추기 위해서 상속 또는 인터페이스를 사용하여 구현한다.
  public void cook() {
    System.out.println("요리사가 요리합니다");
  }
}

class SuperChef implements Cookable{
  public void cook(){
    System.out.println("슈퍼요리사가 요리합니다");
  }
}

interface Cookable {
  public void cook();
}