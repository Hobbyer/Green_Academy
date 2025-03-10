package practice;

public class Problem7_3 {
  public static void main(String[] args) {
    Problem7_3 mN = new Problem7_3();
    System.out.println(mN.maxNum(77, 44));
  }

  public int maxNum(int a, int b) {
    if (a >= b){
      return a;
    } else {
      return b;
    }
  }
}
