package com.ohgiraffers.section01.conditional;

public class Application {
  /* 실행용 클래스
  * - 실제 기능(예시)은 외부 클래스에 작성하고
  *  현재 클래스는 외부 클래스를 얻어와 실행
  *  */
  public static void main(String[] args) {

    A_if a_if = new A_if();
    // a_if.testSimpleIfStatement();
    // a_if.testNestedIfStatement();

    B_ifelse b_ifelse = new B_ifelse();
    // b_ifelse.testSimpleIfElseStatement();

    C_ifElseif c_ifElseif = new C_ifElseif();
    //c_ifElseif.testIfElseIfStatement();
    //c_ifElseif.testNestedIfElseIfStatement();
    //c_ifElseif.improveIfElseIfStatement();

    D_switch d_switch = new D_switch();
    //d_switch.testSimpleSwitchStatement();
    d_switch.improveSimpleSwitchStatement();

  }



}
