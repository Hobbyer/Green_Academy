package practice;

public class Calculator {
  private int a, b;
  String c;

  public void setCal(int num1, int num2, String sign){
    this.a = num1;
    this.b = num2;
    this.c = sign;
  }

  // 더하기 기능
  public int getSum(){
    return a + b;
  }
  public int getSub(){
    return a - b;
  }
  public int getMulti(){
    return a * b;
  }
  public double getDiv(){
    return (double) a / b;
  }
}
