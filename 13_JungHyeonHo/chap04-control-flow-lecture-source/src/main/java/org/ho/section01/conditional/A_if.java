package org.ho.section01.conditional;

import java.util.Scanner;

public class A_if {
  /* if문
   *
   */

  /**
   * if문 단독 사용 흐름 확인
   */
  public void testSimpleIfStatement(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 하나 입력: ");
    int input = scanner.nextInt();

    if(input % 2 == 0){
      System.out.println("짝수");
    }else System.out.println("홀수");

    System.out.println("프로그램을 종료합니다.");
  }

  /* 중첩 if문 */
  public void testNestedIfStatement(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("정수 하나 입력: ");
    int input = scanner.nextInt();
    if(input > 0) {
      System.out.println("양의 정수 입니다");
      if (input % 2 == 0) {
        System.out.println("짝수");
      }
    } else System.out.println("음의 정수 입니다.");
    System.out.println("프로그램을 종료합니다.");
  }
}
