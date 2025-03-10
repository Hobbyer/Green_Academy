/* if문 (조건문) : 조건이 맞을 때만 코드를 실행하는 문법
* if(조건식){
*   실행할 코드
* }
* */


public class IF_1 {
  public static void main(String[] args) {
    System.out.println("시작");

    int num = 3;
    if(num == 1){
      System.out.println("aaaa");
    } else if (num == 4) {
      System.out.println("kkkk");
    } else {
      System.out.println("nnnn");
    }

    System.out.println();

    if(num == 3){
      if(num > 4){
        System.out.println("no");
      } else if (num <= 3) {
        System.out.println("yes");
      } else {
        System.out.println("else");
      }
    }

    System.out.println("끝");
  }
}
