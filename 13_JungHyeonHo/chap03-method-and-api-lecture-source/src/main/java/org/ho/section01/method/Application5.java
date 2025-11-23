package org.ho.section01.method;

public class Application5 {
  /* static 키워드
   * - 정적인, 고정된
   * - JVM의 static(또는 method) 영역이 존재
   * - static 키워드가 붙은 변수/메서드는
   *   JVM의 static 영역에 할당됨
   */
  public static void main(String[] args) {  //main함수는 static이 붙었으니 static의 영역에 있다!!!!!!!
    /* non-static 메서드 호출 */
    org.ho.section01.method.Application5 application5 = new org.ho.section01.method.Application5();

    System.out.println(application5.plus(1, 3));

    System.out.println(minus(5, 2));
    System.out.println(Application5.minus(5, 2));
    System.out.println(application5.minus(5, 2));


  }

  /**
   * non-static 메서드
   *
   * @param num1
   * @param num2
   * @return
   */
  public String plus(int num1, int num2) {
    return "합계: " + (num1 + num2);
  }

  public static String minus(int num1, int num2) {
    return "차: " + (num1 - num2);
  }
}
