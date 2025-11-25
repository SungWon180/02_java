package com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    C_while c_while = new C_while();
    //c_while.testSimpleWhileStatement();
    //c_while.testWhileExample1();
    //c_while.testSimpleDoWhileStatement();

    Scanner sc = new Scanner(System.in);
    int input = 0;

    do {
      System.out.println("===== while 예시 선택 메뉴 =====");
      System.out.println("1. testSimpleWhileStatement()");
      System.out.println("2. testWhileExample1()");
      System.out.println("3. testSimpleDoWhileStatement()");
      System.out.println("0. 종료");
      System.out.println("메뉴 번호 입력>>");
      input = sc.nextInt();

    } while (input != 0);

    switch (input) {
      case 1: c_while.testSimpleWhileStatement(); break;
      case 2: c_while.testWhileExample1(); break;
      case 3: c_while.testSimpleDoWhileStatement();break;
      case 0:
        System.out.println("===== 프로그램 종료 ====="); break;
      default:
        System.out.println("메뉴에 없는 번호를 입력함");
    }
  }
}

