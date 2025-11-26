package com.ohgiraffers.section06.statickeyword;

public class StaticTest {

    private int nonStaticCount = 1;
    private static int staticCount;
    public static final int MAX_FINAL = 100;
    public static final int MIN_FINAL = 0;

    public static int getStaticCount() {
        return staticCount;
    }

    public static void setStaticCount(int staticCount) {
        StaticTest.staticCount = staticCount;
    }

    public static void increaseStaticCount() {
        staticCount++;
    }

    public int getNonStaticCount() {
        return nonStaticCount;
    }

    public void setNonStaticCount(int nonStaticCount) {
        this.nonStaticCount = nonStaticCount;
    }


    public StaticTest() {

    }

    public static void test() {
        final int A;
        A = 100;
    }
}
