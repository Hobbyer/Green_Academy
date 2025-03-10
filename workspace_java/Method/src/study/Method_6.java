package study;

public class Method_6 {
  public static void main(String[] args) {
    // 매개변수로 정수를 하나 전달받아, 전달받은 정수가 짝수라면 "짝수"라는 문자열을 리턴, 호수라면 "홀수"라는 문자열을 리턴

    System.out.println(aaa(1487));
  }

  public static String aaa(int a){
    return (a % 2 == 0) ? "짝수" : "홀수";
  }
}
