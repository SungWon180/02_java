package com.ohgiraffers.section03.branching;

public class B_continue {
    /*
     * continue 는 다음 반복으로 넘어가기
     * */

/*
    public void testSimpleBreakStatement() {
        for (int i = 0; i < 10; i++)  // 0~9 까지
        {
            if (i % 2 == 0) continue; // i가 0으,로 나눠지면 true 로 false인 홀수만 출력 하며 넘어감

            System.out.println("i = " + i);
        }
    }

    */
    /*
     * 1 ~ 100 까지출력
     * 단, 4의 배수 또는 5의 ㅂ재수는 제외
     * *//*

    public void testSimpleBreakStatement2()
    {
        for (int i = 1; i <= 100; i++)
        if(i % 4 == 0 || i % 5 == 0) continue; // i를 4로 %(나눴을때) 0이되는애들 == 4의 배수
        {
            System.out.println("i = " + i);


        }


    }
*/

    /**
     * continue (다음 반복으로 넘어가기) 확인하기
     */
    public void testSimpleContinueStatement() {

        for (int i = 0; i < 10; i++) {
            // i가 짝수일 경우에 다음 반복으로 넘어가기 (for문은 증감식으로 넘어감)
            if (i % 2 == 0) continue;

            System.out.println("i = " + i);
        }
    }

    /**
     * 1 ~ 100 까지 출력하기
     * 단, 4의 배수 또는 5의 배수는 제외
     */
    public void testSimpleContinueStatement2() {
        for (int i = 1; i <= 100; i++) {
            if (i % 4 == 0 || i % 5 == 0) continue;

            System.out.println("i = " + i);
        }
    }


    /* 인접한 반복문 continue 획인하기
     * */
    public void testSimpleContinueStatement3()
    {
        for (int dan = 2; dan <= 9; dan++)
        {
            if (dan == 5) continue; // 5단만 넘어가기

            for (int su = 1; su <= 9; su++)
            {
                if (su == 5) continue; // 안종한 반복문만 넘어가기
                System.out.printf("%d * %d = %d ", dan, su, dan * su);

            }
            System.out.println(); // 줄바꿈
        }

    }

/*
* 중첩 반복문 내에서 continue뮨 사용시
* */
    public void testJumpContinue() {

        label:
        // for(;;)에 대한 이름 지정
        for (; ; ) { // 무한 루프(무한 반복)
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

                if (i == 5) continue label;


            }
        }
    }

}