public class IF_ELSEIF_ELSE_1 {
  public static void main(String[] args) {
    // 정수가 짝수면 1 출력, 홀수면 2출력, 0이면 3 출력
    int num = 4;

    if(num == 0){
      System.out.println(3);
    } else if (num % 2 == 0) {
      System.out.println(1);
    } else {
      System.out.println(2);
    }
  }
}
