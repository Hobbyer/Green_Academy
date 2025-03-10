package practice;

public class Problem7_6 {
  public static void main(String[] args) {
    Phone ph = new Phone();

    ph.setMadeInfo("SAMSUNG");
    ph.setModelNameInfo("Galaxy");
    ph.setColorInfo("Black");
    ph.setPhoneNumInfo("010-1234-5678");
    ph.setPriceInfo("999,999 won");

    ph.printPhoneInfo();
  }
}
