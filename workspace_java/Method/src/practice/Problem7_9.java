package practice;

public class Problem7_9 {
  public static void main(String[] args) {
    Problem7_9 oS = new Problem7_9();
    System.out.println(oS.oddSum(7));
  }

  public int oddSum(int a) {
    int sum = 0;
    for (int i = 1; i <= a; i++) {
      if (i % 2 != 0) {
        sum += i;
      }
    }
    return sum;
  }
}
