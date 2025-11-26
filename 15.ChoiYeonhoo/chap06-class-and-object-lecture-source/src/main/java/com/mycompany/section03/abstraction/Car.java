package com.mycompany.section03.abstraction;

public class Car {

  // field
  private boolean isOn; // 시동 여부
  private int speed; // 속도

  public void startUp(){
    if (isOn) {
      System.out.println("이미 시동이 걸려 있습니다.");
    } else {
      System.out.println("시동을 걸었습니다.");
      this.isOn = true;
    }
  }
  public void go(){
    if(isOn){
      if (this.speed == 0) {
        System.out.println("차가 움직이기 시작합니다.");
      }
      System.out.println("차가 움직입니다.");
      this.speed += 10;
      System.out.println("현재 차의 속력은 " + this.speed + "km/h 입니다.");
    } else {
      System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
    }
  }

  public void stop(){
    if(isOn){
      System.out.println("브레이크를 밟았습니다.");
      if (this.speed > 0) {
        this.speed -= 10;
        System.out.println("현재 차의 속력은 " + this.speed + "km/h 입니다.");
      } else {
        this.speed = 0;
        System.out.println("차가 멈췄습니다.");
      }

    } else {
      System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
    }
  }

  public void turnOff(){
    if(isOn) {
      if(speed > 0){
        System.out.println("달리는 중에는 시동을 끌 수 없습니다.");
      } else {
        System.out.println("시동을 끕니다.");
        this.isOn = false;
      }
    } else {
      System.out.println("이미 시동이 꺼져 있는 상태입니다.");
    }
  }

}
