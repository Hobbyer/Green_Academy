package practice;

public class Member1 {
  private String a, b, c;

  public Member1(){

  }
  public Member1(String name, String id, String pw){
    this.a = name;
    this.b = id;
    this.c = pw;
  }

  public void setName(String name){
    this.a = name;
  }
  public void setId(String id){
    this.b = id;
  }
  public void setPw(String pw){
    this.c = pw;
  }

  public String getName(){
    return this.a;
  }
  public String getId(){
    return this.b;
  }
  public String getPw(){
    return this.c;
  }

  public void displayInfo(){
    System.out.println("이름 : " + a);
    System.out.println("아이디 : " + b);
    System.out.println("비밀번호 : " + c);
  }
}
