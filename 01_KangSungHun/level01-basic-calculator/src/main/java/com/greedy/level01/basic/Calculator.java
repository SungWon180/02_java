package com.greedy.level01.basic;

import java.util.Scanner;

public class Calculator {


  public void checkMethod() {


  }

  public void sum1to10() {
    int sum = 0;
    for (int num = 0; num <= 10; num++) {
      sum += num;
    }
    System.out.println(sum);

  }

  public void checkMaxNumber() {

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 번째 수 입력: ");
    int num1 = sc.nextInt();
    System.out.print("두 번째 수 입력: ");
    int num2 = sc.nextInt();

    int max;
    int min;

    if (num1 > num2) {
      max = num1;
      min = num2;
    } else if (num1 < num2) {
      max = num2;
      min = num1;
    } else {
      System.out.println("두 수가 같습니다. 다시 해주세요.");
    }
    return;
  }

  public int sumTwoNumber() {

    Scanner sc = new Scanner(System.in);

    System.out.print("첫 수를 입력: ");
    int num3 = sc.nextInt();
    System.out.println("두 번째 수를 입력: ");
    int num4 = sc.nextInt();

    System.out.println(num3 + num4);
    return num3 + num4;
  }

  public int minusTwoNumber() {
    Scanner sc = new Scanner(System.in);

    System.out.print("첫 수를 입력: ");
    int num3 = sc.nextInt();
    System.out.println("두 번째 수를 입력: ");
    int num4 = sc.nextInt();

    System.out.println(num3 - num4);
    return num3 - num4;

  }
}





