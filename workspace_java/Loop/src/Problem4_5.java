public class Problem4_5 {
  public static void main(String[] args) {
    int num = 1;
    int sum = 0;
    while (num <= 10) {
      sum = sum + num;
      num++;
    }
    System.out.println(sum);


    sum = 0;
    for (num=1; num<=10; num++){
      sum += num;
    }
    System.out.println(sum);
  }
}
