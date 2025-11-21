package com.qew032.section02.packageandimport;

import java.lang.*;   // java.lang 패키지 내 모든 클래스 가져오기

// [import]
// 외부 클래스를 가지고 와서 배치
// 이후 현재 클래스에서 사용 시 클래스명만 작성하면 된다.
import com.qew032.section01.method.Calculator;

public class Application2 {
  /*다른 클래스를 가져와서 사용하기 위해
  * 매번 패키지명 + 클래스명을 밚복해서 쓰는 것은 너무 불편하다.
  *
  * -> import 구문을 이용해서 패키지명 + 클래스명 반복 작성 방지
  * */

  public static void main(String[] args) {
    // import된 클래스는 패키지명을 생략하고 사용할 수 있다.
      Calculator  calculator= new Calculator();
    System.out.println(calculator.add(5,8));
    System.out.println(calculator.sub(15,8));
  }
}
