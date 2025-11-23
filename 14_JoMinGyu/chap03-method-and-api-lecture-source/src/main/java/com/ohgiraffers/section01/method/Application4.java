package com.ohgiraffers.section01.method;

public class Application4 {

  /**
   * 전달 받은 두 실수를 더해서 반환하는 메서드
   * @param a
   * @param b
   * @return
   */
  public double twoNumberSum(double a, double b) {
    return a + b;
  }

  Application4 application4 = new Application4();

  double result2 = application4.twoNumberSum(10.3, 20.5);
}
