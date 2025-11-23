package com.ohgiraffers.section04.overflow;

public class Application1 {
  public static void main(String[] args) {
    // overflow 확인
    /* 오버 플로우 - 초기화 외 연산 수행 시 저장되는 값이 변수 값의 범위를 초과할 때 발생하는 현상 */

    byte bnum = 127;
    System.out.println("bnum = " + bnum); // 127
    bnum++; // bnum 값을 1 증가
    System.out.println("bnum = " + bnum); // ? 값의 범위를 초과해서 -128으로 넘어감

    byte bnum2 = -128;
    System.out.println("bnum2 = " + bnum2);
    bnum2--; // bnum 값을 1 감소
    System.out.println("bnum2 = " + bnum2);

    /* 오버플로우 발생 여부는 연산 후에만 (프로그램 실행 중) 에만 알 수 있기 때문에
    * 처음 코드를 작성할 때 저장되는 값의 범위를 잘 예측해야 한다. */

    long lnum = 1; // 1이라는 값 저장하기 위해 8byte 사용 --> 비효율적


  }
}
