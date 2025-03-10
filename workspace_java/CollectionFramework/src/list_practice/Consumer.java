package list_practice;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
  private String name, idNum, contact;
  private Account acc;

  //List<Consumer> list; // 하나의 고객정보에 대한 내용을 만드는 클래스이다.

  public Consumer(){
    acc  = new Account();
    //list = new ArrayList<>();
  }

  public Consumer(String name, String idNum, String contact){
    this.name = name;
    this.idNum = idNum;
    this.contact = contact;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getIdNum() {
    return idNum;
  }

  public void setIdNum(String idNum) {
    this.idNum = idNum;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public Account getAcc() {
    return acc;
  }

  public void setAcc(Account acc) {
    this.acc = acc;
  }

  @Override
  public String toString() {
    return "Consumer{" +
            "name='" + name + '\'' +
            ", idNum='" + idNum + '\'' +
            ", contact='" + contact + '\'' +
            ", acc=" + acc +
            '}';
  }
}
