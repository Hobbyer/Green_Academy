package study;

// Print 인터페이스를 구현하여 SamsungPrinter 클래스 작성.
public class SamsungPrinter implements Print{

  @Override
  public void print() {
    System.out.println("삼성 : 흑백 출력 실행~");
  }

  @Override
  public void colorPrint() {
    System.out.println("삼성 : 컬러 출력 실행~");
  }
}
