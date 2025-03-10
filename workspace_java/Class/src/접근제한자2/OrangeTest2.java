package 접근제한자2;

import 접근제한자1.Orange;

public class OrangeTest2 {
  public static void main(String[] args) {
    Orange orange = new Orange();

//    orange.b; // default 접근제한자, 다른 패키지에서 접근 불가!
  }
}
