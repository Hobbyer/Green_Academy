package study;

import java.util.Arrays;

public class StringTest {
  public static void main(String[] args) {
    String s1 = "Simple";
    String s2 = "Java";

    String s3 = s1.concat(s2);

    System.out.println(s3); // concat : 두 문자열을 나열한 결과를 리턴.

    int len = s3.length();
    System.out.println(len);

    String vo = String.valueOf(10.5); // String.valueof() : 매개변수로 전달된 데이터를 문자열로 변환해서 리턴.

    String data = "hi java";
    String sub = data.substring(3); // substring : 문자열 n번째~ (m-1)번째까지 출력! 첫 번째 매개변수인 index값만 넣으면 index값부터 끝까지!
    System.out.println(sub);

    String sub2 = data.substring(1, 4); // substring : 문자열 n번째~ (m-1)번째까지 출력! 첫 번째 매개변수인 index값만 넣으면 index값부터 끝까지!
    System.out.println(sub2);

    String data2 = "a,b,c";
    String[] sArr = data2.split(","); // split : 매개변수 문자를 기준으로 문자열을 분리 후 문자형배열로 리턴.
    System.out.println(Arrays.toString(sArr));
    String[] sArrT = data2.split("a"); // split : 매개변수 문자를 기준으로 잘라낸 후 문자형 배열로 리턴.
    System.out.println(Arrays.toString(sArrT));

    String data3 = data2.replace(",", "-"); // replace : 문자열 중에서 첫 번째 매개변수와 일치하는 문자를 두 번째 매개변수 문자로 변경.
    System.out.println(data3);
  }
}
