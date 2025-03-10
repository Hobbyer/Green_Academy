package practice;

import java.util.Arrays;

public class Problem8_11 {
  public static void main(String[] args) {
    int[] x = {14};
    int[] y = {87};

    arrSwitch(x, y);
  }

  public static void arrSwitch(int[] a, int[] b){
    int temp = b[0];
    b[0] = a[0];
    a[0] = temp;
    System.out.println("배열 a : " + Arrays.toString(a));
    System.out.println("배열 b : " + Arrays.toString(b));
  }
}
