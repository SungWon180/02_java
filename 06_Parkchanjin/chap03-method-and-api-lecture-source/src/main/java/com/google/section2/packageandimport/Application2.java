package com.google.section2.packageandimport;
import com.google.section01.method.Calculator;

// 컴파일 시 컴파일러가 자동으로 추가
import java.lang.*; // java.lang 패키지 내 모든 클래스 가져오기
public class Application2 {

  // [import]
  // - 외부 클래스를 가지고 와서 배치
  // - 이후 현재 클래스에서 사용 시 클래스 명만 작성하면 된다!
  // import com.google.section01.method.Calculator;

  /* 다른 클래스를 가져와서 사용하기 위햐ㅐ
  * 매번 패키지명 + 클래스명을 반복해서 쓰는 것은 너무 불편하다 ㅜㅡㅜ
  *
  * -> import 구문을 이용해서 패키지명 + 클래스명 반복 작성을 방지
  *  */

  public static void main(String[] args) {

    Calculator calculator = new Calculator();
    System.out.println(calculator.add(55,66));
    System.out.println(calculator.sub(100,20));


  }
}
