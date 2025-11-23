package com.my.section01.method;

public class Application1 {
  // main() method : java 프로그램 실행 시 제일 처음 찾아서 호출하는 메서드
  // -> 호출이 되면 {} 지저오딘 동작(코드 수행
  public static void main(String[] args) {
    // method == 기능, 동작

    System.out.println("main() 메서드 호출");
    Application1 application1 = new Application1();
    application1.methodA();
    application1.methodA();
    application1.methodC();
    System.out.println("main() 메서드 종료");
  } //main() end

  /* 별도 메서드 선언, 정의
  * 메서드 선언: 접근제어자 반환형 메서드명(매개변수){}
  * 메서드 정의: {}내에 원하는 동작을 코드로 작성*/
  // method는 stack내에 존재함_후입선출
  public void methodA(){
    System.out.println("AAA method()호출 AAA");
    System.out.println("AAA method()종료 AAA");
  }

  public void methodB(){
    System.out.println("BBB method()호출 BBB");
    System.out.println("BBB method()종료 BBB");
  }

  public void methodC(){
    System.out.println("CCC method()호출 CCC");
    System.out.println("CCC method()종료 CCC");
  }
}
