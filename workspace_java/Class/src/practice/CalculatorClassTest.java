package practice;

public class CalculatorClassTest {
  public static void main(String[] args) {
    Add add = new Add();
    Sub sub = new Sub();
    Mul mul = new Mul();
    Div div = new Div();

    add.setValue(10, 20);
    sub.setValue(75, 4);
    mul.setValue(44, 3);
    div.setValue(27, 2);

    add.printCalculate();
    System.out.println();
    sub.printCalculate();
    System.out.println();
    mul.printCalculate();
    System.out.println();
    div.printCalculate();
  }
}
