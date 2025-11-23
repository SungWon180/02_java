package com.google.section01.method;

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

  public int plusTwoNumbers(int first, int second) {
    return first + second;
  }

  public int minusTwoNumbers(int first, int second) {
    return first - second;
  }

  public int multipleTwoNumbers(int first, int second) {
    return first * second;
  }

  public int divideTwoNumbers(int first, int second) {
    return first / second;
  }

  public int moduloTwoNumbers(int first, int second) {
    return first % second;
  }
}
