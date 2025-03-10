package practice;

public class Problem7_6 {
  public static void main(String[] args) {
    Problem7_6 nS = new Problem7_6();
    System.out.println(nS.numStr(78));
  }

  public String numStr(int a){
    return String.valueOf(a);

    //숫자 -> 문자열 : String.valueOf()
    //문자열 -> 정수 : integer.parseInt()
  }
}
