public class Problem5_20 {
  public static void main(String[] args) {
    for (int i = 1; i < 100; i++) {
      int ten = i/10;
      int one = i%10;

      if (ten == 3 || ten == 6 || ten == 9){
        if (one == 3 || one == 6 || one == 9){
          System.out.println(i + " " + "박수 두번");
        } else {
          System.out.println(i + " " + "박수 한번");
        }
      } else {
        if (one == 3 || one == 6 || one == 9){
          System.out.println(i + " " + "박수 한번");
        }
      }
    }
  }
}
