package com.work.section01.conditional.conditional.level02.normal;

import java.util.Scanner;

public class Application3 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수를 입력하세요");
    int num1 = sc.nextInt();

    System.out.println("두번째 정수를 입력하세요");
    int num2 = sc.nextInt();

    System.out.println("연산 기호를 입력하세요");
    char op = sc.next().charAt(0);

    System.out.println("첫번째 정수 : " + num1);
    System.out.println("두번째 정수 : " + num2);
    System.out.println("연산 기호 : " + op);

    if (op == '+') {
      System.out.println("결과 : " + num1 + "+" + num2 + "=" + (num1 + num2));
    } else if (op == '-') {
      System.out.println("결과 : " + num1 + "-" + num2 + "=" + (num1 - num2));
    } else if (op == '*') {
      System.out.println("결과 : " + num1 + "*" + num2 + "=" + (num1 * num2));
    } else if (op == '/') {
      if (num2 == 0) {
        System.out.println("0으로 나눌수 없다");
        return;
      }
      System.out.println("결과 : " + num1 + "/" + num2 + "=" + (num1 / num2));
    }else{
      System.out.println("잘못된 연산자입니다.");
    }
  }

}
