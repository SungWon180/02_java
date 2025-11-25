package com.ohgiraffers.level01.basic;

public class Calculator {

  public void checkMethod() {
    System.out.println("메서드 호출 확인");
    return;
  }

  public int sum1to10() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  public void checkMaxNumber(int a, int b) {
    System.out.print("두 수 중 큰 수는 ");
    if(a>b) {
      System.out.print(a);
    }
    else {
      System.out.print(b);
    }
    System.out.println("이다.");
    return;
  }

  public int sumTwoNumber(int a, int b) {
    return a + b;
  }

  public int minusTwoNumber(int a, int b) {
    return a - b;
  }

}
