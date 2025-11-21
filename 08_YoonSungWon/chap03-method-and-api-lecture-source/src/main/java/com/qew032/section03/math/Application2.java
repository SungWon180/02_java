package com.qew032.section03.math;

import java.util.Random;

public class Application2 {

  public static void main(String[] args) {
    /* 사용자 범위의 난수 발생 시키기 */

    /* 1. Math.random() */
    /* 0~9 사이 난수 발생(정수) */
    int random1 = (int)(Math.random() * 10);
    System.out.println("random1 = " + random1);

    /* 1~10 사이 난수 발생(정수) */
    int random2 = (int)(Math.random() * 10) + 1;
    System.out.println("random1 = " + random2);

    /* 1~45 사이 난수 발생(정수) */
    int random3 = (int)(Math.random() * 45) + 1;
    System.out.println("random1 = " + random3);
    
    /* 2. random 클래스 */
    /* 0~9 사이 난수 발생(정수) */
    Random ran = new Random();
    int random4 = ran.nextInt(10);  // 0 ~ 9 사이 난수 반환
    System.out.println("random4 = " + random4);

    int random5= ran.nextInt(45) + 1;  // 0 ~ 9 사이 난수 반환
    System.out.println("random5 = " + random5);

  }

}
