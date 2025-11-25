package com.work.section01.conditional.conditional.level02.normal;

import java.util.Scanner;

public class Application4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("과일 이름을 입력하세요");
    String fruit  = sc.nextLine();
    int price;
    if (fruit.equals("사과")) {
      price = 1000;
      System.out.println(fruit + "의 가격은" + price + " 원 입니다.");
    } else if (fruit.equals("바나나")) {
      price = 3000;
      System.out.println(fruit + "의 가격은" + price + " 원 입니다.");
    } else if (fruit.equals("복숭아")) {
      price = 2000;
      System.out.println(fruit + "의 가격은" + price + " 원 입니다.");
    } else if (fruit.equals("키위")) {
      price = 5000;
      System.out.println(fruit + "의 가격은" + price + " 원 입니다.");
    }else {
      System.out.println("잘못된 과일 입력");
    }

  }

}
