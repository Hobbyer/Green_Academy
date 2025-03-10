import java.util.Scanner;

public class Problem_3_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("성별입력 : ");
    String a = sc.next();
    // '==' 는 숫자 비교만 가능하다, 문자 비교는 비교대상.equals(비교대상)
    if(a.equals("남")){
      System.out.println("남자입니다.");
    } else if (a.equals("여")) {
      System.out.println("여자입니다.");
    } else {
      System.out.println("다시 입력하세요.");
    }
  }
}
