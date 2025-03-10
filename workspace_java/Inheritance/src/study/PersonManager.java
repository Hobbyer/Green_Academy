package study;

public class PersonManager {
  public static void main(String[] args) {
    Person[] p = new Person[10];

    int pcnt = 0;

    p[pcnt++] = new UnivFriend("kim", "010-1111-1111", "computer", 30);
    p[pcnt++] = new UnivFriend("hong", "010-2222-1111", "design", 29);
    p[pcnt++] = new UnivFriend("kang", "010-3333-1111", "front", 28);
    p[pcnt++] = new UnivFriend("lee", "010-4444-1111", "back", 28);
    p[pcnt++] = new UnivFriend("park", "010-5555-1111", "network", 24);

    p[pcnt++] = new CompFriend("han", "010-2222-2222", "manage", 45);
    p[pcnt++] = new CompFriend("java", "010-2222-3333", "manage", 33);
    p[pcnt++] = new CompFriend("python", "010-2222-4444", "desk", 35);
    p[pcnt++] = new CompFriend("C", "010-2222-5555", "account", 37);
    p[pcnt++] = new CompFriend("role", "010-2222-6666", "security", 29);

    // 인맥관리 조회하기.
    for (int i=0; i < p.length; i++){
      p[i].showInfo();
      System.out.println();
    }
  }
}
