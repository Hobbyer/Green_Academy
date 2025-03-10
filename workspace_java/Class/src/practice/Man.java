package practice;

public class Man {
  String name, age, address;

  public void setManInfo(String a, String b, String c){
    name = a;
    age = b;
    address = c;
  }

  public void setManName(String a){
    this.name = a;
  }
  public void setManage(String a){
    this.age = a;
  }
  public void setManaddress(String a){
    this.address = a;
  }

  public String setName(String a){
    return name = a;
  }
  public String setAge(String a){
    return age = a;
  }
  public String setAddress(String a){
    return address = a;
  }

  public void printMember(){
    System.out.println("이름 : " + name);
    System.out.println("나이 : " + age);
    System.out.println("주소 : " + address);
  }
}
