package com.ohgiraffers.section03.abstraction;

public class CarRacer
{
    // 필드
    private Car car = new Car();

    public void startUp()
    {
        car.startUp();
    }
    public void stepAccelerator()
    {
        car.go();
    }
    public void stepBreak()
    {
        car.stop();
    }
    public void turnOff()
    {
        car.turnOff();
    }
}
