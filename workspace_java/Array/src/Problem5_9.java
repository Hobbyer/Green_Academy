import java.util.Arrays;
import java.util.Scanner;

public class Problem5_9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] num = new int[5];
    for (int i=0; i<num.length; i++){
      System.out.print("정수를 입력해주세요" + "("+(i+1)+") : " );
      num[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(num));
  }
}