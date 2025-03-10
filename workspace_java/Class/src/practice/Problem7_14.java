package practice;

public class Problem7_14 {
  public static void main(String[] args) {
    Song si = new Song();
    String[] a = {"kim", "lee", "lone"};

    si.setSongInfo("자장가", "korean", "Sleep", "2025", a);
    si.printSongInfo();
  }
}
