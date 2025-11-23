package com.ogiraffers.session04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        // scanner 사용시 주의사항
        Scanner sc = new Scanner(System.in);

        // 1. 개행문자
        System.out.print("점수 입력 : ");
        int num = sc.nextInt();
        System.out.println("num = " + num);

        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();
        System.out.println("str = " + str);

        // 3. scanner
        System.out.print("문자 1개 입력 : ");
        // char String.charAt(0) : 문자열에서 지정된 인덱스번째 문자 한개를 char type으로 반환.
        char ch = sc.next().charAt(0);


    }
}
