package practice;

public class Problem7_10 {
  public static void main(String[] args) {
    Problem7_10 sL = new Problem7_10();
    System.out.println(sL.strLen("Combination"));
  }

  public boolean strLen(String a) {
    return (a.length() % 2 == 0);
  }
}
