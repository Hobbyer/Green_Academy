package study;

public class Tv {
  public void turnON(){
    System.out.println("Tv 전원을 ON");

  }
  private String brand, modelName;

  public Tv(String brand, String modelName) {
    this.brand = brand;
    this.modelName = modelName;
  }

  @Override
  public String toString() {
    return "Tv{" +
            "brand='" + brand + '\'' +
            ", modelName='" + modelName + '\'' +
            '}';
  }
}
