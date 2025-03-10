import java.util.Arrays;

public class Array_5 {
  public static void main(String[] args) {
    //기본자료형 예시
    int a = 10;
    int b = 20;

    a = b;
    b = 30;

    System.out.println("a = " + a);
    System.out.println("b = " + b);

    System.out.println();

    //배열(참조자료형) 예시
    int[] arr1 = new int[2];
//    arr1 = 10; // 정수형 배열 = 정수, 자료형이 다름
    arr1[0] = 10;
    arr1[1] = 60;

    int[] arr2 = new int[1];
    arr2[0] = 80;

//    arr1 = arr2  // 배열자체를 변경 저장.

    arr1[0] = arr2[0]; //
    arr2[0] = 30;

    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
  }
}
