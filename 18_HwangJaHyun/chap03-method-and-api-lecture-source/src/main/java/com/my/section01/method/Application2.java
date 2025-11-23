package com.my.section01.method;

public class Application2 {
  public static void main(String[] args) {
    System.out.println("main() 호출");
    Application2 application2 = new Application2();
    application2.methodA();
    System.out.println("main() 종료");
  }
  public void methodA(){
    System.out.println("AAA method()호출 AAA");
    methodB();
    System.out.println("AAA method()종료 AAA");
  }

  public void methodB(){
    System.out.println("BBB method()호출 BBB");
    methodC();
    System.out.println("BBB method()종료 BBB");
  }

  public void methodC(){
    System.out.println("CCC method()호출 CCC");
    System.out.println("CCC method()종료 CCC");
  }

}
