package practice;

public class Problem8_1_WorkInfo {
  private String company, dept;
  private int payroll;

  public Problem8_1_WorkInfo(){
    company = "";
    dept = "";
    payroll = 0;
  }

  public Problem8_1_WorkInfo(String company, String dept, int payroll){
    this.company = company;
    this.dept = dept;
    this.payroll = payroll;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getDept() {
    return dept;
  }

  public void setDept(String dept) {
    this.dept = dept;
  }

  public int getPayroll() {
    return payroll;
  }

  public void setPayroll(int payroll) {
    this.payroll = payroll;
  }
}
