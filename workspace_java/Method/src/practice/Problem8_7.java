package practice;

import java.util.Arrays;

public class Problem8_7 {
  public static void main(String[] args) {
    Problem8_7 sA = new Problem8_7();
    String[] x = {"사과", "바나나", "오렌지", "키위"};
    System.out.println(sA.strArr(x));
  }

  public String strArr(String[] a){
    String b = "";
    for (int i=0; i < a.length; i++){
      b = b + " " + a[i];
    }
    return b;
  }
}
