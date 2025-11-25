package com.ohgiraffers.level01.basic;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();

    calculator.checkMethod();
    int sum;
    sum = calculator.sum1to10();
    System.out.println("1부터 10까지의 합 : " + sum);

    int a;
    int b;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    calculator.checkMaxNumber(a, b);

    a = sc.nextInt();
    b = sc.nextInt();
    sum = calculator.sumTwoNumber(a, b);
    System.out.println(a + "과 " + b + "의 합은 : " + sum);

    a = sc.nextInt();
    b = sc.nextInt();
    int sub;
    sub = calculator.minusTwoNumber(a, b);
    System.out.println(a + "과 " + b + "의 차는 : " + sub);
  }
}
