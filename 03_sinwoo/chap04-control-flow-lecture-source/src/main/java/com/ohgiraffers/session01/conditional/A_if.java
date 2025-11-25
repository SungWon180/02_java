package com.ohgiraffers.session01.conditional;

import java.util.Scanner;

public class A_if {

    public void testSimpleIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        if(input % 2 == 0){
            System.out.println("입력하신 정수는 짝수입니다");
        }

        System.out.println("종료");
    }

    public void testNestedIfStatement(){
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 하나 입력 : ");
        int input = sc.nextInt();

        if(input > 0) {
            if (input % 2 == 0) {
                System.out.println("입력하신 정수는 짝수입니다");
            }
        }
        System.out.println("종료");
    }

}
