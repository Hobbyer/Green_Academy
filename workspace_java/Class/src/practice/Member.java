package practice;

public class Member {
  String name, id, pw, age;

  public void setMember(String a, String b, String c, String d){
    name = a;
    id = b;
    pw = c;
    age = d;
  }

  public void printMemberInfo(){
    System.out.println("이름 : " + name);
    System.out.println("아이디 : " + id);
    System.out.println("비밀번호 : " + pw);
    System.out.println("나이 : " + age);
  }
}
