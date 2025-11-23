package com.ohgiraffers.section03.math;

import java.util.Random; // 2.Random 자동완성으로 생성

public class Application {
    public static void main(String[] args) {
        /* 사용자 범위의 난수 발생 시키기*/

        /* 1, Math.random()
        * - 0 ~ 9 사이 난수 발생(정수)*/

        int random1 = (int)(Math.random() * 10)  ; // 0.0 * 10 <= x * 10  <1.0 * 10
        System.out.println("random1 = " + random1);
        System.out.println("random1 = " + random1);
        System.out.println("random1 = " + random1);


        /* 2, Math.random()
         * - 1 ~ 10 사이 난수 발생(정수)*/

        int random2 = (int)(Math.random() * 10) + 1  ; // 0.0 * 10 <= x * 10  <1.0 * 10
        System.out.println("random2 = " + random2);
        System.out.println("random2 = " + random2);
        System.out.println("random2 = " + random2);

        /* 3, Math.random()
         * - 1 ~ 45 사이 난수 발생(정수)*/

        int random3 = (int)(Math.random() * 45)+ 1  ; // 0.0 * 10 <= x * 10  <1.0 * 10
        System.out.println("random3 = " + random3);
        System.out.println("random3 = " + random3);
        System.out.println("random3 = " + random3);

        /* 2, Random 클래스()
         * - 0 ~ 9 사이 난수 발생(정수)*/
        Random random = new Random();
        int random4 = random.nextInt(10); // 0 ~ 9 사이 난수 반환
        System.out.println("random4 = " + random4);

          /* 0 ~ 44 사이 난수 발생(정수)*/
        // Random random5 = new Random(); // 이 줄을 제거
        int random5 = random.nextInt(45); // ✅ 다른 이름(random45)을 사용하여 난수 값만 저장
        System.out.println("random5 = " + random5);

    }
}
