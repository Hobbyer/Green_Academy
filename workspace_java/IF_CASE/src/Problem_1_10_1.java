import java.util.Scanner;

public class Problem_1_10_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫번째 수 : ");
    int a = sc.nextInt();
    System.out.print("두번째 수 : ");
    int b = sc.nextInt();
    System.out.print("세번째 수 : ");
    int c = sc.nextInt();

    int first;
    int second;
    int third;

    if(a >= b && a >= c){
      if(b >= c){
        first = a;
        second = b;
        third = c;
      } else {
        first = a;
        second = c;
        third = b;
      }
    } else if(b >= a && b >= c){
      if(a >= c){
        first = b;
        second = a;
        third = c;
      } else {
        first = b;
        second = c;
        third = a;
      }
    } else {
      if(a >= b){
        first = c;
        second = a;
        third = b;
      } else {
        first = c;
        second = b;
        third = a;
      }
    }
    System.out.println(first + " >= " + second + " >= " + third);
  }
}
