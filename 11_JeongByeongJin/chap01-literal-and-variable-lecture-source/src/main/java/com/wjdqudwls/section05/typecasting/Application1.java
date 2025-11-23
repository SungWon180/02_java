package com.wjdqudwls.section05.typecasting;

public class Application1 {
  public static void main(String[] args){

    /* 자동 형변환
    * - 서로 다른 자료형의 연산 수행 시 컴파일러가 자동으로
    *   값의 범위가 '작은' 자료형을 "큰"자료형으로 변환하는 것
    * */
    int inum1 = 10;
    long lnum1 = inum1; // 10 -> 10L
    System.out.println(lnum1); // 10L

    int inum2 = 20;
    long lnum2 = 100L;
    long result2 = inum2 + lnum2; // 20 + 100L -> 20L + 100L -> 120L
    System.out.println("result2 = " + result2);

    int inum3 = 100;
    float fnum3 = 1.5f;
    float result3 = inum3 + fnum3;
    // 100 + 1.5f -> 100f + 1.5f -> 101.5f
    System.out.println("result3 = " + result3);
    /* long(8byte) -> float(4byte) 확인 */

    long lnum4 = 200L;
    float fnum4 = lnum4; // 에러 없음

    /* char -> int 변환 확인 */
    char ch5 = '정';
    int inum5 = ch5;
    System.out.println("inum5 = " + inum5);

    /* boolean은 논리형으로써 숫자 타입의 형변환 규칙에서 제외한다. */

  }
}
