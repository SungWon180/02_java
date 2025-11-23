package com.my.section05.typecasting;

public class Application1 {
  public static void main(String[] args) {


    /* 자동 형변환
    * 서로 다른 자료형의 연산 수행 시 컴파일러가 자동으로
    * 값이 다름 '작은' 자료형을 '큰' 자료형으로 변환하는 것
    * */

    int inum1 = 10;
    long lnum1 = inum1; // 10 -> 10L 변환되어 대입

    int inum2 = 22;
    long lnum2 = 100L;
    long result2 = inum2 + lnum2;
      System.out.println("result2" + result2);


    int inum3 = 100;
    float fnum3 = 1.5f;
    float result3 = inum3 + fnum3;

    System.out.println("result3" + result3);

    int ch5 = 'd';
    int inum5 = ch5;
    System.out.println("inum5" + inum5);
    // boolean은 제외된다.
  }
}
