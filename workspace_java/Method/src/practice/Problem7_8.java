package practice;

public class Problem7_8 {
  public static void main(String[] args) {
    Problem7_8 tp = new Problem7_8();
    System.out.println(tp.triple(4, 7, 5));
  }

  public double triple(int a, int b, int c){
    return (double) (a + b + c) / 3;
  }
}
