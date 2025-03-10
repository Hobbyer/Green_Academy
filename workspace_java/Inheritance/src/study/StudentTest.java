package study;

public class StudentTest {
  public static void main(String[] args) {
    Student s1 = new Student(2, "김자바");
    Student s2 = new Student(2, "김자바");

    int num1 = 1;
    int num2 = num1;
    num2 = 2;

    int[] arr1 = {1, 2, 3};
    int[] arr2 = arr1;
    arr2[0] = 5;
    // arr1, arr2 모두 {5, 2, 3}이 된다.

    String a = "java";
    String b = a;
    b = "python";
    // a = "java", b = "python" 으로 출력된다.
    // 주소값이 바뀜. String 자료형 성질 때문에 같은 주소값의 데이터를 바라보다가 데이터를 변경하면 새로운 주소를 만든 후 새로운 데이터 생성한 후 해당 주소를 바라본다.

    String str1="react";
    String str2="react";
//    str2 = "coffee";
    String str3=new String("java");
    String str4=new String("java");

    // == 두 객체가 주소값이 같은지 비교하는 연산
    if(str1 == str2){
      System.out.println("str1과 str2는 같습니다.");
      System.out.println(System.identityHashCode(str1));
      System.out.println(System.identityHashCode(str2));
    } else {
      System.out.println(System.identityHashCode(str1));
      System.out.println(System.identityHashCode(str2));
    }
    System.out.println();
    if(str3 == str4){
      System.out.println("str3과 str4는 같습니다.");
    } else {
      System.out.println(System.identityHashCode(str3));
      System.out.println(System.identityHashCode(str4));
    }
    System.out.println();
    if(arr1[0] == arr2[0]){
      System.out.println("arr1[0]과 arr2[0]는 같습니다.");
      System.out.println(System.identityHashCode(arr1));
      System.out.println(System.identityHashCode(arr2));
    } else {
      System.out.println(System.identityHashCode(arr1));
      System.out.println(System.identityHashCode(arr2));
    }
    System.out.println();
    if(a == b){
      System.out.println("a와 b는 같습니다.");
      System.out.println(System.identityHashCode(a));
      System.out.println(System.identityHashCode(b));
    } else {
      System.out.println("a와 b는 다릅니다.");
      System.out.println(System.identityHashCode(a));
      System.out.println(System.identityHashCode(b));
    }
    System.out.println();
    if(num1 == num2){
      System.out.println("num1과 num2는 같습니다.");
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(System.identityHashCode(num1));
      System.out.println(System.identityHashCode(num2));
    } else {
      System.out.println("num1과 num2는 다릅니다.");
      System.out.println(num1);
      System.out.println(num2);
      System.out.println(System.identityHashCode(num1));
      System.out.println(System.identityHashCode(num2));
    }

    System.out.println(s1.equals(s2)); // false : 두 객체의 주소값이 같은지 판단(?) 우리가 일반적으로 알고있는 같다, 다르다를 구현하기 위해서는 오버라이딩으로 재정의해줘야한다.
  }
}
