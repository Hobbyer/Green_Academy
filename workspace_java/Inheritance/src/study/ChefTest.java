package study;

public class ChefTest {
  public static void main(String[] args) {
    Chef c1 = new Chef();
    c1.makeCook(); //쉐프가 요리를 합니다.

    MasterChef c2 = new MasterChef();
    c2.makeCook(); //마스터 쉐프가 요리를 합니다.
    System.out.println();
    c2.cookPractice(); // 쉐프가 요리를 합니다.
                       // 마스터 쉐프가 요리를 합니다.
                       // 마스터 쉐프가 요리를 합니다.
  }
}
