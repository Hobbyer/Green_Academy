package practice;

public class Problem8_1_PersonInfo {
  private String name, address;
  private int age;

  Problem8_1_PersonInfo(){
    name = "";
    age = 0;
    address = "";
  }

  Problem8_1_PersonInfo(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
