package com.kth.section05.typecasting;

public class Application2 {
  public static void main(String[] args){
    /* 강제 형변환
    * - 변수명 또는 리터럴 앞에 (자료형) 형식으로
    * 강제로 바꾸고자 하는 타입을 지정하는 방법
    *
    * - 강제 형변환 시 값의 범위가 다를 경우 "데이터 손실"이 발생 할 수 있다
    * -> 역으로 데이터 손실을 활용하는 방법
    *   ex) 소수점 버림
    * */

    /* 정수 끼리 강제 형변환 */
    long lnum1 = 100L;
    int inum1 = (int)lnum1; // lnum1을 (int)로 변환해서 해석하라고 컴파일러에게 알림

    short snum1 = (short)inum1;
    byte bnum1 = (byte)snum1;
    
    /* 실수 끼리 강제 형변환 + 데이터 손실 */
    double dnum2 = 0.1234567890123456789;
    System.out.println("dnum2 = " + dnum2);
    
    float fnum2 = (float)dnum2; // 강제 형변환 수행
    System.out.println("fnum2 = " + fnum2);

    /* 정수 연산 시 데이터 손실 */
    int inum3 = 317; // 217의 2진수 : 0000 0001 0011 1101
    byte bnum3 = (byte)inum3; // 데이터 손실
    System.out.println("bnum3 = " + bnum3);

    /* 소수점 버림 */
    double dnum4 = 123.456789;
    System.out.println( (int)dnum4 );
    
    /* 숫자 -> 문자 */
    int inum5 = 99;
    char ch5 = (char)inum5;
    System.out.println("ch5 = " + ch5);

    /* 문자 -> 숫자 */
    System.out.println( (int)'Y' );

  }
}
