package com.work.section01.conditional.conditional.level02.normal;

import java.util.Scanner;

public class Application1 {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int num = sc.nextInt();

    if (num >= 1 && 10 >= num) {
      if (num % 2 == 0) {
        System.out.println("짝수");
      } else {
        System.out.println("홀수");
      }
    }else{
      System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
    }
  }

}
