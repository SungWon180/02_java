package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class B_ifelse {
    /* if else 확인 */
    public void testNestedIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        /* 홀짝 판별 */
        if (input % 2 == 0) {
            System.out.println("작수 입니다.");
        } else { // 조건식이 false 인 경우
            System.out.println("홀수 입니다.");
        }
    }

    /* 중첩 if else */
    public void testNestedIfelseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        /* 홀짝 판별 */
        if (input % 2 == 0) {
            if (input == 0) {
                System.out.println("0 입니다.");
            } else {
                System.out.println("짝수 입니다.");
            }


            //System.out.println("작수 입니다.");
        } else { // 조건식이 false 인 경우
            System.out.println("홀수 입니다.");
        }
    }
}
