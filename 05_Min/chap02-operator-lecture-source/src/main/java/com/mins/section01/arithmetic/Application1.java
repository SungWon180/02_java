package com.mins.section01.arithmetic;

public class Application1 {
  public static void main(String[] args) {

    /* 산술 연산잔 + - * / % */
    int num1 = 20;
    int num2 = 7;
    int a, b, c;

    System.out.println("num1 + num2 = " + (num1 + num2));
    System.out.println("num1 - num2 = " + (num1 - num2));
    System.out.println("num1 * num2 = " + (num1 * num2));
    System.out.println("num1 / num2 = " + (num1 / num2));
    System.out.println("num1 % num2 = " + (num1 % num2));

    System.out.println(num1 + num2 * 2 / 3 % (3 +4));
  }
}
