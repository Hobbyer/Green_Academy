package 접근제한자1;

public class OrangeTest1 {
  public static void main(String[] args){
    Orange orange = new Orange();

//    orange.a; // a변수는 private라서 다른 클래스에서는 접근 불가!
//    orange.aaa(); // aaa() private라서 다른 클래스에서는 접근 불가!

    orange.b = 10; // default 접근제한자
    orange.c = 20; // public 접근제한자
  }
}
