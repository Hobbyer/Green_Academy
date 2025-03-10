//배열의 각 요소의 값을 읽을 때는 for-each문을 사용할 수 있다.

public class ForEach {
  public static void main(String[] args) {
    int[] arr1 = {1, 5, 10};

    // for( 변수 -> 반복되는 데이터의 값을 순서대로 저장 : 반복할 데이터 ){}
    for (int e : arr1){
      System.out.print(e + " ");
    }

    System.out.println();

    String[] arr2 = {"집에", "가고", "싶다"};

    for (String a : arr2){
      System.out.print(a + " ");
    }
  }
}
