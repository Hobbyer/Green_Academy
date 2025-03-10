public class Problem4_12 {
  public static void main(String[] args) {
    int sum = 0;
    int plusValue = 0;

    for (int i = 1; sum < 300; i++){
      sum += i;
      plusValue = i;
    }
    System.out.println("합 : " + sum);
    System.out.println("마지막 더한 값 : " + plusValue);
  }
}
