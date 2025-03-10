package study;

// 직장동료정보
public class CompFriend extends Person {
  private String dept;

  public CompFriend(String name, String tell, String dept, int age) {
    this.dept = dept;
    setName(name);
    setAge(age);
    setTell(tell);
  }

  public void showInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("나이 : " + getAge());
    System.out.println("부서 : " + dept);
    System.out.println("연락처 : " + getTell());
  }
}
