public class Problem4_3 {
  public static void main(String[] args) {
    int cnt = 0;
    while(cnt <= 10){
      if(cnt % 2 == 0 && cnt != 0){
        System.out.print(cnt + " ");
      }
      cnt++;
    }

    System.out.println();

    for (cnt=0; cnt<=10; cnt++){
      if(cnt % 2 == 0 && cnt !=0)
        System.out.print(cnt + " ");
    }
  }
}
