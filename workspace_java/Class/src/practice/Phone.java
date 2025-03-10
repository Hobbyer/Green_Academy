package practice;

public class Phone {
  String made, modelName, color, phoneNum, phonePrice;

  public void setMadeInfo(String a){
    made = a;
  }
  public void setModelNameInfo(String a){
    modelName = a;
  }
  public void setColorInfo(String a){
    color = a;
  }
  public void setPhoneNumInfo(String a){
    phoneNum = a;
  }
  public void setPriceInfo(String a){
    phonePrice = a;
  }

  public void printPhoneInfo(){
    System.out.println("제조사 : " + made);
    System.out.println("모델명 : " + modelName);
    System.out.println("색상 : " + color);
    System.out.println("휴대폰 번호 : " + phoneNum);
    System.out.println("가격 : " + phonePrice);
  }
}
