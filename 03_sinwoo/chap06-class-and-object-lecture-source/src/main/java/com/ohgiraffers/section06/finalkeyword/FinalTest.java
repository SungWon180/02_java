package com.ohgiraffers.section06.finalkeyword;

import com.ohgiraffers.section06.statickeyword.StaticTest;

public class FinalTest {

    private final int NON_STATIC_NUM = 1;

    private final int NON_STATIC_NUM2;

    public FinalTest() {
        NON_STATIC_NUM2 = 2;
    }

    public void test() {
        final int A;
        A = 100;
        System.out.println(StaticTest.MAX_FINAL);
        System.out.println(StaticTest.MIN_FINAL);
    }

}
