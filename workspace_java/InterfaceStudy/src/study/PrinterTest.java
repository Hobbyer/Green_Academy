package study;

import java.util.Arrays;

public class PrinterTest {
  public static void main(String[] args) {
    SamsungPrinter p1 = new SamsungPrinter();
    Print p2 = new SamsungPrinter();
    Print p3 = new LgPrinter();

    p1.print();
    p1.colorPrint();

    System.out.println();

    p2.print();
    p2.colorPrint();

    System.out.println();

    p3.print();
    p3.colorPrint();

    Print[] pArr = {p2, p3};

    System.out.println();

    for (int i=0; i < pArr.length; i++){
      pArr[i].print();
      pArr[i].colorPrint();
    }
  }
}
