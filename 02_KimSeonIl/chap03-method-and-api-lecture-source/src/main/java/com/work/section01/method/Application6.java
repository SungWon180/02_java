package com.work.section01.method;

//컴파일시 컴파일러가 자동 추가
import  java.lang.*;

public class Application6 {
  public static void main(String[] args) {

  int num1 =10;
  int num2 = 20;

  Application6 app6 = new Application6();
    System.out.println("num1 + num2 = " + app6.plusTwoNumbers(num1,num2));
    System.out.println("num1 - num2 = " + app6.MinusTwoNumbers(num1,num2));
    System.out.println("num1 * num2 = " + app6.MultipleTwoNumbers(num1,num2));
    System.out.println("num1 / num2 = " + app6.DevideTwoNumbers(num1,num2));
    System.out.println("num1 % num2 = " + app6.moduloTwoNumbers(num1,num2));
  }

  public int plusTwoNumbers(int first, int second) {
    return first + second;
  }

  public int MinusTwoNumbers(int first, int second) {
    return first - second;
  }

  public int MultipleTwoNumbers(int first, int second) {
    return first * second;
  }

  public int DevideTwoNumbers(int first, int second) {
    return first / second;
  }

  public int moduloTwoNumbers(int first, int second) {
    return first % second;
  }


}
