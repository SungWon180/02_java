package com.google.section01.method;

public class Application1 {

  // main() method == 기능, 동작

  // main() method : java 프로그램 실행 시 제일 처음 찾아서 호출하는 메서드
  // -> 호출이 되면 {} 지정된 동작
  public static void main(String[] args) {

    System.out.println("main() 메서드 호출");
    // 별도로 선언한 메서드 호출

    System.out.println("main() 메서드 종료");
  } // main() end

  /* 별도 메서드 선언, 정의
  *  - 메서드 선언 :   접근제어자 반환형 메서드명(매개변수){}
  *  - 메서드 정의 : {} 블럭 내에 원하는 동작 코드로 작성 */
  public void methodA() {
    System.out.println("AAA methordA() 호출 AAA");
    System.out.println("AAA methordA() 종류 AAA");
  }

  public void methodB() {
    System.out.println("BBB methordA() 호출 BBB");
    System.out.println("BBB methordA() 종류 BBB");



  }

  public void methodC() {
    System.out.println("CCC methordA() 호출 CCC");
    System.out.println("CCC methordA() 종류 CCC");
  }
}
