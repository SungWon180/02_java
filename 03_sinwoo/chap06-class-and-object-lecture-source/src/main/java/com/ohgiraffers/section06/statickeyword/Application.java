package com.ohgiraffers.section06.statickeyword;

public class Application {
    public static void main(String[] args) {
        // 정적 메모리 영
        // JVM 어디서든 공유 가능

        // 프로그램 실행 시 static이 붙은 필드/메서드를 찾아 클래스명, 필드명, 형태로 static메모리 영역에 할당

        StaticTest.setStaticCount(100);
        System.out.println(StaticTest.getStaticCount());

        StaticTest.increaseStaticCount();

        System.out.println(StaticTest.MAX_FINAL);
        System.out.println(StaticTest.MIN_FINAL);
    }
}
