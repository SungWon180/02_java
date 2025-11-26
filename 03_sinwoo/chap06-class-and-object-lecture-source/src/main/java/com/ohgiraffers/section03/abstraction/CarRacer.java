package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    // attributes
    private Car car = new Car();

    // methods
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
        car.turnoff();
    }

}
