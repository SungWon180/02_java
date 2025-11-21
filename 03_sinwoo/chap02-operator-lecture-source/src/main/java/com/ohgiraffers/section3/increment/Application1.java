package com.ohgiraffers.section3.increment;

public class Application1 {
    public static void main(String[] args) {
        /* 증가 감소 연산자
        *  ++, --
        *  1씩 증가, 감소
        *  전위/후위 연산이 존재
        *  전위 연산 : 모든 연산 중 제일 먼저 연산을 수행
        *  후위 연산 : 모든 연산 중 제일 마지막에 연산을 수행
        * */

        /* 단항으로 사용될 때는 1 증가/1 감소의 의미를 가진다. */
        int num = 20;
        System.out.println("num : " + num);

        num++;		//1 증가
        System.out.println("num : " + num);

        ++num;		//1 증가
        System.out.println("num : " + num);

        num--;		//1 감소
        System.out.println("num : " + num);

        --num;		//1 감소
        System.out.println("num : " + num);

        int firstNum = 20;

        int result1 = firstNum++ * 3;			//다른 연산을 먼저 처리 하고 난 뒤 마지막에 증가 처리가 됨

        System.out.println("result1 : " + result1);
        System.out.println("firstNum : " + firstNum);

        int secondNum = 20;

        int result2 = ++secondNum * 3;			//증가를 먼저 처리하고 난 뒤 다른 연산을 함

        System.out.println("result2 : " + result2);
        System.out.println("secondNum : " + secondNum);

        int num1 = 10;
        int addNum = num1++;
        System.out.println("addNum : " + addNum);

        int a = 3;
        int b = ++a +5;
        int c = b-- + a + 1;
        int result = a++ + b-- - --c;
        System.out.println( "a : " + a);
        System.out.println( "b : " + b);
        System.out.println( "c : " + c);
        System.out.println("result : " + result);
    }
}
