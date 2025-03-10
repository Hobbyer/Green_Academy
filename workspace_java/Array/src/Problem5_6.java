import java.lang.reflect.Array;
import java.util.Arrays;

public class Problem5_6 {
  public static void main(String[] args) {
    int[] num = new int[10];
    for(int i=0; i < num.length; i++){
      num[i] = 3;
    }
    System.out.println(Arrays.toString(num));
  }
}
