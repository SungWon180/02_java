package com.mycompany.section02.packageandimport;

// [import]
// - 외부 클래스를 가지고 와서 배치
// - 이후 현재 클래스에서 사용 시 클래스명만 작성하면 된다.
import com.mycompany.section01.method.Calculator;

// 안쓰더라도 컴파일러 시 컴파일러가 자동 추가
import java.lang.*; // java.lang 패키지 내 모든 클래스 가져오기

public class Application2 {

  public static void main(String[] args) {

    /* 다른 클래스를 가져와서 사용하기 위해
    * 매번 패키지명 + 클래스명을 반복해서 쓰는 것은 너무 불편하다.
    *
    * -> import 구문을 이용해서 패키지명 + 클래스명 반복 작성을 방지
    * */

    // com.mycompany.section01.method.Calculator calculator = new com.mycompany.section01.method.Calculator();

    // import 된 클래스는 패키지명을 생략하고 사용할 수 있다.
    Calculator calculator = new Calculator();

    System.out.println("add : " + calculator.add(55, 66));
    System.out.println("sub: " + calculator.sub(1234, 232));


  }

}
