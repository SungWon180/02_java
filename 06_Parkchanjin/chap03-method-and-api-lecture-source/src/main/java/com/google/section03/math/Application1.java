package com.google.section03.math;

public class Application1 {

  /*  Java API(Application Programming Interface)
  *   - Java 에서 만들어서 제공하는 기능을 이용하는 방법(문법)
  * */
  public static void main(String[] args) {

    /* java.lang.Math 클래스 활용하기
    *  - Math의 모든 필드, 메서드는 static
    *   -> Math.필드명, Math.메서드명() 으로 원하는 기능 호출 가능
    * */

    /* 1. Math.PI : 원주율 */
    System.out.println("PI = " + Math.PI);

    /* 2. Math.abs(값) : 절대 값 */
    System.out.println("-30의 절대 값 : " + Math.abs(-30));


    /* 3. Math.max(값1, 값2) : 둘 중 큰 값을 반환 */
    System.out.println("10, 20 중 큰 값 : " + Math.max(10, 20));

    /* 4. Math.min(값1, 값2) : 둘 중 작은 값을 반환 */
    System.out.println("10, 20 중 작은 값 : " + Math.min(10, 20));

    /* 5. Math.random() : 0.0 <= x < 1.0 범위의 난수를 하나 반환 (double) */
    System.out.println("난수 발생 : " + Math.random());


  }
}
