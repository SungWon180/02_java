package com.mycompany.section05.typecasting;

public class Application2 {
  public static void main(String[] args) {
    /* 강제 형변환
    * - 변수명 또는 리터럴 앞에 (자료형) 형식으로
    * 강제로 바꾸고자 하는 타입을 지정하는 방법
    *
    * - 강제 형변환 시, 값의 범위가 다를 경우, "데이터 손실"이 발생 할 수 있다.
    * - > 역으로 데이터 손실을 활용하는 방법
    *  ex) 소수점 버림, 
    * */
    
    /* 정수끼리 강제 형변환 */

    long lNum1 = 100L;
//    int iNum1 = lNum1; // 에러 발생
    int iNum1 = (int)lNum1; // lNum을 (int)로 변환해서 해석하라고
                            // 컴파일러에게 알림

    short sNum1 = (short) iNum1;
    byte bNum1 = (byte) iNum1;

    /* 실수 끼리 강제 형변환 + 데이터 손실 */

    double dNum2 = 0.123456790123456790123456790123456790123456790123456790;
    System.out.println("dNum2 = " + dNum2);

    float fNum2 = (float) dNum2;
    System.out.println("fNum2 = " + fNum2);

    /* 정수 연산 시 데이터 손실 */
    int iNum3 = 317; // 317의 이진수 : 0000 0001 0011 1101
    byte bNum3 = (byte) iNum3;
    System.out.println("bNum3 = " + bNum3); // 61로 줄어듬 0001 0000 0000 부분이 날아감

    /* 소수점 버림 */
    double dNum4 = 123.456789;
    System.out.println((int) dNum4 );

    /* 숫자 -> 문자 */

    int iNum5 = 99;
    char ch5 = (char)iNum5;
    System.out.println("ch5 = " + ch5);

    /* 문자 - 숫자 */
    System.out.println( (int)'Y');
  }
}
