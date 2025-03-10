package practice;

import java.util.Arrays;

public class Problem8_12 {
  public static void main(String[] args) {
    int[] x = {77, 24, 100, 88, 54, 27, 13, 11, 7, 3, 47};

    bigArr(x);
  }

  public static void bigArr(int[] a){
    int temp;
    for (int i = 0; i < a.length; i++){
      for (int k = 0; k < i; k++){
        if (a[i] >= a[k]){
          temp = a[k];
          a[k] = a[i];
          a[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(a));
  }
}
