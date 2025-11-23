package com.work.section04.overflow;

public class Application1 {
  public static void main(String[] args) {
    /*오버 플로우
    * - 초기화 외 연산 수행 시 저장되는 값이 변수 값으 범위를 초과할 때 발생하는 현상*/
    byte bnum = 127;
    System.out.println("bnum = " + bnum);
    bnum++;
    System.out.println("bnum = " + bnum);
    
    
    byte bnum2 = -128;
    System.out.println("bnum2 = " + bnum2);
    bnum2--;
    System.out.println("bnum2 = " + bnum2);

    /*오버플로우는 발생 여부
    * 연산 후에만( 프로그램 실행 중에만 알수 있다 )*/


  }
}
