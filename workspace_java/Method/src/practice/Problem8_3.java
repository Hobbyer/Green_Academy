package practice;

public class Problem8_3 {
  public static void main(String[] args) {
    Problem8_3 rR = new Problem8_3();
    System.out.println(rR.reRandom());
  }

  public int reRandom(){
    return (int)(Math.random() * 50 + 1);
  }
}
