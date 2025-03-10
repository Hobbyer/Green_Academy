import java.util.Arrays;
import java.util.Random;

public class Problem5_17 {
  public static void main(String[] args) {
    Random rd = new Random();

    int[] lotto = new int[6];

    int num;
    for (int i=0; i < lotto.length; i++){
      num = rd.nextInt(1, 45);
      lotto[i] = num;
      for (int k=0; k < i; k++){
        if(lotto[i] == lotto[k]){
          i--;
        }
      }
    }
    System.out.println(Arrays.toString(lotto));
  }
}
