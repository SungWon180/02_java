package com.ohgiraffers.section06.statickeyword;

public class Application {
  public static void main(String[] args) {

    /* static 메모리 영역
    * - 정적 메모리 영역( == method area == class area)
    * - JVM 어디서든 공유 가능한 영역
    * ***************************************************
    * - 프로그램 실행 시 static이 붙은 필드/메서드를 찾아
    *   클래스명.필드명  ,  클래스명.메서드명()
    *   형태로 static 메모리 영역에 할당된다.
    * ***************************************************
    * */

    // StaticTest 객체 생성
    StaticTest s1 = new StaticTest();
    StaticTest s2 = new StaticTest();

    // non-static count를 각각 1씩 증가
    s1.increaseNonStaticCount();
    s2.increaseNonStaticCount();

    System.out.println("s1 : " + s1.getNonStaticCount()); // 1
    System.out.println("s2 : " + s2.getNonStaticCount()); // 1

    /* staticCount를 1씩 증가*/
    s1.increaseStaticCount();
    s2.increaseStaticCount();

    System.out.println("s1 : " + s1.getStaticCount()); // 2
    System.out.println("s2 : " + s2.getStaticCount()); // 2

    /* Static 필드/메서드 호출하는 정석적인 방법은
    * 클래스명.필드명 / 클래스명.메서드명()   이다!!  */
    System.out.println(StaticTest.getStaticCount());


    System.out.println(StaticTest.MAX_COUNT);
    System.out.println(StaticTest.MIN_COUNT);
  }
}
