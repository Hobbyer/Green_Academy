package practice;

public class Problem8_1_StudentManager {
  public static void main(String[] args) {
    Problem8_1_PersonInfo p1 = new Problem8_1_PersonInfo();
    Problem8_1_Sungjuk s1 = new Problem8_1_Sungjuk();

    Problem8_1_Student st = new Problem8_1_Student();

    st.setInfo("김자바", 20, "울산");
    st.setSungjuk(80, 70, 90);
    st.displayStudentInfo();
  }
}
