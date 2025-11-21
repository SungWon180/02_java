package com.ogiraffers.session01.method;

public class Application5 {
    /* static 키워드
    * 정적인, 고정된
    * JVM의 static(또는 Method) 영역이 존재
    * static 키워드가 붙은 변수/메서드는 JVM의 static영역에 할당됨.
    * */
    public static void main(String[] args) {
        Application5 app = new Application5();
        app.sum(10,20);
        System.out.println(minus(10,20));

        System.out.println(minus(10,20));
    }
    /* Non-static */
    public String sum(int num1, int num2){
        return "합계 : " + (num1 + num2);
    }

    public static String minus(int num1, int num2){
        return "차 : " + (num1 + num2);
    }
}
