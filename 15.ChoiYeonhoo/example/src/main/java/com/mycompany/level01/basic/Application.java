package com.mycompany.level01.basic;

public class Application {
  public static void main(String[] args) {
    Calculator cal = new Calculator();

    cal.checkMethod(); //메소드 호출 확인용 메소드 호출
    int sum1To10 = cal.sum1to10();//함수를 호출하여 1~10까지의 합을 리턴 받아 출력
    System.out.println("sum1To10 = " + sum1To10);
    cal.checkMaxNumber(10,20);//10, 20 두 개의 정수를 매개변수로 하여 큰 값 출력하는 메소드 호출
    int sum10And20 = cal.sumTwoNumber(10,20);//10, 20 두 개의 정수를 매개변수로 하여 두 수를 더하는 메소드 호출 후 리턴값 출력
    System.out.println("sum10And20 = " + sum10And20);
    int minus10And5 = cal.minusTwoNumber(10,5);//10, 5 두 개의 정수를 매개변수로 하여 두 수의 차를 구하는 메소드 호출 후 리턴값 출력
    System.out.println("minus10And5 = " + minus10And5);

  }
}
