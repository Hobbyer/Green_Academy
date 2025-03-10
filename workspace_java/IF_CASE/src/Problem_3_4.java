import java.util.Scanner;

public class Problem_3_4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 : ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 : ");
    int num2 = sc.nextInt();

    System.out.print("연산자 : ");
    String str1 = sc.next();

    switch (str1){
      case "+" :
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + (num1 + num2));
        break;
      case "-" :
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + (num1 - num2));
        break;
      case "*" :
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + (num1 * num2));
        break;
      default:
        System.out.println(num1 + " " + str1 + " " + num2 + " = " + (num1 / num2));
    }
  }
}
