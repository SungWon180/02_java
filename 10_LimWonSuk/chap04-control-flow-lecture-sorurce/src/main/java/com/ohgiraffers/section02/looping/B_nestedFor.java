package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class B_nestedFor {
    /* 중첩 for문을 이용해서 출력하기
     * 1 2 3 4
     * 1 2 3 4
     * 1 2 3 4
     * */

    public void printTable() {
        for (int row = 1; row <= 3; row++) // 3번 반복
        {


            // 1 2 3 4
            for (int col = 1; col <= 4; col++) {
                System.out.print(col);
            }
            System.out.println(); // 내용 없는 println() == 줄바꿈
        }
    }
    /* 중첩 for문을 이용해서 출력하기
     * 4 3 2 1
     * 4 3 2 1
     * 4 3 2 1
     * */

    public void printTable2() {
        for (int row = 1; row <= 3; row++) // 3번 반복
        {


            // 4 3 2 1
            for (int col = 4; col >= 1; col--) {
                System.out.print(col + "");
            }
            System.out.println(); // 내용 없는 println() == 줄바꿈
        }


    }

    /* 2단 구구단표 만들기 */
    public void printTwoDan() {
        for (int dan = 2; dan <= 9; dan++) { // 2~9단 선택
            System.out.println("====== " + dan + "단 ======= ");

            for (int i = 0; i <= 9; i++) {
                // System.out.println(dan + " * " + i + " = " + (2 * i)); // 2단만 나오게함
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }

        }

    }


    /* 삼각형 별 짓기
    출력할 줄 수를 입력하세요 : 5
                *
                **
                ***
                ****
                ******/
    public void printTraingleStar()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("출력하고 싶은 별 삼각형의 층 수 입력 : ");
        int floor = sc.nextInt();

        for (int row = 1; row <= floor; row++)
        { // 행 반복
            for (int col = 1; col <= row + 1 ; col++)
            // 초기값 ; 종료조건 ; 변화(+-*/)에따값
            { // 열 반복
                System.out.print("*"); // *****

            }
            System.out.println();// 줄바꿈

        }
    }
} // 맨위에 닫아야함 제발 기억해 십할
// \* 1개 3개 5개