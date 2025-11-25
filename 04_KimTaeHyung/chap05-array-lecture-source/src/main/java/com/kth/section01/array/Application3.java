package com.kth.section01.array;

import java.util.Random;

public class Application3 {
  public static void main(String[] args) {

    /* [Java 불변의 법칙]
     * 1. 지역 변수(stack 영역에 할당)는 초기화 되어야지만 사용할 수 있다.
     * 2. heap 영역에 할당된 공간은 빈 칸으로 있을 수 없다.
     * */

    // 초기화 안되면 사용 불가 확인
    //int[] iarr;
    //System.out.println("iarr = " + iarr);

    /* 배열 선언 및 할당 + 초기화 */
    int[] iarr = new int[10]; // 선언 + 할당

    Random rand = new Random();
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = rand.nextInt(100); // 0~99 사이 난수
    }

    // 향상된 for문
    for (int num : iarr) {
      System.out.println("num = " + num);
    }


    /* 배열 선언과 동시에 초기화 */
    //double[] darr = {1.0, 2.3, 3.14, 4.3, 5.555};
    double[] darr = new double[]{1.0, 2.3, 3.14, 4.3, 5.555}; // 할당 + 초기화


    for (double num : darr) {
      System.out.println("num = " + num);
    }

  }
}
