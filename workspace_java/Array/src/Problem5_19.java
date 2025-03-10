import java.util.Arrays;

public class Problem5_19 {
  public static void main(String[] args) {

    int[] arr = new int[10];
    int temp;
    for (int i=0; i<arr.length; i++){
      double rd = Math.random() * 100;
      int num = (int)rd + 1;

      arr[i] = num;

      for (int k=0; k<i; k++){
        if(arr[i] < arr[k]){
          temp = arr[k];
          arr[k] = arr[i];
          arr[i] = temp;
        }
      }
    }
    System.out.println(Arrays.toString(arr));
    System.out.println("최소값 : " + arr[0]);
    System.out.println("최대값 : " + arr[9]);
  }
}
