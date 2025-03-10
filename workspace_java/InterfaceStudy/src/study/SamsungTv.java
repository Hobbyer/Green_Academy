package study;

public class SamsungTv implements Tv {
  @Override
  public void turnOn(){
    System.out.println("삼성TV : 전원 ON");
  }
  @Override
  public void turnOff(){
    System.out.println("삼성TV : 전원 OFF");
  }
  @Override
  public void volumeUp(){
    System.out.println("삼성TV : 볼륨 UP");
  }
  @Override
  public void volumeDown(){
    System.out.println("삼성TV : 볼륨 DOWN");
  }
}
