package practice;

import java.util.Arrays;

public class Problem8_9 {
  public static void main(String[] args) {
    int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 14, 15, 21, 27, 30, 32, 37, 39, 50, 51, 52, 66, 68, 70};

    Problem8_9 nA = new Problem8_9();
    System.out.println(Arrays.toString(nA.newArr(x)));
  }

  public int[] newArr(int[] a){
    int cnt = 0;
    for (int i = 0; i < a.length; i++){
      if(a[i] % 2 == 0){
        cnt++;
      }
    }

    int[] b = new int[cnt];

    int k = 0;
    for (int i = 0; i < a.length; i++){
      if(a[i] % 2 == 0){
        b[k] = a[i];
        k++;
      }
    }
    return b;
  }
}
