package practice;

public class Problem7_15 {
  public static void main(String[] args) {
    Man m1 = new Man();
    Man m2 = new Man();
    Man m3 = new Man();

    m1.setManInfo("Kim", "22", "서울시 @@@");

    m2.name = "Lee";
    m2.age = "24";
    m2.address = "대구시 @@@";

    m3.setName("Park");
    m3.setAge("24");
    m3.setAddress("울산시 @@@");

    m1.printMember();
    System.out.println();

    m2.printMember();
    System.out.println();

    m3.printMember();
  }
}
