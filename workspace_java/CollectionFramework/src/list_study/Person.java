package list_study;

public class Person {
  private String name, addr;
  private int age;

  public Person(){

  }

  public Person(String name, int age, String addr){
    this.name = name;
    this.age = age;
    this.addr = addr;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  public String getAddr() {
    return addr;
  }
  public void setAddr(String addr) {
    this.addr = addr;
  }

  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
            "name='" + name + '\'' +
            ", addr='" + addr + '\'' +
            ", age=" + age +
            '}';
  }
}
