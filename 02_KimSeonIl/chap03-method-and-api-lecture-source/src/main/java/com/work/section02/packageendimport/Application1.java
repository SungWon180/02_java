package com.work.section02.packageendimport;

import com.work.section01.method.Calculator;

public class Application1 {
  public static void main(String[] args) {

    //다른패키지에 존재하는 클래스를 가져와서 사용하려면 어디에 위치한 클래스인지 패키지 명 클래스 명을 모두 명시

//    com.work.section01.method.Calculator calculator = new com.work.section01.method.Calculator();

    Calculator calculator = new Calculator();
    System.out.println("add : " + calculator.add(5, 10));
    System.out.println("sub : " + calculator.add(5, 10));

  }
}
