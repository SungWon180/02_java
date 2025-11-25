package com.ohgiraffers.session01.conditional;

import java.util.Scanner;

public class D_Switch {

    public void testSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int input1 = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int input2 = sc.nextInt();

        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        int result = 0; // 연산 결과 저장용.

        switch (op){
            case '+':
                result = input1 + input2;
                break;
            case '-':
                result = input1 - input2;
                break;
            case '*':
                result = input1 * input2;
                break;
            default:
                System.out.println("잘못된 연산자 입니다");
                return;
        }
        System.out.println(input1 + " " + op + " " + input2 + " = " + result);


    }

    public void improveSwitchStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 정수 : ");
        int input1 = sc.nextInt();

        System.out.print("두번째 정수 : ");
        int input2 = sc.nextInt();

        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        // advanced switch (switch expression) 사용
        Integer result = switch (op) {
            case '+' -> input1 + input2;
            case '-' -> input1 - input2;
            case '*' -> input1 * input2;
            default -> null;  // 잘못된 연산자는 일단 null로 처리
        };

        System.out.println(input1 + " " + op + " " + input2 + " = " + result);
    }


}
