package com.green.First;

public class Order {
  private int price, amount;
  private String mdNum, mdName, userId;

  public Order(int price, int amount, String mdNum, String mdName, String userId) {
    this.price = price;
    this.amount = amount;
    this.mdNum = mdNum;
    this.mdName = mdName;
    this.userId = userId;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getMdNum() {
    return mdNum;
  }

  public void setMdNum(String mdNum) {
    this.mdNum = mdNum;
  }

  public String getMdName() {
    return mdName;
  }

  public void setMdName(String mdName) {
    this.mdName = mdName;
  }

  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }
}

