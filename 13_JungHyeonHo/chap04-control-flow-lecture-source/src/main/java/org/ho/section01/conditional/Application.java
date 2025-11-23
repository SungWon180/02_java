package org.ho.section01.conditional;

import java.io.IOException;

public class Application {
  /** 실행용 클래스
   *  - 실제 기능(예시)은 외부 클래스에 작성하고
   *    현재 클래스는 외부 클래스를 얻어와 실행
   */
  public static void main(String[] args) throws IOException {
    A_if ifTest = new A_if();
//    ifTest.testSimpleIfStatement();

    B_ifelse ifelseTest = new B_ifelse();
//    ifelseTest.testIfElseStatement();

    C_ifElseif ifElseIfTest = new C_ifElseif();
//    ifElseIfTest.testIfElseIfStatement();
//    ifElseIfTest.testNestedIfElseIfStatement();
//    ifElseIfTest.improveIfElseIfStatement();
    D_switch switchTest = new D_switch();
    switchTest.testSimpleSwitchStatement();
  }
}
