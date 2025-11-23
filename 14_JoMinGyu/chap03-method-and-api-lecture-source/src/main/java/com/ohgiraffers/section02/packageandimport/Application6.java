package com.ohgiraffers.section02.packageandimport;

public class Application6 {
  public static void main(String[] args) {
    Application6 application6 = new Application6();

    int num1 = 100;
    int num2 = 7;

    System.out.println("num1 + num2 = " + application6.plusTwoNumbers(num1, num2));
    System.out.println("num1 - num2 = " + application6.minusTwoNumbers(num1, num2));
    System.out.println("num1 * num2 = " + application6.multipleTwoNumbers(num1, num2));
    System.out.println("num1 / num2 = " + application6.divideTwoNumbers(num1, num2));
    System.out.println("num1 % num2 = " + application6.moduloTwoNumbers(num1, num2));
  }

  public int plusTwoNumbers(int a, int b) {
    return a + b;
  }

  public int minusTwoNumbers(int a, int b) {
    return a - b;
  }

  public int multipleTwoNumbers(int a, int b) {
    return a * b;
  }

  public int divideTwoNumbers(int a, int b) {
    return a / b;
  }

  public int moduloTwoNumbers(int a, int b) {
    return a % b;
  }


}
