package study;

// 클래스 자료형을 배열로 활용하기
public class SmartPhoneTest {
  public static void main(String[] args) {
    // 스마트폰 5개를 저장할 수 있는 배열 phones를 생성
    // 자료형(클래스) 변수명 = new 자료형(클래스)[갯수];
    SmartPhone[] phoneArr = new SmartPhone[5];

    //스마트폰 객체 생성
    SmartPhone p1 = new SmartPhone("s1", 10000, 18.5);
    SmartPhone p2 = new SmartPhone("s11", 20000, 19.5);
    SmartPhone p3 = new SmartPhone("s22", 15000, 10.5);
    SmartPhone p4 = new SmartPhone("s23", 30000, 11.5);
    SmartPhone p5 = new SmartPhone("s24", 45000, 13.5);

    phoneArr[0] = p1;
    phoneArr[1] = p2;
    phoneArr[2] = p3;
    phoneArr[3] = p4;
    phoneArr[4] = p5;

    // phoneArr 배열에 저장된 모든 폰의 모델명, 가격, 크기를 출력
//    for (int i=0; i<phoneArr.length; i++){
//      phoneArr[i].printInfo();
//      System.out.println();
//    }

    // phoneArr 배열에서 0번째에 저장된 폰의 가격을 출력
//    System.out.println(phoneArr[0].getPrice());

    //phoneArr 배열에서 크기가 13inch이상인 폰의 모델명을 모두 출력
    for(int i=0; i< phoneArr.length; i++){
      if (phoneArr[i].getInch() >= 13){
        System.out.println(phoneArr[i].getModelName());
      }
    }

    System.out.println();

    for(SmartPhone e : phoneArr){
      if(e.getInch() >= 13){
        System.out.println(e.getModelName());
      }
    }
  }
}
