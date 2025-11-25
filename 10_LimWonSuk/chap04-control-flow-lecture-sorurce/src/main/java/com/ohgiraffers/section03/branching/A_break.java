package com.ohgiraffers.section03.branching;

public class A_break {
    /* 분ㅇ기문: 반복문(for,while) 수행준 멈추거나 다음으로 놈어가게 하는 구문
     */
    public void testSimpleBreakStatement() {

        /* breack(반복문 종료)  사용확이기하기
        - break 는 가장 인접한 반복문을 멈춤
        * */

    }

/*
    public void testBreakStatement()
    {
        int sum = 0; // 합계 누적용 변후 및 초기호ㅓ
        int i = 1;

        while (true) // 무한 루프
        {
            sum += i;

            i++;

            if(i > 100)  break; // 분기문
        }
        System.out.println("sum = " +sum);
*/

    {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            i++;

            if (i > 100) break;
        }

        System.out.println("sum = " + sum);
    }


    /* 인접한 반복문 break 여부 획인하기
     * */

    public void testSimpleBreakStatement2() {
        for (int dan = 2; dan <= 9; dan++) {
            if (dan > 5) break; // 5단까지만 하고 멈춤

            for (int su = 1; su <= 9; su++) {
                if (su > 5) break; // 안종한 반복문만 멈춤
                System.out.printf("%d * %d = %d ", dan, su, dan * su);

            }
            System.out.println(); // 줄바꿈
        }

    }

    public void testJumpBreak() {

        label:
        // for(;;)에 대한 이름 지정
        for (; ; ) { // 무한 루프(무한 반복)
            for (int i = 0; i < 10; i++) {
                System.out.println(i);

                if (i == 5) break label;


            }
        }
    }
}