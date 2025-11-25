package com.jinosoft.level01.basic;

public class Application {
  public static void main(String[] args) {

    Calculator calc = new Calculator();

    calc.checkMethod();

    // 10까지 합 출력
    int result1 = calc.sum1to10();
    System.out.println("1부터 10까지의 합 : " + result1);

    // 두 수 중 큰 수 출력
    calc.checkMaxNumber(10, 20);

    // 두 수의 합 출력
    int result2 = calc.sumTwoNumber(10, 20);
    System.out.println("10과 20의 합은 : " + result2);

    // 두 수의 차 출력
    int result3 = calc.minusTwoNumber(10, 5);
    System.out.println("10과 5의 차는 : " + result3);
  }
}
