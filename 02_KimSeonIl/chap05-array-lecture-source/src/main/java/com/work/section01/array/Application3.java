package com.work.section01.array;

import java.util.Random;

public class Application3 {
  public static void main(String[] args) {

    /*Java 불변의 법칙 절대 불변의 법칙  같은거
     * 1. 지역 변수(stack 영역에 할당)는 초기화 되어야지만 사용할 수 있다.
     * 2. heap 영역에 할당된 공간은 빈칸으로 있을수 없다.
     * */

//    //초기화 안되면 사용 불가 확인
//    int[] iarr = new int[5];
//    System.out.println("iarr = " + iarr);

    /* 배열 선언 및 할당 + 초기화*/
    int[] iarr = new int[10];
    Random rand = new Random();
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = rand.nextInt(100) + 1;

      //향상된 포문
      for (int num : iarr) {
        System.out.println("num = " + num);

      }
      /* 배열 선언과 동시에 초기화*/
      double[] darr = {1.0, 2.0, 324.2, 53534.2};
      for (double v : darr) {
        System.out.println("v = " + v);
      }
    }
  }
}
