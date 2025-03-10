public class Problem5_10 {
  public static void main(String[] args) {
    int[] num = {1, 2, 3, 4, 5, 6, 7, 8};

    int cnt = 0;
    for (int i=0; i<num.length; i++){
      if(num[i] % 2 == 0){
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}
