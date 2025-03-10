package static_study;

public class Account {
  String owner;
  int money;
  static double rate;

  static {
    rate = 5.0;
  }

  public Account(String owner) {
    this.owner = owner;
    this.money = 50000;
  }
}

