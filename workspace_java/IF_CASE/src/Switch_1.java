/*
  switch (조건문) : switch - case - break
  조건이 맞는 case 포함하여 그 아래 모든 case가 실행된다.

  조건이  범위라면 if문 사용이 코딩에 수월하다.
  조건이 특정 값이라면 switch-case문 사용이 코딩에 수월하다.
 */
public class Switch_1 {
  public static void main(String[] args) {
    int num = 2;

    switch (num) {
      case 1:
        System.out.println(1);
      case 2:
        System.out.println(2);
        System.out.println(2);
        break; // 코드 실행 정지
      case 3:
        System.out.println(3);
        System.out.println(3);
        System.out.println(3);
      default:
        System.out.println(4);
    }
  }
}
