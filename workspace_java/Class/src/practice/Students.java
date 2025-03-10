package practice;

public class Students {
  private String name, grade, contact;
  private int age;

  public Students(String name, int age, String contact, String grade){
    this.name = name;
    this.age = age;
    this.contact = contact;
    this.grade = grade;
  }

  public String getName(){
    return this.name = name;
  }
  public int getAge(){
    return this.age = age;
  }
  public String getContact(){
    return this.contact = contact;
  }
  public String getGrade(){
    return this.grade = grade;
  }

  public void setName(String a){
    this.name = a;
  }
  public void setAge(int a){
    this.age = a;
  }
  public void setContact(String a){
    this.contact = a;
  }
  public void setGrade(String a){
    this.grade = a;
  }
}

