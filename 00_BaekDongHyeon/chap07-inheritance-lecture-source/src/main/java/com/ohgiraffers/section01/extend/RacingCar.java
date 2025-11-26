package com.ohgiraffers.section01.extend;

/* Car 클래스를 상속 */
public class RacingCar extends Car{


  /* RacingCar 기본 생성자*/
  public RacingCar(){
    super();
    System.out.println("RacingCar 기본 생성자 호출됨");
  }

  /* RacingCar 만의 기능 */
  public void useBooster(){
    System.out.println("부스터를 사용합니다.");
  }

}
