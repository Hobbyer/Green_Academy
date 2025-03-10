package practice;

public class Square {
  private int x1, y1, x2, y2;

  public Square() {

  }

  public Square(int a, int b, int c, int d) {
    this.x1 = a;
    this.y1 = b;
    this.x2 = c;
    this.y2 = d;
  }

  public void setX1(int a, int b, int c, int d) {
    this.x1 = a;
    this.y1 = b;
    this.x2 = c;
    this.y2 = d;
  }

  public int square(){
    return (x1-x2) * (y1-y2);
  }

  public void showSquare(){
    System.out.println("x1 좌표 : " + x1);
    System.out.println("y1 좌표 : " + y1);
    System.out.println("x2 좌표 : " + x2);
    System.out.println("y2 좌표 : " + y2);
    System.out.println("직사각형 넓이 : " + square());
  }

  public boolean equals(int r){
    if(r == square()){
      return true;
    } else {
      return false;
    }
  }
}
