package com.ohgiraffers.session01.conditional;

import java.util.Scanner;

public class C_Elseif {

    public void testIfElseIfStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("학생 이름 : ");
        String name = sc.nextLine();

        System.out.print("성적 : ");
        int score = sc.nextInt();

        String grade = "";

        if(score >= 90){
            grade = "A";
        }else if(score >= 80){
            grade = "B";
        }else if (score >= 70){
            grade = "C";
        }else {
            grade = "D";
        }
    }

}
