package com.work.section02.looping.lever2.normal;

import java.util.Scanner;

public class Application5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = (int)(Math.random()*100)+1;
    int num2 = sc.nextInt();
    System.out.println("입력한 정수 : " + num2);
    System.out.println("발생한 난수 : " + num);
    if (num2 > num) {
      System.out.println("입력 받은 정수가 발생한 난수보다 큽니다.");
    }
  }

}
