package study;

public class MasterChef extends Chef{
  public void giveOrder(){
    System.out.println("후임 요리사에게 지시를 합니다.");
  }
  public void makeCook(){
    System.out.println("마스터 쉐프가 요리를 합니다.");
  }
  public void cookPractice(){
    super.makeCook(); // Chef의 makeCook();
    this.makeCook(); // MasterChef의 makeCook();
    makeCook();      // MarsterChef의 makeCook();
  }
}