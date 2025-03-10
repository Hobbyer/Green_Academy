public class 출력문_2 {
  public static void main(String[] args) {

    // 소괄호 안의 내용이 연산 가능하면 연산 결과를 출력
    System.out.println(5 + 5);
    // "쌍따옴표"에 작성된 몯느 내용은 문자열로 인식
    System.out.println("5 + 5");

    // 숫자 + '문자' or "문자열"의 합은 나열한 결과로 나온다.
    System.out.println(3 + "삼");
    System.out.println(3 + "3");
    // 문자(문자열) + 문자(문자열)의 합은 나열한 결과로 나온다.
    System.out.println("hi" + "hello");

    System.out.println(3 + 5 + "a" + 5);
  }
}
