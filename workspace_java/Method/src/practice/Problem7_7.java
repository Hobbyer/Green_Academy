package practice;

public class Problem7_7 {
  public static void main(String[] args) {
    Problem7_7 pw = new Problem7_7();
    System.out.println(pw.power(0.7));

    System.out.println(pw.power2(3, 3));
  }

  public double power(double a){
    return a * a;
  }

  public static int power2(int a, int b){
    int p = 1;
    for (int i = 0; i < b; i++){
      p *= a;
    }
    return p;
  }
}
