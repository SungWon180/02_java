package com.jinosoft.section01.arithmetic.section06.ternary;

public class Application01 {
  public static void main(String[] args) {
    /* 삼항 연산자
    *
    * 조건식 ? true인 경우 : false인 경우;
    *  */

    int num1 = 10, num2 = -10;

    /* 양수 음수 판별 */
    String result = num1 > 0 ? "양수" : "음수";
    String result2 = num2 > 0 ? "양수" : "음수";

    System.out.println("result = " + result);
    System.out.println("result2 = " + result2);

    
  }
}
