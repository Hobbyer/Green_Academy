package study;

// 대학동창정보
public class UnivFriend extends Person {
  private String major;

  public UnivFriend(String name, String tell, String major, int age) {
    this.major = major;
    setName(name);
    setAge(age);
    setTell(tell);
  }

  public void showInfo(){
    System.out.println("이름 : " + getName());
    System.out.println("나이 : " + getAge());
    System.out.println("연락처 : " + getTell());
    System.out.println("전공 : " + major);
  }
}
