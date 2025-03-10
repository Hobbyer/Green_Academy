import java.util.Scanner;

public class Problem4_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력해주세요 : ");
    int inputNum = sc.nextInt();

    int num = 1;
    int cnt = 0;
    while (num <= inputNum) {
      if(num % 2 == 0){
        cnt++;
      }
      num++;
    }
    System.out.println(cnt);


    cnt = 0;
    for (num=1; num <= inputNum; num++){
      if(num % 2 == 0){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
