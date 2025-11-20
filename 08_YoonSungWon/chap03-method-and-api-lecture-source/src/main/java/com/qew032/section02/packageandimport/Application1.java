package com.qew032.section02.packageandimport;

public class Application1 {
  public static void main(String[] args) {

    // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
    // 어디에 위치한 클래스인지 패키지명 + 클래스명을 모두 명시
    com.qew032.section01.method.Calculator Calculator = new com.qew032.section01.method.Calculator();

    System.out.println("add: " + Calculator.add(1,6));
    System.out.println("add: " + Calculator.sub(8,6));
  }
}
