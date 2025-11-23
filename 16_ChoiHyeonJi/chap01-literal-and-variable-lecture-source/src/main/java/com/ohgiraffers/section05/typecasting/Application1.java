package com.ohgiraffers.section05.typecasting;

public class Application1 {
  public static void main(String[] args) {  //패키지명은 언더스코어 ㄴㄴ 띄쓰 ㄴㄴ 소문자로 써야댐
    /* 자동 형변환 - 서로 다른 자료형의 연산 수행 시
    컴파일러가 자동으로 값의 범위가 '작은' 자료형을 "큰" 자료형으로 변환하는 것 */

    long inum1 = 10;
    long lnum1 = inum1; // 10 -> 10L 변환되어 대입

    int inum2 = 20;
    long lnum2 = 100L;
    long result2 = inum2 + lnum2; // 20 + 100L -> 20L + 100L = 120L 아무 생각 업싱 int 적으면 빨간줄 생각해서 타입 적기

    int inum3 = 100;
    float fnum3 = 1.5f;
    float result3 = inum3 + fnum3; // 100 + 1.5f -> 100.0f + 1.5f = 101.5f

    System.out.println("result3 = " + result3);

    /* long(8byte) -> float(4byte지만 표현핤 수 있는 범위가 더 넓음) 확인 */
    long lnum4 = 200L;
    float fnum4 = lnum4; // 에러 ㄴㄴ

    /* chat -> int 변환 확인 */
    char ch5 = '최'; // 몇번째에잇울까 내 이름..
    int inum5 = ch5;
    System.out.println("inum5 = " + inum5);

    /* boolean 은 논리형으로써 순자 타입의 형ㅎ변환 규칙에서 제외ㅗ딘다. */

  }
}
