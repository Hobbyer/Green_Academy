import java.util.Arrays;

public class Problem5_18 {
  public static void main(String[] args) {
    int[] arr = {1, 5, 3, 8, 2};

    int temp = 0;
    for (int i=0; i<arr.length; i++){
      for (int k=0; k<i; k++){
        if(arr[i] > arr[k]){
          temp = arr[k];
          arr[k] = arr[i];
          arr[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0]);
  }
}
