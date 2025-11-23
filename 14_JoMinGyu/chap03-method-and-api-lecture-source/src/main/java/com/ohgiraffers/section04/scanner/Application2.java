package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수 입력: ");
    int num = sc.nextInt();
    System.out.println("num = " + num);

    System.out.println("문자열(문장) 입력: ");
    String str = sc.nextLine();
    System.out.println("str = " + str);

    System.out.print("숫자 입력: ");
    int num2 = sc.nextInt();
    System.out.println("num2 = " + num2);
  }
}
