import java.lang.reflect.Type;

public class 변수문제_1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;

    int d = a+b+c;

    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    System.out.println("a + b + c = " + (a + b + c));
    System.out.println();
    System.out.println("a + b + c = " + d);


    int x = 10;
    int y = 20;

    System.out.println("x = " + x);
    System.out.println("y = " + y);

    int z = y;

    y = x;
    x = z;

    System.out.println("x = " + x);
    System.out.println("y = " + y);


  }
}
