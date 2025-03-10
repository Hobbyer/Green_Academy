import java.util.Arrays;
import java.util.Scanner;

public class Problem5_12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("배열의 길이를 설정해주세요 : ");
    int arrLen = sc.nextInt();
    int[] arr = new int[arrLen];

    int sum = 0;
    double avg;
    for (int i=0; i<arrLen; i++){
      arr[i] = i+1;
      sum += arr[i];
    }
    avg = (double)sum / arr.length;

    System.out.println(Arrays.toString(arr));
    System.out.println("평균 : " + avg);

    System.out.println();

    sum = 0;
    for (int e : arr){
      sum += e;
    }
    avg = (double)sum / arr.length;

    System.out.println(sum);
    System.out.println(avg);
  }
}
