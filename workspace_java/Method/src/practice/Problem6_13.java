package practice;

public class Problem6_13 {
  public static void main(String[] args) {
    beetween(24, 14);
  }

  public static void beetween(int a, int b){
    if (a >= b) {
      for (int i = b + 1; i < a; i++) {
        System.out.print(i + " ");
      }
    } else {
      for (int i = a+1; i < b; i++){
        System.out.print(i + " ");
      }
    }
  }
}
