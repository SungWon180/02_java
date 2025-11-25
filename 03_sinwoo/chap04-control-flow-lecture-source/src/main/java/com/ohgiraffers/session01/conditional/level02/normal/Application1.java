package com.ohgiraffers.session01.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 ~ 10 사이의 정수를 입력하시오 : ");
        int input = sc.nextInt();

        if(input > 0 && input <= 10){
            if(input % 2 == 0){
                System.out.println("짝수입니다.");
            }else {
                System.out.println("홀수입니다.");
            }
        }else {
            System.out.println("1~10까지의 정수를 입력하시오");
        }
    }
}
