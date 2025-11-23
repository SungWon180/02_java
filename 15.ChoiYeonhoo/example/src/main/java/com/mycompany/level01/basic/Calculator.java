package com.mycompany.level01.basic;

public class Calculator {
  public void checkMethod(){
    System.out.println("시스템 호출 확인");
  }

  public int sum1to10(){
    int sum = 0;
    for(int i = 1; i <= 10; i++){
      sum += i;
    }
    return sum;
  }

  public void checkMaxNumber(int a, int b){
  System.out.println("큰 수" + Math.max(a,b));
  }

  public int sumTwoNumber(int a, int b){
  return a + b;
  }

  public int minusTwoNumber(int a, int b){
    return a - b;
  }
}
