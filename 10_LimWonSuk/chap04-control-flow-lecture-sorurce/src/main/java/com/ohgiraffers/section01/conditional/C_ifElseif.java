package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    public void testIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 학생 이름 : ");
        String name = sc.nextLine();

        System.out.println(" 학생 성적 : ");
        int score = sc.nextInt();

        String grade = ""; // 비어있는 문자여열 선언, 여기에 등급 저장할 예정
        if (score >= 90) {
            grade = "A";
        } else if (score >= 90) {
            grade = "B";
        } else if (score >= 80) {
            grade = "C";
        } else if (score >= 70) {
            grade = "D";
        } else if (score >= 60) {

            grade = "E";
        } else {
            grade = "F";
        }


        System.out.println("name = " + name);
        System.out.println("score = " + score);
        System.out.println("grade = " + grade);


    }


    /* 중첩 if -A+, B+, C+ */
    public void testNestedIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 학생 이름 : ");
        String name = sc.nextLine();

        System.out.println(" 학생 성적 : ");
        int score = sc.nextInt();

        String grade = ""; // 비어있는 문자여열 선언, 여기에 등급 저장할 예정

        // {} = 블럭 생략 시 다음 한 줄 (;까지)을 if문 구문으로 취급한다

        if (score >= 90) {
            grade = "A";
            if (score >= 95) grade += "+";
            {
                grade = "B";
            }
        } else if (score >= 90) {
            grade = "B";
            if (score >= 95) grade += "+";
        } else if (score >= 80) {
            grade = "C";
            if (score >= 85) grade += "+";
        } else if (score >= 70) {
            grade = "D";
            if (score >= 75) grade += "+";
        } else if (score >= 60) {

            grade = "E";
            if (score >= 55) grade += "+";
        } else {
            grade = "F";
        }


        System.out.println("name = " + name);
        System.out.println("score = " + score);
        System.out.println("grade = " + grade);


    }
    /* 등급에 +를 추가하는 다른 방법 */

    public void imporveIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 학생 이름 : ");
        String name = sc.nextLine();

        System.out.println(" 학생 성적 : ");
        int score = sc.nextInt();

        String grade = ""; // 비어있는 문자여열 선언, 여기에 등급 저장할 예정
        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score >= 50) {

            grade = "E";
        } else {
            grade = "F";
        }

        if (score >= 60 && score % 10 >= 5 || score == 100) { // || = or 연산자
            grade += "+";
        }

        System.out.println("name = " + name);
        System.out.println("score = " + score);
        System.out.println("grade = " + grade);


    }
}
