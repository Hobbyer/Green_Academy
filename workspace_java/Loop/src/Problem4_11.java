import java.util.Scanner;

public class Problem4_11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 정수 : ");
    int inputNum1 = sc.nextInt();
    System.out.print("두 번째 정수 : ");
    int inputNum2 = sc.nextInt();

    int max = inputNum1 >= inputNum2 ? inputNum1 : inputNum2;
    int min = inputNum1 <= inputNum2 ? inputNum1 : inputNum2;

    int sum = 0;

    min++;
    while (min < max){
      sum = sum + min;
      min++;
    }
    System.out.println(sum);
  }
}
