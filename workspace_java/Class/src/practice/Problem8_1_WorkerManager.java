package practice;


public class Problem8_1_WorkerManager {
  public static void main(String[] args) {
    Problem8_1_Worker w = new Problem8_1_Worker();
    w.setInfo("김자바", 20, "울산");
    w.setWorkInfo("삼성", "무선사업부", 50000);
    w.displayWorker();
  }
}
