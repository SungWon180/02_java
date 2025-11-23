package com.ohgiraffers.session06.ternary;

public class Application1 {
    public static void main(String[] args) {
        // 삼항 연산자
        // (조건식) ? true인 경우 : false인 경우
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0)? "양수다.": "양수가 아니다.";
        String result2 = (num2 > 0)? "양수다.": "양수가 아니다.";

        System.out.println("num1은 " + result1);
        System.out.println("num2는 " + result2);

        /* 중접 사용도 가능하다. */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;

        String result3 = (num3 > 0)? "양수다.": (num3 == 0)? "0이다.":"음수다.";
        String result4 = (num4 > 0)? "양수다.": (num4 == 0)? "0이다.":"음수다.";
        String result5 = (num5 > 0)? "양수다.": (num5 == 0)? "0이다.":"음수다.";

        System.out.println("num3은 " + result3);
        System.out.println("num4는 " + result4);
        System.out.println("num5는 " + result5);

        char gender1 = '남';
        char gender2 = '여';

        String result6 = (gender1 == '남') ? "남자입니다" : "여자입니다";
        System.out.println("result6 = " + result6);

        System.out.println("====삼항 연산자 중첩 사용====");
        int num = 0;
        String result123123 = num == 0 ? "0입니다" : (num>0 ? "양수입니다" : "음수입니다");
        System.out.println("result123123 = " + result123123);
    }

}
