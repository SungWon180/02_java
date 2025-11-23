package com.beyond.section04.overflow;

public class Application1 {
  public static void main(String[] args) {

    /* 오버 플로우
      - 초기화 외 연산 수행 시 저장되는 값이
        변수 값의 범위를 초과할 때 발생하는 현상
    */
    byte bnum = 127;
    System.out.println("bnum = " + bnum); // 127
    bnum++; // bnum 값을 1 증가
    System.out.println("bnum = " + bnum); // ? -> -128

    byte bnum2 = -128;
    System.out.println("bnum2 = " + bnum2);
    bnum2--;
    System.out.println("bnum2 = " + bnum2);

    /* 오버 플로우 발생 여부는
    * 연산 후에만 (프로그램 실행 중) 알 수 있기 때문에
    * 처음 코드를 작성할 때 저장되는 값의 범위를 잘 예측해야 한다!
    * */
  }
}
