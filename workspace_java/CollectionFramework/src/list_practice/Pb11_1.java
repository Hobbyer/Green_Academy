package list_practice;

import java.awt.print.Printable;
import java.util.Scanner;

public class Pb11_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BankFunction bf = new BankFunction();

    boolean isRunning = true;

    while(isRunning){
      System.out.print("1.계좌개설 2.입금 3.출금 4.예금조회 5.계좌해지 6.전체조회 7.프로그램 종료 => ");
      int x = sc.nextInt();
      switch (x){
        case 1:
          bf.accRes();
          break;
        case 2:
          bf.moneyInput();
          break;
        case 3:
          bf.moneyOutput();
          break;
        case 4:
          bf.accInfo();
          break;
        case 5:
          bf.removeAcc();
          break;
        case 6:
          bf.printAllInfo();
          break;
        case 7:
          System.out.println("프로그램을 종료합니다.");
          isRunning = false;
          break;
        default:
          System.out.println("잘못 입력했습니다. 다시 입력해주세요.");

      }
    }
  }
}
