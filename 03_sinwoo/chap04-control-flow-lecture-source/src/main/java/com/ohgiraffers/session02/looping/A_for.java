package com.ohgiraffers.session02.looping;

import java.util.Random;
import java.util.Scanner;

public class A_for {

    public void testSimpleForLoop() {
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            System.out.println("난수 : " + (rand.nextInt(45)+1));
        }
        int result = 0;
        for (int i = 1; i <= 100; i ++){
            result += i;
        }
        System.out.println(result);
    }

    public void testForExample3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 큰 정수 입력 : ");
        int input = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= input; i++) {
            result += i;
        }

        System.out.println("합계 : " + result );
    }


    public void testForExample4(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 큰 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("1보다 큰 정수 입력 : ");
        int num2 = sc.nextInt();
        int result = 0;

        int min;
        int max;
        if(num1 > num2){
            min = num2;
            max = num1;
        }else {
            min = num1;
            max = num2;
        }


        for (int i = min; i <= max; i++) {
            result += i;
        }

        System.out.println("합계 : " + result );
    }


    public void testForExample5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("1보다 큰 정수 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("1보다 큰 정수 입력 : ");
        int num2 = sc.nextInt();
        int result = 0;

        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            result += i;
        }

        System.out.println("합계 : " + result );
    }

}
