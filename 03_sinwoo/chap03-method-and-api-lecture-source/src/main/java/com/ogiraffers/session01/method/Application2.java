package com.ogiraffers.session01.method;

public class Application2 {
    public static void main(String[] args) {

        Application2 app = new Application2();
        app.methodA();
        app.methodB();
        app.methodC();

    }

    public void methodA() {
        System.out.println("AAA method() 호출 AAA");
        methodB();
        System.out.println("AAA method() 종료 AAA");
    }

    public void methodB() {
        System.out.println("BBB method() 호출 BBB");
        methodC();
        System.out.println("BBB method() 종료 BBB");
    }

    public void methodC() {
        System.out.println("CCC method() 호출 CCC");
        System.out.println("CCC method() 종료 CCC");
    }
}
