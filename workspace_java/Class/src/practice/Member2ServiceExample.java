package practice;

public class Member2ServiceExample {
  public static void main(String[] args) {
    Member2Service service = new Member2Service();

    Member2 mb1 = new Member2("홍길동", "hong");
    Member2 mb2 = new Member2("강자바", "java");

    mb1.setPw("12345");
    mb2.setPw("12345");


    boolean result1 = service.login(mb1.getId(), mb1.getPw());
    boolean result2 = service.login(mb2.getId(), mb2.getPw());

    if(result1){
      System.out.println("로그인 되었습니다.");
//      service.logout("hong");
    } else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }

    if(result2){
      System.out.println("로그인 되었습니다.");
//      service.logout("hong");
    } else {
      System.out.println("id 또는 password가 올바르지 않습니다.");
    }
  }
}
