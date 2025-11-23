package com.work.section02.packageendimport;
//    외부 클래스를 가지고 와서 배치
//    import
//    현재 클래스에서 사용시 클래스명만 작성하면 된다.
import com.work.section01.method.Calculator;

public class Application2 {
  public static void main(String[] args) {

   //다른 클래스를 가져와서 사용하기 위해 매번 패키지명 + 클래스 명을 반복해서 쓰는 것은 불편하다
//    -> import 구문을 이용ㄹ해서 패키지명 반복 작성을 방지

//    com.work.section01.method.Calculator calculator = new com.work.section01.method.Calculator();
//import 된 클래스는 패키지명을 생략하고 사용 할 수 있다!
    Calculator calculator = new Calculator();
    System.out.println("add : " + calculator.add(5, 10));
    System.out.println("sub : " + calculator.add(5, 10));

  }
}
