package com.mycompany.section03.abstraction;

public class CarRacer {

  // field
  private Car car = new Car();

  public void startUp(){
    car.startUp();
  }

  public void stepAccelerator(){
    car.go();
  }

  public void stepBreak(){
    car.stop();
  }
  public void turnOff(){
    car.turnOff();
  }
}
