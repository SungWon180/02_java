package com.ohgiraffers.session01.conditional;

public class Application {
    // 실행용 클래스
    // 실제 기능(예시)는 외부 클래스에 작성하고 현재 클래스는 실행만.
    public static void main(String[] args) {
        A_if a_if = new A_if();
        B_ifelse b_ifelse = new B_ifelse();
        D_Switch d_switch = new D_Switch();
        // a_if.testSimpleIfStatement();
        // a_if.testNestedIfStatement();
        // b_ifelse.testsimpleIfElseStatement();
        // b_ifelse.testNestedIfElseStatement();
        d_switch.testSwitchStatement();
    }
}
