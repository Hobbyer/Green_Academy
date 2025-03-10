import java.util.Arrays;

public class Problem5_14 {
  public static void main(String[] args) {
    int[] arr = {5, 4, 3, 2, 1};
    int[] newArr = new int[5];

    for (int i = 0; i < arr.length; i++){
      newArr[i] = arr[i];
    }
    System.out.println(Arrays.toString(newArr));
  }
}
