package com.work.section01.conditional;

public class Application {
  public static void main(String[] args) {
    /*실행용 클래스
    * - 실제 기능(예시)은 외브클래스에 작성하고 현재클래스는 외부 클래스를 얻어와 실행
    * */
    A_if aIf = new A_if();

    B_ifElse bIfElse = new B_ifElse();
//    bIfElse.testSimpleIfElseStatement();
//    bIfElse.testNestedIfElseStatement(/);
//    C_ifElseif cIfElseif = new C_ifElseif();
//    cIfElseif.testIfElseNestedIfstatemnet();

//    C_ifElseif cIfElseif =new C_ifElseif();
//    cIfElseif.improveifElseIfStatement();
    D_switch dSwitch = new D_switch();
    dSwitch.improveSimpleSwitchStatement();


  }
}