package com.ohgiraffers.section03.branching;

public class Application
{
    public static void main(String[] args) {

        A_break a_break = new A_break();
        //a_break.testSimpleBreakStatement();
        //a_break.testSimpleBreakStatement2();
       // a_break.testJumpBreak( );

        B_continue b_continue = new B_continue();
       // b_continue.testSimpleBreakStatement();
       // b_continue.testSimpleBreakStatement2();
        //b_continue.testSimpleContinueStatement3();
        b_continue.testJumpContinue();

    }
}
