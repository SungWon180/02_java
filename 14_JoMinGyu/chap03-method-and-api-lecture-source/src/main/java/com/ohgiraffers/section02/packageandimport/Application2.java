package com.ohgiraffers.section02.packageandimport;
import com.ohgiraffers.section01.method.Calculator;
// import : 매번 패키지명 + 클래스명 반복하지 않아도 됨

public class Application2 {

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(1, 2));
  }
}
