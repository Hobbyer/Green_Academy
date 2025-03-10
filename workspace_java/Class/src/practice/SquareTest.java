package practice;

public class SquareTest {
  public static void main(String[] args) {
    Square r = new Square();
    Square s = new Square(1, 1, 2, 3);

    r.showSquare();
    System.out.println();
    s.showSquare();
    System.out.println();
    System.out.println(s.square());
    System.out.println();

    r.setX1(-2, 2, -1, 4);
    r.showSquare();
    System.out.println();
    System.out.println(r.square());
    System.out.println();

    if(r.square() == s.square()){
      System.out.println("두 사각형은 같습니다.");
    }
  }
}
