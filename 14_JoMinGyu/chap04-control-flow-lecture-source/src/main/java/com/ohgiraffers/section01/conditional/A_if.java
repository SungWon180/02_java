package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class A_if {

  public void testSimpleIfStatement() {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 하나 입력: ");
    int input = sc.nextInt();

    if(input % 2 == 0) {
      System.out.println("입력하신 정수는 짝수입니다.");
    }

    System.out.println("프로그램을 종료합니다.");
  }

  public void testNestedIfStatement() {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 하나 입력: ");
    int input = sc.nextInt();

    if(input > 0) {
      if (input % 2 == 0) {
        System.out.println("입력하신 정수는 짝수입니다.");
      }
    }

    System.out.println("프로그램을 종료합니다.");
  }
}
