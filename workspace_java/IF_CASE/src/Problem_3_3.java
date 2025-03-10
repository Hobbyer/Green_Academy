import java.util.Scanner;

public class Problem_3_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int num2 = sc.nextInt();
    System.out.print("연산자 : ");
    String str1 = sc.next();

    double result;
//    double resultDouble;

    if(str1.equals("+") || str1.equals("-") || str1.equals("*") || str1.equals("/")){
      if(str1.equals("+")){
        result = num1 + num2;
      } else if (str1.equals("-")) {
        result = num1 - num2;
      } else if (str1.equals("*")) {
        result = num1 * num2;
      } else {
        result = num1 / (double)num2;
      }
      //System.out.println(num1 + " " + str1 + " " + num2 + " = " + result);
      //System.out.println(num1 + " " + str1 + " " + num2 + " = " + (str1.equals("/") ? result : (int)result)); // 삼항연산자 : 형변환을 적용해도 참, 거짓 중 더 큰 범위의 자료형으로 강제적용된다.
      //System.out.println(num1 + " " + str1 + " " + num2 + " = " + (str1.equals("/") ? String.valueOf(result) : String.valueOf((int)result))); // String.valueOf() : 값을 문자열 자료형으로 적용

      if(str1.equals("/")){
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + result);
      }
      else{
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + (int)result);
      }
    } else {
      System.out.println("연산자를 잘못 입력하였습니다.");
    }
  }
}
