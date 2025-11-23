package com.kang.section02.packageandimport;

// 컴파일 시
import  java.lang.*;

import com.kang.section01.method.Calculator;

public class Application2 {
  public static void main(String[] args) {


   /* 다른 클래스를 가져와서 사용하기 위해
   매번 패키지명 + 클래스명을 다 반복해서 쓰는 것은 너무 불편하다.
   *
   *
   * -> import 구문을 이용해서 패키지명 + 클래스명 반복 작성을 방지
    */

    // import된 클래스는 패키지명을 생략하고 사용할 수 있따
    Calculator calculator = new Calculator();
    System.out.println(calculator.add(55, 66));
    System.out.println(calculator.sub(100,20));

  }
}
