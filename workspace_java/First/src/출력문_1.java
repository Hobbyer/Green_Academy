public class 출력문_1 {
    public static void main(String[] args) {

        // 소괄호 안의 내용을 출력(한줄 개행 포함)
        System.out.println("hello~");
        System.out.println("hello~");

        // 소괄호 안의 내용을 출력(한줄 개행 미포함)
        System.out.print("hello~");
        System.out.print("hello~");

        // 한 줄 개행만 한다
        System.out.println();

        // 숫자(int)를 출력할 때는 쌍따옴표 넣지 않음!
        // 문자(Char)를 출력할 때는 '작은따옴표'를 무조건 써야한다!
        // 문자열(String)을 출력할 때는 "쌍따옴표"를 무조건 써야한다!
        System.out.println(5); // 숫자(Int)
        System.out.println('5'); // 문자(Char)
        System.out.println("5"); // 문자열(String)
    }
}
