package com.work.section01.conditional.conditional.level02.normal;

import java.util.Scanner;

public class Application5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("급여를 입력하세요");
    int salary = sc.nextInt();

    System.out.println("매출을 입력하세요.");
    int sales = sc.nextInt();

    double bonusrate = 0;
    if (sales >= 50000000) {
      bonusrate = 0.05;
    } else if (sales >= 30000000) {
      bonusrate = 0.03;
    } else if (sales >= 10000000) {
      bonusrate = 0.01;
    } else if (sales < 10000000) {
      bonusrate = 0;
    }

    int bonus = (int)(sales *bonusrate);

    System.out.println("매출 : " + sales);
    System.out.println("보너스 율 : " + (int)(bonusrate*100) +"%");
    System.out.println("급여 : " + salary);
    System.out.println("보너스 금액 : " + bonus);

    System.out.println("총 급여 : " + (int)(salary + bonus) );

  }

}
