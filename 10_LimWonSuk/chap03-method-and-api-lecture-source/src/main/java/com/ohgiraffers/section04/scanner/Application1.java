package com.ohgiraffers.section04.scanner;

import java.util.Scanner; // class 문서(설계도)만 가져옴

public class Application1 {
    public static void main(String[] args) {
        /* Java.util.scanner
        * - Java 에서 제공하는 간단한 텍스트 스캐너(입력장치)
        * */

        /* 1. Scanner 객체 생성 
        * JVM 안에 내 키보드를 인식하는 장치생성*/
        Scanner sc = new Scanner(System.in); // class 문서를보고 new 생성 -> JVM 안에 Scanner 생성

        /* 2. 자료형별 값 입력 받기
        * 2-1. 문자열(단어)입력 받기*/
        System.out.print("이름 입력 : ");
        String name = sc.next(); // 다음 입력된 '첫번째' 토큰을 읽어와 문자열로 반환 그래서 문자열인 String name 사용
        sc.nextLine(); // 입력 문제 해결 (나중에 설명)
        System.out.println("name = " + name);

        /*  2-2. 문장 입력 받기*/
        System.out.print("주소 입력 : ");
        String address = sc.nextLine(); // 엔터가 입력되기 전까지의 '모든' 토큰을 읽어와 문자열로 반환
        System.out.println("address = " + address);

        /* 2-3 정수 입력 받기
        * int(정수) 가아닌 다른 자료형 입력 시 Mismath  발생
        * int(정수) 범위를 초과하는 정수 입력시 Mismath  발생*/
        System.out.print("나이 입력 : ");
         int age = sc.nextInt(); // 다음 입력된 '첫번째' 토큰을 읽어와 'int'로 반환
        System.out.println("age = " + age);

        /* 2-4 실수 입력 받기
        * double(실수) 가아닌 다른 자료형 입력 시 Mismath  발생
        * double(실수) 범위를 초과하는 정수 입력시 Mismath  발생 */
        System.out.print("키 입력 : ");
       double height = sc.nextDouble();
        System.out.println("height = " + height);


        /* 2-5. 논리 값 입력 받기
        *
        * */
        System.out.print("true/false 중 하나 입력 : " );
        boolean isTrue = sc.nextBoolean();
        System.out.println("isTrue = " + isTrue );


    }
}

