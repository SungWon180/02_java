package com.mycompany.section01.method;

public class Application1 {
  // method == 기능, 동작

  // main method : Java 프로그램 실행 시, JVM이 제일 처음 찾아서 호출하는 method
  // 호출이 되면 {} 안에 지정된 동작(코드) 수행
  public static void main(String[] args) {

    System.out.println("main() method 호출");

   // 코드 추가 예정

    /* 별도로 선언한 메서드를 호출 한다.*/

    Application1 application1 = new Application1();
    application1.methodA(); // 메서드 호츨
    application1.methodB(); // 메서드 호츨
    application1.methodC(); // 메서드 호츨

    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용
    application1.methodA(); // 메서드 재사용

    System.out.println("main() method 종료");

  } // main() end

  /* 별도 메서드 선언, 정의
  * - 메서드 선언 : 접근제어자 반환형 메서드명(매개변수){}
  * - 메서드 정의: {} 내에 원하는 동작을 코드로 작성
  * */

  public void methodA() {
    System.out.println("AAAAA methodA 가 호출 AAAAA");
    System.out.println("AAAAA methodA 가 종료 AAAAA");
  }

  public void methodB() {
    System.out.println("BBBBB methodA 가 호출 BBBBB");
    System.out.println("BBBBB methodA 가 종료 BBBBB");
  }

  public void methodC() {
    System.out.println("CCCCC methodA 가 호출 CCCCC");
    System.out.println("CCCCC methodA 가 종료 CCCCC");
  }

}
