package practice;

public class B extends A{
  public B(){
    super(30);
    System.out.println("생성자B");
  }
  public B(int x){
    System.out.println("매개변수생성자B" + x);
  }
}
