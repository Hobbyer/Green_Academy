package study;

public class LgTv implements Tv{
  public void turnOn(){
    System.out.println("엘지TV : 전원 ON");
  }
  public void turnOff(){
    System.out.println("엘지TV : 전원 OFF");
  }
  public void volumeUp(){
    System.out.println("엘지TV : 볼륨 UP");
  }
  public void volumeDown(){
    System.out.println("엘지TV : 볼륨 DOWN");
  }
}
