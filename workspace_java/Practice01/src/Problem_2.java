import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Problem_2 {
  public static void main(String[] args) {
    int[] a = new int[6];
    Random rd = new Random();
    for (int i = 0; i < a.length; i++){
      a[i] = rd.nextInt(1, 46);
    }
    System.out.println(Arrays.toString(a));
  }
}
