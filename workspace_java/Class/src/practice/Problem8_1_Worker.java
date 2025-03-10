package practice;


public class Problem8_1_Worker {
  Problem8_1_PersonInfo p1 = new Problem8_1_PersonInfo();
  Problem8_1_WorkInfo w1 = new Problem8_1_WorkInfo();

  Problem8_1_Worker(){

  }

  public void setInfo(String name, int age, String address){
    p1.setName(name);
    p1.setAge(age);
    p1.setAddress(address);
  }

  public void setWorkInfo(String company, String dept, int payroll){
    w1.setCompany(company);
    w1.setDept(dept);
    w1.setPayroll(payroll);
  }

  public void displayWorker(){
    System.out.println("이름 : " + p1.getName());
    System.out.println("나이 : " + p1.getAge());
    System.out.println("주소 : " + p1.getAddress());
    System.out.println("회사명 : " + w1.getCompany());
    System.out.println("부서 : " + w1.getDept());
    System.out.println("급여 : " + w1.getPayroll());
  }
}
