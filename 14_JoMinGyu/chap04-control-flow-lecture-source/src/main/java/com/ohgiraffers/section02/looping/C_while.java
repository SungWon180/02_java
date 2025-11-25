package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class C_while {
  public void testSimpleWhileStatement() {
    for (int i = 0; i < 10; i++) {
      System.out.println("i = " + i);
    }
    return;
  }

  public void testWhileExample1() {
    Scanner sc = new Scanner(System.in);

    String input = "";

    while(!input.equals("exit")) {
      System.out.print("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"");
    }
    System.out.println("===== 프로그램 종료 =====");
  }

  public void testSimpleDoWhileStatement() {
    Scanner sc = new Scanner(System.in);

    String input = "exit";

    do {
      System.out.print("문자열 입력: ");
      input = sc.nextLine();
      System.out.println("입력 받은 문자열: \"" + input + "\"");
    } while(!input.equals("exit"));
    System.out.println("===== 프로그램 종료 =====");
  }
}

