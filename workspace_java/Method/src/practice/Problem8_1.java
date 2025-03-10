package practice;

public class Problem8_1 {
  public static void main(String[] args) {
    gugudan(17);
  }

  public static void gugudan(int a){
    for (int i = 1; i <= 9; i++){
      System.out.println(a + " x " + i + " = " + a * i);
    }
  }
}