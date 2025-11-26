package com.ohgiraffers.section03.abstraction;

public class Car {
    // attributes
    private boolean isOn;
    private int speed;

    // methods
    public void startUp() {
        if (isOn) {
            System.out.println("이미 시동이 걸려있습니다.");
        }else {
            System.out.println("시동을 걸었습니다.");
            this.isOn = true;
        }
    }

    public void go() {
        if (isOn) {
            System.out.println("차가 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
        }else {
            System.out.println("시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }

    public void stop() {
        if (!isOn) {
            if (this.speed > 0){
                System.out.println("브레이크를 밟았습니다.");
                this.speed -= 10;
                System.out.println("현재 차의 시속은 " + this.speed + "km/h 입니다.");
            }else {
                System.out.println("차가 멈춰있습니다.");
            }
        }
    }

    public void turnoff() {
        if (isOn) {
            if (this.speed > 0) {
                System.out.println("달리는 중에는 시동을 끌 수 없 습 니 다.");
            }else {
                System.out.println("시동을 끕니다.");
                this.isOn = false;
            }
        }else {
            System.out.println("이미 시동이 꺼짐.");
        }
    }

}
