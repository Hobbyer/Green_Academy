package practice;

public class Member2 {
  private String a, b, c;
  private int d;

  public Member2(){

  }
  public Member2(String name, String id){
    this.a = name;
    this.b = id;
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
}
