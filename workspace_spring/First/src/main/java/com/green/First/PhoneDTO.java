package com.green.First;

// DTO : Data Transfer Object
public class PhoneDTO {
  private String brand, color;
  private int price;

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "PhoneDTO{" +
            "brand='" + brand + '\'' +
            ", color='" + color + '\'' +
            ", price=" + price +
            '}';
  }
}
