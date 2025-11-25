package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application3 {
  public static void main(String[] args) {
    /* java 불변의 법칙
     * 1. 지역 변수(stack 영역에 할당)는 초기화 되어야지만 사용할 수 있다.
     * 2. heap 영역에 할당된 공간은 빈 칸으로 있을 수 없다. */

    //초기화 안되면 사용 불가 확인
    //int[] iarr;
    //System.out.println("iarr = " + iarr);

    /* 배열 선언 및 할당 + 초기화 */
    int[] iarr = new int[10]; //선언 + 할당
    Random rand = new Random();

    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = rand.nextInt(100); // 0~99 사이 난수로 초기화

      // 향상된 for 문
      for (int num : iarr) {
        System.out.println("num = " + num);
      }
    }

    //double[] darr; //배열 선언
    //darr = new double[10]; // 할당
    //darr[0] = 1.2; //초기화

    //double[] darr; // 선언
    // darr = {1.2, 2.3, 3.14, 4.2, 5.555} // 할당 + 초기화 -> 에러
    // darr = new double[]{1.2, 2.3, 3.14, 4.2, 5.555} //할당+초기화

    /* 배열 선언과 동시에 초기화 */
    double[] darr = {1.2, 2.3, 3.14, 4.2, 5.555};    // darr  = new double[5] darr[0] = 1.0


    for (double num : darr) {
      System.out.println("num = " + num);
    }

  }

}
