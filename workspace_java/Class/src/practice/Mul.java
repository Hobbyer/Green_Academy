package practice;

public class Mul {
  private int a, b;

  public void setValue(int a, int b){
    this.a = a;
    this.b = b;
  }

  public int calculate(){
    return a * b;
  }
  public void printCalculate(){
    System.out.println("첫 번째 수 : " + a);
    System.out.println("두 번째 수 : " + b);
    System.out.println("연산자 : *");
    System.out.println(a + " * " +  b + " = " + calculate());
  }
}

