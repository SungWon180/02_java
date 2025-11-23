package com.mycompany.section03.math;

import java.util.Random;

public class Application2 {
  public static void main(String[] args) {
    /* 사용자 범위의 난수 발생 시키기 */

    /* 1. Math.random()
    * 0~9 사이 난수 발생 (정수형)
    * */
    Math.random(); // 0.0 <= x < 1.0
    int num1 = (int)(Math.random() * 10) ; // 0.0 <= x < 10.0 -> int로 강제 형변환 0 <= x < 10
    int num2 = (int)Math.random() * 10 ; // Math.random이 먼저 강제 형변환 되서 0 되버려서 의도와 다름

    System.out.println("num1 = " + num1);


    /* 1 ~ 10 사이 난수*/
    int num3 = (int)(Math.random() * 10) + 1 ;
    System.out.println("num3 = " + num3);

    /* 1 ~ 45 사이 난수 */
    int num4 = (int)(Math.random() * 45) + 1 ;


    /* 2. Random 클래스 */
    /* 0 ~ 9 사이 난수 발생 (정수) */
    Random ran = new Random();

    int ran4 = ran.nextInt(10); //
    System.out.println("ran4 = " + ran4);

    /* 1 ~ 45 사이 난수 발생 (정수) */
    int ran5 = ran.nextInt(45) + 1;

  }
}
