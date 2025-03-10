package practice;

public class Problem8_4 {
  public static void main(String[] args) {
    Problem8_4 eO = new Problem8_4();
    System.out.println(eO.evenOdd(98));
  }

  public boolean evenOdd(int a){
    if(a % 2 == 0){
      return true;
    } else {
      return false;
    }
  }
}
