package com.my.section02.packageandimport;

public class Application1 {

  // 패키지명 + 클래스명 == 실제 클래스명
  // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
  // 어디에 위치한 클래스인지 패키지명 + 클래스명을 모두 암시
  public static void main(String[] args) {
    com.my.section01.method.Calculator calculator = new com.my.section01.method.Calculator();

    System.out.println("add: " + calculator.add(10, 20));
    System.out.println("sub: " + calculator.sub(55, 20));
  }
}
