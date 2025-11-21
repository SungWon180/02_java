package com.ogiraffers.session01.method;

public class Application1 {

    // main() 메소드
    public static void main(String[] args) {
        System.out.println("main메소드 호출");

        Application1 app = new Application1();
        app.methodA();
        app.methodB();
        app.methodC();

    }

    /* 별도 메소드 선언, 정의
    *  - 메소드 선언: 접근제어자 반환형 메서드명(매개변수) {}
    *  - 메소드 정의: {}내에 원하는 동작을 코드로 작성
    * */

    public void methodA() {
        System.out.println("AAA method() 호출 AAA");
        System.out.println("AAA method() 종료 AAA");
    }

    public void methodB() {
        System.out.println("BBB method() 호출 BBB");
        System.out.println("BBB method() 종료 BBB");
    }

    public void methodC() {
        System.out.println("CCC method() 호출 CCC");
        System.out.println("CCC method() 종료 CCC");
    }


}
