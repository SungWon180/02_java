package com.work.section01.arithmetic;

public class Application1 {
  public static void main(String[] args) {
//    산술 연산자 : + - * / %
      int num1 = 20;
      int num2 = 7;
//      int a = 10, b = 20, c= 30; 가독성 문제때문에 안쓴다

    System.out.println("num1 + num2 = " + (num1 + num2));
    System.out.println("num1 - num2 = " + (num1 - num2));
    System.out.println("num1 * num2 = " + num1 * num2);
    System.out.println("num1 / num2 = " + num1 / num2);
    System.out.println("num1 % num2 = " + num1 % num2);

    System.out.println(num1 + num2 * 2 / 3 % (3 + 4));
  }
}
