package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Application {
    /* 실행용 클래스
     * - 실제 기능(예시)은 외부 클래스에 작성하고
     * 현재 클래스는 외부 클래스를 얻어와 실행
     * java는 객체지향이(따로있는 것들) 반영이된 프로그램이랑 따로사용*/
    public static void main(String[] args) {

        A_if a_if = new A_if();
        // a_if testSimpleIfStatement();
        //  a_if.testNestedIfStatement();
        B_ifelse b_ifelse = new B_ifelse();
        //  b_ifelse.testNestedIfStatement();
        C_ifElseif cIfElseif = new C_ifElseif();
        //cIfElseif.testIfElseIfStatement();
       // cIfElseif.testNestedIfElseIfStatement();
        //cIfElseif.imporveIfElseIfStatement();
      //  D_switch d_switch = new D_switch();
      // d_switch.testSimpleSwitchStatement();
       // Homework homework = new Homework();
        Homework homework2 = new Homework();
    }

}


