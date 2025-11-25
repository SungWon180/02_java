package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
     
     
      /* 초기화 안되면 사용 불가 확인
      int iarr;
        System.out.println("iarr = " + iarr);
       int[] iarr;
        System.out.println("iarr = " + iarr);*/

        /* 배열 선언 및 할당 + 초기화 */
        int[] iarr = new int[10]; // 선언 + 할당 
        Random rand = new Random();

        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = rand.nextInt(100); // 0~99 사이 난수로 초기화= 0~99사이 난수로 대입
        }

        // 향상된 for문
        for (int num : iarr) {
            System.out.println("num = " + num);
        }

        /* 배열 선언과 동시에 초기화 */
        double[] darr = {1.0, 2.3, 3.14, 4.3, 5.555}; // 이식은 darr = new double[5] 

        for (double num : darr) {
            System.out.println("num = " + num);
        }

    }
}
