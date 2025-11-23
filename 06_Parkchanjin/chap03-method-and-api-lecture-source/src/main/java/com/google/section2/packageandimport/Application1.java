package com.google.section2.packageandimport;

import com.google.section01.method.Calculator;

public class Application1 {
  public static void main(String[] args) {
    // 패키지명 + 클래스명 == 실제 클래스명

    // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
    // 어디에 위치한 클래스인지 패키지명 + 클래스명을 모두 명시
    com.google.section01.method.Calculator calculator =
        new com.google.section01.method.Calculator();

    System.out.println("add " + calculator.add(10,20));
    System.out.println("add " + calculator.sub(55,20));
  }
}
