    /* Q1 Homework
     *1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
     * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
     * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
     * */

    /* Q2 Homework1
     *BMI(신체질량지수)를 계산하고, 계산된 값에 따라
     * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
     * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
     * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
     * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
     *
     * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
     *
     * 계산 예시) BMI = 67 / (1.7 * 1.7)
     * */

    package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class Homework
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("1~10 까지 더하시오");
        int num = input.nextInt();

        if(num == 10)
        {
            System.out.println("num = " + num);
        }
        else if(num < 10)
        {
            System.out.println("num = " + num);
        }
        else
        {
            if (num % 2== 0)
            System.out.println("짝수");
        }
             {
        System.out.println("짝수");
    }



    }

    public class Homework1 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("체중 입력하시오 (KG)");
            double money = input.nextDouble(); // kg가 안되서 자동완성으로 했어요

            System.out.println("키를 입력하세요 (CM)");
            double cash = input.nextDouble(); // cm가 안되서 자동완성으로 했어요

            double money2 = cash / (money * money);
            System.out.println("당신의 BMI는" +  money2 + "입니다" );
        }
    }

}