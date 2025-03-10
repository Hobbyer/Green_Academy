package practice;

public class Problem8_1_Sungjuk {
  private int lanScore, engScore, mathScore, totalScore;
  private double avgScore;

  public Problem8_1_Sungjuk(){

  }

  public Problem8_1_Sungjuk(int lanScore, int engScore, int mathScore){
    this.lanScore = lanScore;
    this.engScore = engScore;
    this.mathScore = mathScore;
    this.totalScore = lanScore + engScore + mathScore;
    this.avgScore = totalScore / 3.0;
  }

  public int getLanScore() {
    return lanScore;
  }

  public void setLanScore(int lanScore) {
    this.lanScore = lanScore;
  }

  public int getEngScore() {
    return engScore;
  }

  public void setEngScore(int engScore) {
    this.engScore = engScore;
  }

  public int getMathScore() {
    return mathScore;
  }

  public void setMathScore(int mathScore) {
    this.mathScore = mathScore;
  }

  public int getTotalScore() {
    return totalScore;
  }

  public void setTotalScore() {
    totalScore = lanScore + engScore + mathScore;
  }

  public double getAvgScore() {
    return avgScore;
  }

  public void setAvgScore() {
    avgScore = totalScore / 3.0;
  }
}
