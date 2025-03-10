import java.util.Arrays;

public class Problem5_15 {
  public static void main(String[] args) {

  int[] arr1 = {1, 2, 3};
  int[] arr2 = {4, 5, 6};

  int[] newArr = new int[arr1.length + arr2.length];


  for (int i = 0; i < arr2.length; i++){
    for (int k = 0; k < arr1.length; k++){
      newArr[k] = arr1[k];
    }
    newArr[i+arr1.length] = arr2[i];
  }
    System.out.println(Arrays.toString(newArr));
  }
}
