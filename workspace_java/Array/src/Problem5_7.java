import java.util.Arrays;

public class Problem5_7 {
  public static void main(String[] args) {
    int[] num = new int[10];
    for (int i=0; i < num.length; i++){
      num[i] = i + 1;
    }
    System.out.println(Arrays.toString(num));
  }
}
