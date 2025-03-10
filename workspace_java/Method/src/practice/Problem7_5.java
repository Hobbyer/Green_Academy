package practice;

public class Problem7_5 {
  public static void main(String[] args) {
    Problem7_5 iN = new Problem7_5();
    System.out.println(iN.inputNum(47));
  }

  public String inputNum(int a){
    if(a >= 90 && a <= 100){
      return "A";
    } else if (a >= 70 && a <= 90){
      return "B";
    } else if (a < 70) {
      return "C";
    } else {
      return "0~100까지의 정수를 입력해주세요.";
    }
  }
}
