package practice;

import java.util.Arrays;

public class Problem8_8 {
  public static void main(String[] args) {
    Problem8_8 aS = new Problem8_8();
    int[] x = {4, 8, 1, 77, 85};
    int[] y = {9, 5, 7, 6, 3, 15};

    System.out.println(Arrays.toString(aS.arrSum(x, y)));
  }

  public int[] arrSum(int[] a, int[] b){
    int[] c = new int[a.length + b.length];
    for (int i=0; i<a.length; i++){
      c[i] = a[i];
    }
    for (int i = a.length; i < a.length + b.length; i++){
      c[i] = b[i-a.length];
    }

    // 오름차순 정렬 //
    for (int i = 0; i < c.length; i++){
      for (int k=0; k < i; k++){
        if (c[i] <= c[k]){
          int temp = c[k];
          c[k] = c[i];
          c[i] = temp;
        }
      }
    }

    return c;
  }
}
