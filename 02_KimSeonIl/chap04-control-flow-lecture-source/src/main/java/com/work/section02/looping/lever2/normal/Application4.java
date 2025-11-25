package com.work.section02.looping.lever2.normal;

import java.util.Scanner;

public class Application4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;
    while (true) {
      System.out.println("2보다 큰 정수를 입력하세요");
      num = sc.nextInt();
      if (num > 2) {
        break;
      }else {
        System.out.println("잘못 입력하셨습니다. 다시 입력하세요");

      }
    }
    boolean isPrime =true;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        isPrime = false;
        break;
      }
    }




  }

}
