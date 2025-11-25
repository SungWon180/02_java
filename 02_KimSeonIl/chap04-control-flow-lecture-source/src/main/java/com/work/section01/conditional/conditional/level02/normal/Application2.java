package com.work.section01.conditional.conditional.level02.normal;

import java.util.Scanner;

public class Application2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("키를 입력하세요 (단위:M)");
    double height = sc.nextDouble();
    System.out.println("체중을 입력하세요");
    int weight = sc.nextInt();

    double BMI = Math.round(weight/(height*height));
    System.out.println("당신의 BMI 지수는"+ BMI +"입니다.");

    if (BMI < 20) {
      System.out.println("당신은 저체중");
    } else if (BMI >= 20 && 25 > BMI) {
      System.out.println("당신은 정상체중");
    } else if (BMI >= 25 && 30 > BMI) {
      System.out.println("당신은 과체중");
    } else {
      System.out.println("당신은 비만입니다.");

    }


  }

}
