package com.wjdqdwls.section01.method;

public class Application5 {
  /* static 키워드
  * - 정적인, 고정된
  * - JVM의 static(또는 method) 영역의 존재
  * - static 키워드가 붙은 변수/메서드는
  *   JVM의 static 영역에 할당됨
  * */

  public static void main(String[] args) {
    /* non-static 메서드 호출 */
    Application5 application5 = new Application5();
    System.out.println( application5.plus(1,3) );
    System.out.println( application5.minus(5,2));
  }
  /* non-static 메서드*/
  public String plus(int num1, int num2){
    return "합계 : " + (num1 + num2);
  }

  public String minus(int num1, int num2){
    return "차 : " + (num1 - num2);
  }

}
