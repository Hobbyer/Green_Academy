package test;

public class Member {
  private String id, pw, name;
  private int age;

  void setInfo(String id, String pw, String name, int age){
    this.id = id;
    this.pw = pw;
    this.name = name;
    this.age = age;
  }

  void showInfo(){
    System.out.println("아이디 : " + this.id);
    System.out.println("패스워드 : " + this.pw);
    System.out.println("이름 : "  + this.name);
    System.out.println("나이 : " + this.age);
  }

  boolean isLogin(String id, String pw){
    return this.id.equals(id) && this.pw.equals(pw);
  }
}