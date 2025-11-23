package com.work.section05.typecasting;

import java.time.Year;

public class Application2 {
  public static void main(String[] args) {
//    강제 형변환
//    - 변수명 또는 리터럴 앞에 ( 자료형 ) 형식으로 강제로 바꾸고자 하는 타입을 지정하는 방법
//
//    - 강제 형변환 시 값의 범위가 다를경우 "데이터 손실" 이 일어날수 있다.
//    -> 역으로 데이터 손실을 활용하는 방법
//    ex) 소수점 버림

//    정수 끼리 강제 형변환

    long lnum1 = 100L;
    int inum1 = (int)lnum1;
    System.out.println("inum1 = " + inum1); //lnum1을 (int)로 변환해서 해석하라고 컴파일러에게 알림을 함
    short snum1 = (short)inum1;
    byte bnum1 = (byte)inum1;


    /*실수 끼리 강제 형변환 + 데이터 손실*/
    double dnum2 = 0.1234521321222222222222226435345345;

    System.out.println("dnum2 = " + dnum2);

    float fnum2 = (float) dnum2;
    System.out.println("fnum2 = " + fnum2);

    /*정수 연산시 데이터 손실*/
    int inum3 = 317; // 217의 2진수 :
    byte bnum3 =(byte)inum3;
    System.out.println("bnum3 = " + bnum3);

    /* 소수점 버림*/
    double dnum4 = 123.44578;
    System.out.println((int)dnum4);

    /* 숫자 -> 문자*/
    int inum5 = 99;
    char ch5 = ((char) inum5);
    System.out.println("ch5 = " + ch5);

    /* 문자 -> 숫자*/
    System.out.println((int)'e');
  }
}
