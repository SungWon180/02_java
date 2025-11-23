package com.ohgiraffers.section01.arithmetic;

public class Application1 {
    public static void main(String[] args) {
        /*산술 연산자 : + - * / % */
        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2  = " + (num1 + num2));
        System.out.println("num1 - num2  = " + (num1 - num2));
        System.out.println("num1 / num2  = " + (num1 / num2));
        System.out.println("num1 * num2  = " + (num1 * num2));
        System.out.println("num1 % num2  = " + (num1 % num2));

        System.out.println(num1 + num2 * 2 / 3 % ( 3+ 4));
        // 14 / 3 = 4 -> 4 % 7 = 4 -> 20 + 4



    }
}
