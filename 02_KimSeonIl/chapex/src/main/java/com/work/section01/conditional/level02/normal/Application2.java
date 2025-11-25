package com.work.section01.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("신장을 입력하세요 단위 : m");
    double height = sc.nextInt();
    System.out.println("몸무게를 입력하세요");
    int weight = sc.nextInt();

    double BMI = weight / (height * height);
    System.out.println(BMI);
    System.out.println(170/100);
  }
}
