package com.jinosoft.section01.method;

public class Application01 {
  // method == 기능, 동작


  // main() method : java 프로그램 실행 시 제일 먼저 찾아서 호출하는 메서드
  // -> 호출이 되면 {} 지정된 동작(코드) 수행
  public static void main(String[] args) {

    System.out.println("main() 메서드 호출");

    /* 별도로 선언한 메서드를 호출한다. */
    Application01 application1 = new Application01();
    application1.methodA(); // 메서드 호출
    application1.methodB(); // 메서드 호출
    application1.methodC(); // 메서드 호출

    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용

    System.out.println("main() 메서드 종료");

  } // main() end


  /* 별도 메서드 선언, 정의
   * - 메서드 선언: 접근제어자 반환형 메서드명(매개변수){}
   * - 메서드 정의: {} 내에 원하는 동작을 코드로 작성
   * */
  public void methodA() {
    System.out.println("AAA methodA() 호출 AAA");
    System.out.println("AAA methodA() 종료 AAA");

    // void 메서드에 컴파일러가 자동으로 return; 추가
    return;
  }

  public void methodB() {
    System.out.println("BBB methodB() 호출 BBB");
    System.out.println("BBB methodB() 종료 BBB");
  }

  public void methodC() {
    System.out.println("CCC methodC() 호출 CCC");
    System.out.println("CCC methodC() 종료 CCC");
  }


}