package list_practice;

public class Pb10_1_Emp {
  private int empNum, payroll;
  private String name, dept,contact;

  public Pb10_1_Emp(){

  }
  public Pb10_1_Emp(int empNum, String name, String dept, String contact, int payroll){
    this.empNum = empNum;
    this.name = name;
    this.dept = dept;
    this.contact = contact;
    this.payroll = payroll;
  }

  public int getEmpNum() {
    return empNum;
  }

  public void setEmpNum(int empNum) {
    this.empNum = empNum;
  }

  public int getPayroll() {
    return payroll;
  }

  public void setPayroll(int payroll) {
    this.payroll = payroll;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

}
