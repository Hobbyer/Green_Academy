public class Problem4_7 {
  public static void main(String[] args) {
    int num = 1;
    int cnt = 0;
    while (num <= 100) {
      if(num % 5 == 0){
        System.out.print(num + " ");
        cnt++;
      }
      num++;
    }
    System.out.println();
    System.out.println(cnt);

    cnt = 0;
    for (num=1; num<=100; num++){
      if(num % 5 == 0){
        System.out.print(num + " ");
        cnt++;
      }
    }
    System.out.println();
    System.out.println(cnt);
  }
}
