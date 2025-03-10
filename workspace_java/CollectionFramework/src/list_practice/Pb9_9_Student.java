package list_practice;

public class Pb9_9_Student {
  private String name;
  private int lanScore, engScore, totalScore;

  public Pb9_9_Student(){

  }

  public Pb9_9_Student(String name, int lanScore, int engScore){
    this.name = name;
    this.lanScore = lanScore;
    this.engScore = engScore;
    this.totalScore = lanScore + engScore;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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

  public int getTotalScore() {
    return totalScore;
  }

  public void setTotalScore() {
    this.totalScore = lanScore + engScore;
  }

  @Override
  public String toString() {
    return "Pb9_9_Student{" +
            "name='" + name + '\'' +
            ", lanScore=" + lanScore +
            ", engScore=" + engScore +
            ", totalScore=" + totalScore +
            '}';
  }
}
