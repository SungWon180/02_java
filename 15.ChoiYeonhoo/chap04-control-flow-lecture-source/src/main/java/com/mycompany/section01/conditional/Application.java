package com.mycompany.section01.conditional;

public class Application {
  /* 실행용 클래스
  * - 실제 기능(예시)는 외부 클래스에 작성하고
  * 현재 클래스는 외부 클래스를 얻어와서 실행만 할 예정
  * */
  public static void main(String[] args) {

    A_if a_if = new A_if();
//    a_if.testSimpleIfStatement();

//    a_if.testNestedIfStatement();

    B_ifElse b_ifelse = new B_ifElse();
//    b_ifelse.testSimpleIfElseStatement();
//    b_ifelse.testNestedIfElseStatement();

    C_ifElseif c_ifelseif = new C_ifElseif();
//    c_ifelseif.testIfElseIfStatement();
//    c_ifelseif.testNestedIfElseIfStatement();
//    c_ifelseif.improveIfElseIfStatement();

    D_switch d_switch = new D_switch();
//    d_switch.testSimpleSwitchStatement();
    d_switch.improveSimpleSwitchStatement();

  }
}
