package com.ohgiraffers.session01.conditional;

import java.util.Scanner;

public class B_ifelse {

    public void testsimpleIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

    }

    public void testNestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("짝수");
        }else{
            System.out.println("홀수");
        }

    }

}
