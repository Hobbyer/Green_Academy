package study;

public class Person {
  private String name, tell;
  private int age;

  public Person(){

  }

  public Person(String name, String tell, int age) {
    this.name = name;
    this.tell = tell;
    this.age = age;
  }

  public void showInfo(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("연락처 : " + tell);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getTell() {
    return tell;
  }

  public void setTell(String tell) {
    this.tell = tell;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
