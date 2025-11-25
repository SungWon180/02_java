package com.jinosoft.section03.constant;

public class Application1{
  public static void main(String[] args) {


    // 상수 ㅣ 변수에 한 번 대입된 값이 변하지 않는 변수

    // 상수 선언
    final int AGE;
    AGE = 1;

    // 상수 명명 규칙
    // - 대문자 + Snake-Case (_로 단어 이어쓰기)
    System.out.println("AGE = " + AGE);

    final int MAX_SCORE = 100;
    final int MIN_SCORE = 0;

    System.out.println("MAX_SCORE = " + MAX_SCORE);
    System.out.println("MIN_SCORE = " + MIN_SCORE);
    System.out.println(Math.PI);
  }
}
