package com.work.section06.ternary;

public class Application1 {
  public static void main(String[] args) {
    /* 삼항 연산자
       조건식 ? true 인경우 : false인 경우
    * */

    int num1 = 10;
    int num2 = -10;

    /*양수 음수 판별*/
    String result1  = num1>0 ? "양수" : "음수";
    String result2  = num2>0 ? "양수" : "음수";

    System.out.println("result1 = " + result1);
    System.out.println("result2 = " + result2);

    char gender1 = '남';
    char gender2 = '여';


    String result3 = gender1 == '남' ? "남자입니다." : "여자입니다.";
    String result4 = gender2 == '남' ? "남자입니다." : "여자입니다.";
    System.out.println("result3 = " + result3);
    System.out.println("result4 = " + result4);

    System.out.println("===== 삼항연산자 중첩 사용======");
    int  num =-20;
    // 정수의 종류 : 양, 0, 음
    String result =
          num == 0 ? "0입니다." :
          (num > 0 ? "양수":"음수");
    System.out.println(result);

    }

}