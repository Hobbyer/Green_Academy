public class Problem4_6 {
  public static void main(String[] args) {
    int num = 1;
    int cnt = 0;
    while (num <= 100){
      if(num % 3 == 0) {
        cnt++;
      }
      num++;
    }
    System.out.println(cnt);

    cnt = 0;
    for (num=1; num<=100; num++){
      if(num % 3 == 0) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
