package com.ohgiraffers.section06.ternary;

public class Application1 {
  public static void main(String[] args) {
    /* 삼항 연산자
    * 조건식 ? true인 경우: false 인 경우
    *
    *
    *
    * */

    /* 삼항 연산자 */
    int num1 = 10;
    int num2 = -10;

    /* 양수/음수 판별 */
    String result1 = (num1 > 0)? "양수" : "음수";
    String result2 = (num2 > 0)? "양수다.": "양수가 아니다.";

    System.out.println("num1은 " + result1);
    System.out.println("num2는 " + result2);

    char gender1 = '남';
    char gender2 = '여';

    String result3 = (gender1 == '남') ? "남자입니다." : "여자입니다";
    String result4 = (gender2 == '남') ? "남자입니다." : "여자입니다";

    System.out.println("===== 삼항 연산자 중첩 사용 =====");
    int num = -10;

    // 정수의 종류 : 양의 정수, 0, 음의 정수 괄호 없어도 우선순위 때문에 그대로 실행됨
    String result =  num == 0 ? "0 입니다" : num > 0 ? "양수 입니다" : "음수입니다.";
    System.out.println("result = " + result);




  }
}
