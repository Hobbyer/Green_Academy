package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pb9_2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    for (int i=0; i<5; i++){
      System.out.print("정수를 입력해주세요. : ");
      list.add(sc.nextInt());
    }
    System.out.println(list);
  }
}
