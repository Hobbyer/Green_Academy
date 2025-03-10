import java.util.Scanner;

public class 문자열입력받기 {
  public static void main(String[] args) {
    // 키보드 입력을 받기 위한 패키지(모듈)
    Scanner sc = new Scanner(System.in);

    System.out.println("문자열을 입력 : ");
    // sc.next() 키보드로 문자열을 입력받는 명령어
    String a = sc.next();

    System.out.println("입력받은 문자열은 " + a);

  }
}
