package com.jinosoft.level01.basic;

public class Calculator {
  public void checkMethod() {
    System.out.println("메소드 호출 확인");
  }

  // 1부터 10까지 합
  public int sum1to10() {
    int sum = 0;
    for(int i = 1; i <= 10; i++) {
      sum += i;
    }
    return sum;
  }

  // 두수 중 큰수 출력
  public void checkMaxNumber(int a, int b) {
    if(a > b) {
      System.out.println("두 수 중 큰 수는 " + a + "이다.");
    } else {
      System.out.println("두 수 중 큰 수는 " + b + "이다.");
    }
  }

  // 두 수의 합
  public int sumTwoNumber(int a, int b) {
    return a + b;
  }

  // 두 수의 차 리턴
  public int minusTwoNumber(int a, int b) {
    return a - b;
  }
}
