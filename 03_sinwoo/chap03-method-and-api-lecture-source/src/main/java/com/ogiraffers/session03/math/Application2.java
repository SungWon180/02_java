package com.ogiraffers.session03.math;

import java.util.Random;



public class Application2 {
    public static void main(String[] args) {
        /*
        사용자 범위의 난수 발생 시키기
         */

        // 1. Math.random()
        // 0 ~ 9 사이 난수 발생(정수)
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));
        System.out.println((int) (Math.random()*10));

        Random ran = new Random();
        int random4 = ran.nextInt(10);
        System.out.println("random4 = " + random4);

    }
}