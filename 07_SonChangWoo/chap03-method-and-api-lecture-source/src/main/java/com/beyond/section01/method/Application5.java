package com.beyond.section01.method;

public class Application5 {
  /* static 키워드
  * - 정적인, 고정된
  * - JVM의 static(또는 method) 영역이 존재
  * - static 키워드가 붙은 변수/매서드는
  *   JVM의 static 영역에 해당됨
  * */

  public static void main(String[] args) {

    /* non-static 메서드 호출 */
    Application5 application5 = new Application5();
    System.out.println(application5.plus(1,3));

    /* static 매서드 호출 */
    System.out.println(minus(5,2));

  }

  /* non-static 매서드 */
  public String plus(int num1, int num2){

    return "합계: " + (num1 + num2);
  }

  public static String minus(int num1, int num2) {

    return "차: " + (num1 - num2);
  }

}
