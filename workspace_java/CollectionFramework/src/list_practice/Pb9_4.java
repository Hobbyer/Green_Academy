package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pb9_4 {
  public static void main(String[] args) {
    Random rd = new Random();

    List<Integer> list = new ArrayList<>();

    for (int i=0; i<10; i++) {
      list.add(rd.nextInt(1, 100));
    }
    System.out.println(list);
  }
}
