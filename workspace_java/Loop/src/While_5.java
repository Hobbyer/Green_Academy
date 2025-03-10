public class While_5 {
  public static void main(String[] args) {
    // 1~5까지의합
    int num = 1;
    int sum = 0;

    while(num <= 5){
      sum += num;

      num++;
    }
    System.out.println(sum);
  }
}
