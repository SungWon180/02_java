package com.wjdqdwls.section02.packageandimpot;

public class Application1 {
  public static void main(String[] args) {
    // 패키지명 + 클래스명 == 실제 클래스명

    // 다른 패키지에 존재하는 클래스를 가져와서 사용하려면
    // 어디에 우ㅠㅣ치한 클래스인지 패키지명 + 클래스명을 모두 명시
    com.wjdqdwls.section01.method.Calculator Calculator
    = new com.wjdqdwls.section01.method.Calculator();

    System.out.println("add : " + Calculator.add(10, 20));
    System.out.println("sub : " + Calculator.add(55, 20));
  }

}
