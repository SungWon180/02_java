package com.ohgiraffers.section01.extend;

/* 부모 클래스(Super Class) */
public class Car {

  private boolean runningStatus;

  public Car(){
    System.out.println("Car 기본 생성자 호출됨.");
  }
  
  public void run(){
    runningStatus = true;
    System.out.println("자동차가 달린다.");
  }
  
  public void stop(){
    runningStatus = false;
    System.out.println("자동차가 멈춘다.");
  }

  public void soundHorn(){
    if(runningStatus){
      System.out.println("빵! 빵!");
    } else{
      System.out.println("주행 중이 아닙니다.");
    }
  }

}
