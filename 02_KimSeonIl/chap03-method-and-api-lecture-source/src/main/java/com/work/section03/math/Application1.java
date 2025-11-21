package com.work.section03.math;

public class Application1 {
  /*Java API( Application Programming Interface )
  * - Java에서 만들어서 제공하는 기능을 이용하는 방법(문법)
  * */
  public static void main(String[] args) {

    /*java.lang.math 클래스 활용하기
    * - Math의 모든 필드, 메서드는 static
    * -> Math.필드명, Math.메서드명() 으로 원하는 기능 호출 가능
    * */

    /* 1.Math.PI : 원주율*/
    System.out.println("PI = " + Math.PI);
    System.out.println("Math.abs = " + Math.abs(-22220));
    /*Math.max(값1, 값2) :둘 중 큰 값을 반환*/
    System.out.println("Math.max = " + Math.max(1,2) );
    /*Math,min(값1, 값2) :둘 중 큰 값을 반환*/
    System.out.println("최소값 = " + Math.min(10, 20));
    /*Math.random() : 0.0 <= x < 1.0 범위의 난수를 하나 반환*/
    System.out.println("난수 발생 = " +(int)(Math.random()*100));

  }

}
