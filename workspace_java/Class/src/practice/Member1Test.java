package practice;

public class Member1Test {
  public static void main(String[] args) {
    Member1 db1 = new Member1("자바", "java", "123");
    Member1 db2 = new Member1();

    db2.setName("파이썬");
    db2.setId("python");
    db2.setPw("321");

    db1.displayInfo();
    System.out.println();
    db2.displayInfo();
    System.out.println();

    System.out.println(db1.getName());
    System.out.println(db1.getId());
    System.out.println(db1.getPw());
    System.out.println();
    System.out.println(db2.getName());
    System.out.println(db2.getId());
    System.out.println(db2.getPw());
  }
}
