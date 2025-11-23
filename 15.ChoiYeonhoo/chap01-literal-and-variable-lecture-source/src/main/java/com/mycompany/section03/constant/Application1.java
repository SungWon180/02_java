package com.mycompany.section03.constant;

public class Application1 {
  public static void main(String[] args) {
    /* 상수 : 변수에 한 번 대입된 값이 변하지 않는 변수 */

    final int AGE;
    AGE = 20; // 상수 선언 후 초기화 가능, 이후에는 값 변경 불가
//    AGE = 19; // Error 발생

    /* 상수 명명 규칙 */
    // - 대믄자 + Snake-Case
    final int max = 100;
    // 소문자도 가능은 하지만, 변수화 구분을 위해 대문자 사용 권장
    final int MAX_SCORE = 100;
    final int MIN_SCORE = 0;

    /* 상수 사용 방법 == 변수 사용 방법 */

    System.out.println("최대 점수 :  = " + MAX_SCORE);
    System.out.println("최소 점수 :  = " + MIN_SCORE);
    System.out.println(Math.PI);
    System.out.println(Math.E);
    System.out.println(Long.MAX_VALUE);
  }
}
