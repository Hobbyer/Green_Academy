package com.green.First;

import java.util.Date;

public class FoodDTO {
  private String food, add, pleaseText, orderDate;
  private int amount;

  public FoodDTO(){

  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getAdd() {
    return add;
  }

  public void setAdd(String add) {
    this.add = add;
  }

  public String getPleaseText() {
    return pleaseText;
  }

  public void setPleaseText(String pleaseText) {
    this.pleaseText = pleaseText;
  }

  public int getAmount() {
    return amount;
  }

  public void setAmount(int amount) {
    this.amount = amount;
  }

  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String date) {
    this.orderDate = date;
  }

  @Override
  public String toString() {
    return "FoodDTO{" +
            "food='" + food + '\'' +
            ", add='" + add + '\'' +
            ", pleaseText='" + pleaseText + '\'' +
            ", amount=" + amount +
            ", orderDate=" + orderDate +
            '}';
  }
}
