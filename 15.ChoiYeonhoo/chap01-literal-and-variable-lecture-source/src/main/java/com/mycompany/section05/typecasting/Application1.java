package com.mycompany.section05.typecasting;

public class Application1 {
  public static void main(String[] args) {

    /* 자동 형변환
    * - 서로 다른 자료형의 연산 수행 시, 컴파일러가 자동으로
    * 값의 범위가 '작은' 자료형을 "큰" 자료형으로 변환하는 것
    * */
    int iNum1 = 10;
    long lNum1 = iNum1; // 10 - 10L 로 자동 형변환되어 대입

    int iNum2 = 20;
    long lNum2 = 100L;

    long result = iNum2 + lNum2; // 20 + 10L -> 20L + 100L -> 120L

    int iNum3 = 100;
    float fNum3 = 1.5f;

    float result2 = iNum3 + fNum3; // 100 + 1.5f -> 100.0f + 1.5f -> 101.5f

    System.out.println("result2 = " + result2);

    /* long(8byte) -> float(4byte) 확인 */
    long lNum4 = 200L;
    float fNum4 = lNum4; // 에러 없음
    System.out.println("fNum4 = " + fNum4);

    /* char -> int 변환 확인 */
    char ch5 = '최';
    int iNum5 = ch5;
    System.out.println("iNum5 = " + iNum5);

    /* boolean은 논리형으로써 숫자 타입의 형변환 규칙에서 제외된다. */
  }
}
