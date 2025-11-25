package com.my.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
  public void testIfElseIfElseStatement() {
    Scanner sc = new Scanner(System.in);
    System.out.print("학생 이름: ");
    String name = sc.nextLine();

    System.out.println("학생 성적: ");
    int score = sc.nextInt();

    String grade = ""; //비어있는 문자열 선언, 여기에 등급 저장할 예정

    if(score >= 90){
      grade = "A";
    }else if(score >= 80){
      grade = "B";
    }else if(score >= 70){
      grade = "C";
    }else if(score >= 60){
      grade = "D";
    }else{
      grade = "F";
    }
    System.out.println("name = " + name);
    System.out.println("score = " + score);
    System.out.println("grade = " + grade);
  }

  /* 중첩 if 문 */
  public void testNestedIfElseIfElseStatement() {
    Scanner sc = new Scanner(System.in);
    System.out.print("학생 이름: ");
    String name = sc.nextLine();

    System.out.println("학생 성적: ");
    int score = sc.nextInt();

    String grade = ""; //비어있는 문자열 선언, 여기에 등급 저장할 예정

    // {} 생략 시 다음 한 줄(;)까지 실행됨
    if(score >= 90){
      grade = "A";
      if(score >= 95) grade += "+";
    }else if(score >= 80){
      grade = "B";
      if(score >= 85) grade += "+";
    }else if(score >= 70){
      grade = "C";
      if(score >= 75) grade += "+";
    }else if(score >= 60){
      grade = "D";
      if(score >= 65) grade += "+";
    }else{
      grade = "F";
    }
    System.out.println("name = " + name);
    System.out.println("score = " + score);
    System.out.println("grade = " + grade);
  }


  /* 중첩 if 문 */
  public void improveIfElseIfElseStatement() {
    Scanner sc = new Scanner(System.in);
    System.out.print("학생 이름: ");
    String name = sc.nextLine();

    System.out.println("학생 성적: ");
    int score = sc.nextInt();

    String grade = ""; //비어있는 문자열 선언, 여기에 등급 저장할 예정

    // {} 생략 시 다음 한 줄(;)까지 실행됨
    if(score >= 90){
      grade = "A";
    }else if(score >= 80){
      grade = "B";
    }else if(score >= 70){
      grade = "C";
    }else if(score >= 60){
      grade = "D";
    }else{
      grade = "F";
    }

    if(score >= 60 && score % 10 >=5 || score == 100){
      grade += "+";
    }

    System.out.println("name = " + name);
    System.out.println("score = " + score);
    System.out.println("grade = " + grade);
   }

}
