package com.mycompany.section01.conditional;

import java.util.Scanner;

public class B_ifElse {

  /* if - else 확인 */
  public void testSimpleIfElseStatement() {
    
    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 하나 입력: ");
    int input = scanner.nextInt();
    scanner.nextLine();

    /* 홀짝 판별 */
    if (input % 2 == 0){
      System.out.println("짝수 입니다");
    } else { // 조건식이 false 인 경우
      System.out.println("홀수 입니다.");
    }

  }

  /* 중첩 if-else */
  public void testNestedIfElseStatement() {

    Scanner scanner = new Scanner(System.in);
    System.out.println("정수 하나 입력: ");
    int input = scanner.nextInt();
    scanner.nextLine();

    /* 홀짝 판별 */
    if (input % 2 == 0){
      if(input == 0) {
        System.out.println("0 입니다");

      }
      else {
        System.out.println("짝수 입니다");
      }
    }
    else { // 조건식이 false 인 경우
      System.out.println("홀수 입니다.");
    }

  }
}
