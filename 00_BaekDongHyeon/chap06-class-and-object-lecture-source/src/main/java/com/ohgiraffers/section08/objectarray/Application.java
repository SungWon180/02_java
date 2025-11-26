package com.ohgiraffers.section08.objectarray;

public class Application {
  public static void main(String[] args) {

    /* 객체 배열 선언 및 할당 */
    // int[] arr = new int[5];
    // new int[5] : heap 영역에 int 타입의 변수 5칸 만들기
    //  -> 한 칸 == int, 5개 묶음 == int[]

    Car[] cars = new Car[5];
    // new Car[5] : heap 영역에 Car 타입의 "참조형" 변수 5칸 만들기
    //   == Car 참조형 변수 5개 묶음

    // cars : Car 참조형 변수 5개가 묶인 배열을 참조하는 변수

    System.out.println(cars[0]); // null

    cars[0] = new Car("페라리", 300);
    cars[1] = new Car("람보르기니", 350);
    cars[2] = new Car("롤스로이스", 250);
    cars[3] = new Car("부가티베이론", 400);
    cars[4] = new Car("포터", 500);


    /* 같은 타입의 객체를 묶어놓은 배열임을 알고 있기 때문에
    * for문으로 일괄 처리를 할 수 있다.
    *  */
    for(int i=0 ; i<cars.length ; i++){
      cars[i].driveMaxSpeed();
    }

    int[] arr = {1,2,3,4,5};

    Car[] cars2 = {
        new Car("테슬라 사이버트럭", 300),
        new Car("다마스", 140),
        cars[3] // 얕은 복사
    };

    /* 향상된 for문 */
    for(Car car : cars2){
      car.driveMaxSpeed();
    }
  }
}
