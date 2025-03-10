package study;

public class MonitorTest {
  public static void main(String[] args) {
    Monitor m1 = new Monitor();
    Monitor m2 = new Monitor("java");
    Monitor m3 = new Monitor("LG", "Black");

    m1.printInfo();
    System.out.println();
    m2.printInfo();
    System.out.println();
    m3.printInfo();
  }
}
