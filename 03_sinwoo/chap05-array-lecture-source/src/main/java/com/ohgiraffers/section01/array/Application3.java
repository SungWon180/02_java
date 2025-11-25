package com.ohgiraffers.section01.array;

import java.util.Random;

public class Application3 {
    public static void main(String[] args) {
        /*
        [Java 불변의 법칙]
        1. 지역 변수(stack 영역에 할당)는 초기화 되어야지만 사용할 수 있다.
        2. heap 영역에 할당된 공간은 빈 칸으로 있을 수 없다.
         */


        // 초기화 안되면 사용 불가
//        int[] iarr;
//        System.out.println("iarr = " + iarr);

        int[] iarr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < iarr.length; i++) {
            iarr[i] = rand.nextInt(100);
        }
    }
}
