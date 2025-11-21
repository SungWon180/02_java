package com.mins.section6.ternary;

public class Application1 {
  public static void main(String[] args) {

    /* 삼항 연산자
    *
    *  조건식 ? true인 경우 : false 인 경우
    * */

    int num1 = 10;
    int num2 = -10;
    /* 양수 음수 판별 */
    String result1 = num1 > 0 ? "양수" : "음수";
    String result2 = num2 > 0 ? "양수" : "음수";

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

    char gender1 = '남';
    char gender2 = '여';

    String result3  = (gender1 == '예') ? "남자" : "여자";
    String result4  = (gender2 == '아') ? "남자" : "여자";

    System.out.println();
    int num = 100;

    String result = num ==0 ? "0입니다" : (num > 0 ? "양수입니다" : "음수입니다");
    System.out.println("result = " + result);

  }
}
