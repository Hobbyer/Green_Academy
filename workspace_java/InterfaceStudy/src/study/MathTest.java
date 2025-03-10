package study;

public class MathTest {
  public static void main(String[] args) {
   MathUtil m = new MathFunction();

   boolean a = m.isEven(4, 12, 24);
   double b = m.getSumFromOne(7);
   double c = m.getCircleArea(3);
   double d = m.getCircleArea(-3);

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
  }
}
