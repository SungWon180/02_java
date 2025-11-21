package com.ogiraffers.session02.packageandimport;

import com.ogiraffers.session01.method.Calculator;

public class Application1 {
    public static void main(String[] args) {
        // 실제 클래스 명 == 패키지 명 + 클래스명
        // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
        // 어디에 위치한 클래스인지 패키지명 + 클래스명을 모두 명시
        com.ogiraffers.session01.method.Calculator calc = new Calculator();
        System.out.println("10 + 20 = " + calc.sum(10,20));
        System.out.println("10 - 20 = " + calc.minus(10,20));


    }
}
