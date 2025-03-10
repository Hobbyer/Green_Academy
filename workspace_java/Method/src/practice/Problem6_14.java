package practice;

public class Problem6_14 {
  public static void main(String[] args) {
    countFive(17, 2);
  }

  public static void countFive(int a, int b){
    int cnt = 0;
    if(a >= b){
      for (int i = b+1; i < a; i++){
        if (i % 5 == 0){
          cnt++;
        }
      }
    } else {
      for (int i = a+1; i < b; i++){
        if (i % 5 == 0){
          cnt++;
        }
      }
    }
    System.out.println(cnt);
  }
}
