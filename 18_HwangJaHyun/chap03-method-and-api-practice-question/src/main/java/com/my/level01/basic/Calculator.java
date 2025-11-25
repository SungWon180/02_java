package com.my.level01.basic;

import java.util.Scanner;

public class Calculator {

  public void checkMethod(){
    System.out.println(" 메소드 호출 확인");
  }

  public int sum1to10(){
    int sum=0;
    for(int i=1;i<=10;i++){
      sum+=i;
    }
  return sum;
  }

  /**
   *
   * @param a
   * @param b
   */
  public void checkMaxNumber(int a, int b){
    Scanner sc=new Scanner(System.in);
    int max = 0;

    if(a>b){
      max = a;
    }else{
      max = b;
    }
    System.out.println("두 수 중 큰 수는 " + max + "이다.");
  }

  /**
   *
   * @param a
   * @param b
   * @return
   */
  public int sumTwoNumbers(int a, int b){
    return a + b;
  }

  /**
   *
   * @param a
   * @param b
   * @return
   */
  public int minusTwoNumbers(int a, int b){
    return a - b;
  }
}
