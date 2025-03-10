package practice;

public class Problem8_10 {
  public static void main(String[] args) {
    numSwitch(7, 2);
  }

  public static void numSwitch(int a, int b){
    int temp = b;
    b = a;
    a = temp;
    System.out.println("a : " + a);
    System.out.println("b : " + b);
  }
}
