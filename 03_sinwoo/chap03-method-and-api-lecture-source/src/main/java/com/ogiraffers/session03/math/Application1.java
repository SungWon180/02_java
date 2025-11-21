package com.ogiraffers.session03.math;

public class Application1 {

    /*
    Java API(Application Programming Interface)
     - Java에서 만들어서 제공하는 기능을 이용하는 방법
     */

    public static void main(String[] args) {
        /*
        java.lang.Math 활용하기.
         - Math의 모든 필드, 메서드는 static
          - Math.필드명, Math.메서드명() 으로 원하는 기능 호출 가능
         */

        System.out.println("Math.PI = " + Math.PI);

        System.out.println(Math.abs(-10));

        System.out.println(Math.random());
    }
}
