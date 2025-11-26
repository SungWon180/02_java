package com.ohgiraffers.section01.extend;

public class F1Car extends RacingCar {
  
  public F1Car(){
    super();
    System.out.println("F1Car 기본 생성자 호출됨");
  }

  // Car -> RacingCar -> F1Car
  @Override
  public void stop() {
    System.out.println("F1 자동차가 멈춥니다.");
  }

}
