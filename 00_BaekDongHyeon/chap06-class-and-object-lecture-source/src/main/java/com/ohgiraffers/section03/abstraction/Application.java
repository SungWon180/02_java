package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class Application {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    CarRacer carRacer = new CarRacer();

    label:
    while(true) {
      System.out.println("===== 카레이싱 프로그램 =====");
      System.out.println("1. 시동걸기");
      System.out.println("2. 전진");
      System.out.println("3. 정지");
      System.out.println("4. 시동끄기");
      System.out.println("9. 프로그램 종료");
      System.out.print("메뉴 선택 : ");
      int no = scanner.nextInt();

      switch (no) {
        case 1: carRacer.startUp(); break;
        case 2: carRacer.stepAccelerator(); break;
        case 3: carRacer.stepBreak(); break;
        case 4: carRacer.turnOff(); break;
        case 9:
          System.out.println("프로그램을 종료합니다."); break label;
        default:
          System.out.println("잘못 된 번호를 선택하셨습니다.");
      }
    }
  }
}
