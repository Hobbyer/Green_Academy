package practice;

public class Problem8_2 {
  public static void main(String[] args) {
    divF(7);
  }

  public static void divF(int a){
    System.out.println(a + "의 배수 (1~100)");
    for (int i = 1; i <= 100; i++){
      if(i % a == 0){
        System.out.print(i + " ");
      }
    }
  }
}
