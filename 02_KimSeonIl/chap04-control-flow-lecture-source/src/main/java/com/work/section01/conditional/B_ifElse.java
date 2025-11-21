package com.work.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
  public void testSimpleIfElseStatement(){

    Scanner sc = new Scanner(System.in);
    System.out.println("정수 하나 입력 : ");
    int input = sc.nextInt();
    if(input %2 ==0){
      System.out.print("짝수");
    }else{ // 조건식이 false 일때
      System.out.print("홀수");
    }
  }

  // 중첩 if-else
  public void testNestedIfElseStatement(){

    Scanner sc = new Scanner(System.in);
    System.out.println("정수 하나 입력 : ");
    int input = sc.nextInt();
    if(input %2 ==0){
      if(input ==0){
        System.out.println("0 입니다.");
      }else{
        System.out.print("짝수");
      }
    }else{ // 조건식이 false 일때
      System.out.print("홀수");
    }
  }
}
