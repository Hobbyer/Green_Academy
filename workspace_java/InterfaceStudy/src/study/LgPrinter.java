package study;

public class LgPrinter implements Print{
  @Override
  public void print() {
    System.out.println("Lg : 흑백 출력~");
  }

  @Override
  public void colorPrint() {
    System.out.println("Lg : 컬러 출력~");
  }
}
