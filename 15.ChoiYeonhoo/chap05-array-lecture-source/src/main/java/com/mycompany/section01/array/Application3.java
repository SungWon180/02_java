package com.mycompany.section01.array;

import java.util.Random;

public class Application3 {
  public static void main(String[] args) {

    /* [Java 불변의 법칙]
     * 1. 지역 변수(Stack 영역에 할당)는 초기화 되어야지만 사용할 수 있다.
     * 2. heap 영역에 할당된 공간은 빈칸으로 있을 수 없다. -> 기본형이 자동으로 입력됨
     * */

    // 초기화 안되면 사용 불가 확인
//    int[] iarr;
//    System.out.println("iarr = " + iarr); // 에러 발생

    /* 배열 선언 및 할당  + 초기화 */
    int[] iarr = new int[10]; // 선언 + 할당

    Random rand = new Random();
    for (int i = 0; i < iarr.length; i++) {
      iarr[i] = rand.nextInt(100); // 0~99 사이 난수로 초기화
    }

    // 향상된 for문
    for (int num : iarr) {
      System.out.println("num = " + num);
    }

    /* 배열 선언과 동시에 초기화 */
    double[] darr = {1.1, 2.2, 3.3, 4.4, 5.5};
    for (double num : darr) {
      System.out.println("num = " + num);
    }

  }
}
