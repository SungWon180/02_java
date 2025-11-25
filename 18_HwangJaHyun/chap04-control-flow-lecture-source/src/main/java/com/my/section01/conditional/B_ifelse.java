package com.my.section01.conditional;

import java.util.Scanner;

public class B_ifelse {
  /* if - else 확인 */
  public void testSimpleIfElseStatement(){
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 하나 입력: ");
    int input = sc.nextInt();

    /* 홀짝 판별 */
    if(input % 2 == 0){
      System.out.println("짝수 입니다.");
    }else{
      System.out.println("홀수 입니다.");
    }
  }

  public void testNestIfElseStatement(){
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 하나 입력: ");
    int input = sc.nextInt();

    /* 홀짝 판별 */
    if(input % 2 == 0){
      if(input == 0){
        System.out.println("0입니다.");
      }else{
        System.out.println("짝수 입니다.");
      }
    }else{
      System.out.println("홀수 입니다.");
    }
  }
}
