package practice;

import java.util.Arrays;

public class Problem8_6 {
  public static void main(String[] args) {
    Problem8_6 aS = new Problem8_6();
    int[] x = {4, 8, 1, 77, 85, 3, 65};

    System.out.println(aS.arrMax(x));
  }

  public int arrMax(int[] a){
    int temp;
    for (int i = 0; i < a.length; i++){
      for (int k = 0; k < i; k++){
        if(a[i] >= a[k]){
          temp = a[k];
          a[k] = a[i];
          a[i] = temp;
        }
      }
    }
    return a[0];
  }
}
