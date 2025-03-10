package test;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    int[] box = new int[3];

    for (int i = 0; i < box.length; i++) {
      box[i] = rd.nextInt(1, 10);
      for (int k = 0; k < i; k++) {
        if (box[k] == box[i]) {
          i--;
        }
      }
    }

    System.out.println(Arrays.toString(box));

    int cnt = 1;
    while (true) {
      System.out.println("숫자를 정했습니다. 게임을 시작합니다.");
      System.out.print(cnt + " >> ");
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();

      if (box[0] == a && box[1] == b && box[2] == c) {
        System.out.println("3스트라이크 0볼");
        System.out.println(cnt + "회만에 정답을 맞췄습니다.");
        break;
      } else if (
              box[0] == a && box[1] == b || box[1] == b && box[2] == c || box[0] == a && box[2] == c) {
        System.out.println("2스트라이크");
        cnt++;
      } else if (
              box[0] == a | box[1] == b | box[2] == c
      ) {
        System.out.println("1스트라이크");
        cnt++;
      } else {
        System.out.println("0스트라이크");
        cnt++;
      }
    }
  }
}
