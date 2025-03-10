package list_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pb10_1_EmpService {
  Pb10_1_Emp emp1 = new Pb10_1_Emp(111, "java", "Green","010-1234-5678", 400000);
  Pb10_1_Emp emp2 = new Pb10_1_Emp(121, "C", "Samsung","010-5757-6767", 500000);
  Pb10_1_Emp emp3 = new Pb10_1_Emp(211, "python", "SK","010-4422-5566", 470000);
  Pb10_1_Emp emp4 = new Pb10_1_Emp(411, "SQL", "Hyundai","010-9977-9871", 700000);
  Pb10_1_Emp emp5 = new Pb10_1_Emp(678, "Spring", "Space X","010-4875-5697", 850000);
  Pb10_1_Emp emp6 = new Pb10_1_Emp(159, "lee", "Green","010-3245-5959", 250000);
  Pb10_1_Emp emp7 = new Pb10_1_Emp(498, "park", "Green","010-4555-6689", 250000);
  Pb10_1_Emp emp8 = new Pb10_1_Emp(333, "kim", "Samsung","010-3875-7879", 250000);
  Pb10_1_Emp emp9 = new Pb10_1_Emp(320, "func", "Sk","010-3875-4159", 250000);

  List<Pb10_1_Emp> list = new ArrayList<>();

  Scanner sc = new Scanner(System.in);

  public Pb10_1_EmpService(){
    list.add(emp1);
    list.add(emp2);
    list.add(emp3);
    list.add(emp4);
    list.add(emp5);
    list.add(emp6);
    list.add(emp7);
    list.add(emp8);
    list.add(emp9);
  }

  public void login(){
    System.out.print("사번 : ");
    int empNum = sc.nextInt();
    System.out.print("비밀번호(연락처의 마지막 4자리) : ");
    String contact = sc.next();

    String lastContact;
    for (Pb10_1_Emp e : list){
      lastContact = e.getContact().substring(9);
      if(e.getEmpNum() == empNum && lastContact.equals(contact)){
        System.out.println("로그인 하였습니다.");
        System.out.println("'" + e.getName() + "'님 반갑습니다.");
      } else if (e.getEmpNum() == empNum && !lastContact.equals(contact)) {
        System.out.println("사번 혹은 비밀번호가 일치하지 않습니다.");
      }
    }
  }

  public void deptInfo(){
    System.out.print("부서명 : ");
    String dept = sc.next();

    System.out.println("==" + dept + "부" + " 월급 현황==");

    int sum = 0;
    int cnt = 0;
    for (Pb10_1_Emp e : list){
      if(e.getDept().equals(dept)){
        System.out.println("이름 : " + e.getName() + ", 월급 : " + e.getPayroll());
        sum += e.getPayroll();
        cnt++;
      }
    }
    int avg =  sum / cnt;
    System.out.println(dept + "부서의 월급 총액은" + sum + "원이며, 평균 급여는 " + avg + "원입니다.");
  }

  public void payrollUp(){
    System.out.print("부서명 : " );
    String dept = sc.next();
    System.out.print("인상급여 : ");
    int money = sc.nextInt();
    System.out.println(dept + "부 각 사원의 급여가 각각 " + money + "원씩 인상됩니다.");
    System.out.println("==월급 인상 후 " + dept + "부 월급 현황==" );

    for (Pb10_1_Emp e : list){
      int prePayroll = e.getPayroll();
      if (e.getDept().equals(dept)){
        int payroll = prePayroll + money;
        e.setPayroll(payroll);
        System.out.println("이름 : " + e.getName() + ", 월급 : " + e.getPayroll() + ", 이전 월급 : " + prePayroll);
      }
    }
  }
}